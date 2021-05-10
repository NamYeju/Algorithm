package 프로그래머스.정렬.가장큰수;

import java.util.ArrayList;

public class Solution {
	public static void main(String args[]) {
		int[] numbers = {3,30,34,5,9};
		System.out.print(solution(numbers));
	}
    public static String solution(int[] numbers) {
        String answer = "";
        ArrayList <Integer> list = new ArrayList<Integer>();
        //배열 원소의 맨 앞자리 숫자 비교
        int temp=0;
        int pos=0;
        int compare=0;
        for(int i=numbers.length-1; i>0; i--) {
        	for(int j=0;j<i;j++) {
        		
        		
        		if(numbers[j]>=0&&numbers[j]<10)
        			pos = numbers[j];
        		if(numbers[j]>=10&&numbers[j]<100)
        			pos = numbers[j]/10;
        		if(numbers[j]>=100&&numbers[j]<1000)
        			pos = numbers[j]/100;
        		if(numbers[j]==1000)
        			pos = numbers[j]/1000;
        		
        		if(numbers[j+1]>=0&&numbers[j+1]<10)
        			compare = numbers[j+1];
        		if(numbers[j+1]>=10&&numbers[j+1]<100)
        			compare = numbers[j+1]/10;
        		if(numbers[j+1]>=100&&numbers[j+1]<1000)
        			compare = numbers[j+1]/100;
        		if(numbers[j+1]==1000)
        			compare = numbers[j+1]/1000;
        			
        			
        		if(pos > compare) {
        			temp = pos;
        			pos = compare;
        			compare = temp;
        		}
        		if(pos == compare) {
            		if(numbers[j]%10 > numbers[j+1]%10) {
            			temp = numbers[j];
            			numbers[j] = numbers[j+1];
            			numbers[j+1] = temp;
            		}
        		}
        	}
        }
        for(int i=0; i<numbers.length; i++) {
        	System.out.print(numbers[i]+"\n");
        }
        return answer;
    }

}
/*
 일의 자리 수든, 백의자리수든, 맨 앞 숫자가 제일 큰거부터 와야됨
 만약 숫자가 같다면 그 다음 숫자 비교
 0은 null보다 하위로 취급  (3, 30)-> 330
 나머지는 위의 원리와 동일 (30, 3052)-> 5가 null보다 크므로 305230 
 30 = 3*10 => 30/10
 301 = 3*100+1 => (301-1)/10^2
 ---
 기본적인 로직
 3 30 34 5 9
 s1 [3]
 s2 [3][0]
 s3 [3][4]
 s4 [5]
 s5 [9]
 
 1. 0번째 인덱스 비교 s5, s4
 2. 같은 인덱스(3) 존재시 다음 인덱스 비교 s3, s2
 (만약에 인덱스는 같은데 길이가 제일 짧으면 가장 높은 우선순위 => s1,s3,s2)
 
 ===> s5 s4 s1 s3 s2 
 
 그렇다면 각 수를 각각 배열에 넣는 방법은? while 나머지가 10보다 작을 때 까지
 
 
*/