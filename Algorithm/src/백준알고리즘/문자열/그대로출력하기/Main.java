package 백준알고리즘.문자열.그대로출력하기;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String line;
		String answer="";
		while(sc.hasNextLine()){
			System.out.println(sc.hasNextLine());
			line = sc.nextLine();
			answer+=line+"\n";
			if(line.equals("")) {
				break;
			}
			//if(sc.hasNextLine() == false)
				//break;
		}
		System.out.println(answer);
	}
}
