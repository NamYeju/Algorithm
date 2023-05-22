package Algorithm.src.백준알고리즘.배열.알파벳개수;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] answer = new int[26];
		for (int i = 0; i < str.length(); i++){
			int s = str.charAt(i)-'a';
			answer[s]++;
		}
		for(int a : answer){
			System.out.print(a+ " ");
		}
	}
}
