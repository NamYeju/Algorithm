package 백준알고리즘.문자열._8진수2진수;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String num;
		int a = 0;
		ArrayList<String> arr = new ArrayList<String>();
		num = sc.next();
		for(int i=0; i< num.length(); i++) { //숫자 한자리씩 분리 
			//분리한 숫자 2진수로 변환하기 5-> 2...1 -> 1...0 
			a = num.charAt(i);
			while(a != 1) {
				if(a%2==0) {
					arr.add("0");
				}
				else if(a%2==1) {
					arr.add("1");
				}	
				a /= 2;
				System.out.println(a);
			}
		}

		System.out.println(arr);
		

	}

}
