package ���α׷��ӽ�.����.����ū��;

import java.util.ArrayList;

public class Solution {
	public static void main(String args[]) {
		int[] numbers = {3,30,34,5,9};
		System.out.print(solution(numbers));
	}
    public static String solution(int[] numbers) {
        String answer = "";
        ArrayList <Integer> list = new ArrayList<Integer>();
        //�迭 ������ �� ���ڸ� ���� ��
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
 ���� �ڸ� ����, �����ڸ�����, �� �� ���ڰ� ���� ū�ź��� �;ߵ�
 ���� ���ڰ� ���ٸ� �� ���� ���� ��
 0�� null���� ������ ���  (3, 30)-> 330
 �������� ���� ������ ���� (30, 3052)-> 5�� null���� ũ�Ƿ� 305230 
 30 = 3*10 => 30/10
 301 = 3*100+1 => (301-1)/10^2
 ---
 �⺻���� ����
 3 30 34 5 9
 s1 [3]
 s2 [3][0]
 s3 [3][4]
 s4 [5]
 s5 [9]
 
 1. 0��° �ε��� �� s5, s4
 2. ���� �ε���(3) ����� ���� �ε��� �� s3, s2
 (���࿡ �ε����� ������ ���̰� ���� ª���� ���� ���� �켱���� => s1,s3,s2)
 
 ===> s5 s4 s1 s3 s2 
 
 �׷��ٸ� �� ���� ���� �迭�� �ִ� �����? while �������� 10���� ���� �� ����
 
 
*/