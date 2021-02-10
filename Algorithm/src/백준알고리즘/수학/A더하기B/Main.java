package 백준알고리즘.수학.A더하기B;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.print(A+"+"+B+"="+Sum(A,B));
	}
	public static int Sum(int A, int B){
		int C = A+B;
		
		return C;
	}
}
