package ���α׷��ӽ�.��������.������ڰ�������;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("s���� �Է��ϼ���");
		s = sc.nextLine();
		System.out.print(solution(s));
	}
	
    public static String solution(String s) {
    	String answer = "";
    	
    	if(s.length()%2==0) {
    		
    		answer = s.substring(s.length()/2-1,s.length()/2+1);
    	
    	}
    	if(s.length()%2==1) {
    		answer = s.substring(s.length()/2,s.length()/2+1);
        	
    	}
        
        return answer;
    }
}
