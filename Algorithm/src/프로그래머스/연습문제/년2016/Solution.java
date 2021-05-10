package 프로그래머스.연습문제.년2016;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("a,b값을 입력하세요");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print(solution(a,b));
	}
	
    public static String solution(int a, int b) {
        String answer = "";

        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int total = 0;
        int index;
              
        if(a!=1) {
	        for(int i=1; i<a; i++){
	        	
	        	total+=date[i-1];
	        }
        }
        index = (total+b)%7; 
        
        if(index == 0)
        	answer = day[6];
        else
        	answer = day[index-1];
       
        
      
        return answer;
    }
}

