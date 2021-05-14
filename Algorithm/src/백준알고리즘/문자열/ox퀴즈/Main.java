package 백준알고리즘.문자열.ox퀴즈;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int num;
		int score=0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		String[] str = new String[num];
		int[] answer = new int[num];
		for(int i=0; i<str.length; i++) {
			str[i] = sc.nextLine();
			for(int j=0; j<str[i].length();j++) {
				if(j=='o')
					score++;
				else
					score = 0;
			}
			answer[i] = score;
		}
		
		
	}

}
