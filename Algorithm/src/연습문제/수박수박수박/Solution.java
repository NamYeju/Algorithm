package ��������.���ڼ��ڼ���;

import java.util.Scanner;

public class Solution {

	
	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("n���� �Է��ϼ���");
		n = sc.nextInt();
		System.out.print(solution(n));
		
	}
	
	public static String solution(int n) {
		String answer="";
		

			for(int i=1;i<=(n/2);i++){
				answer+="����";
			}
				if(n%2 == 0)
					return answer;
				else if(n%2 == 1)
					answer+="��";
			
		
		return answer;
	}
}

