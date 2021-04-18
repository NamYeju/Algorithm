package 백준알고리즘.문자열._8진수2진수;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String num;
		String str3="";
		String answer="";
		String a ="";
		num = sc.next();
		String[] str = new String[num.length()];

		for(int i=0; i< num.length(); i++) { //숫자 한자리씩 분리 
			str3 = "";
			a = "";
			a = Integer.toBinaryString(num.charAt(i)-'0');
			//str[i]= Integer.toBinaryString(a);
			if(a.length()!=3) {
				if(a.length()==1) { 
					str3 += "00";
					str3 += a;
					answer += str3;
				}
				if(a.length()==2) { 
					str3 += "0";
					str3 += a;
					answer += str3;
				}
				
			}
			else answer += a;

		}
		
		if(answer.substring(0,1).equals("0")) {
			answer=answer.substring(1,answer.length());
		}
		System.out.println(answer);
	}

}
