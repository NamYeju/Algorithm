package 백준알고리즘.문자열.ox퀴즈;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[sc.nextInt()];

		for(int i=0; i<str.length; i++) {
			str[i] = sc.next();
		}
		for(int j=0; j<str.length;j++) {
			int score=0,finalscore=0;

			for(int i=0;i<str[j].length();i++) {
				System.out.println(str[j].charAt(i));
				if(str[j].charAt(i)=='O') {
					score++;
					finalscore+=score;
				}
				else
					score = 0;
			}
			System.out.println(finalscore);
		}
				
	}

}
