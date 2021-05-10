package 프로그래머스.연습문제.수박수박수박;

import java.util.Scanner;

public class Solution {

	
	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("n값을 입력하세요");
		n = sc.nextInt();
		System.out.print(solution(n));
		
	}
	
	public static String solution(int n) {
		String answer="";
		

			for(int i=1;i<=(n/2);i++){
				answer+="수박";
			}
				if(n%2 == 0)
					return answer;
				else if(n%2 == 1)
					answer+="수";
			
		
		return answer;
	}
}

