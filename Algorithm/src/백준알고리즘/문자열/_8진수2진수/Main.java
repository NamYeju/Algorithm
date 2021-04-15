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

		for(int i=0; i< num.length(); i--) {
			//5-> 2...1 -> 1...0 
			a = (int)num.charAt(i);
			while(num.charAt(i)/2 == 1) {
				if((num.charAt(i))%2==0) {
					arr.add("0");
				}
				else if((num.charAt(i))%2==1) {
					arr.add("1");
				}	
				a /= 2;
				System.out.println(a);
			}
		}
		

	}

}
