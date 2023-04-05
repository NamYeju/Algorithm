package Algorithm.src.백준알고리즘.DFS.신기한소수;

import java.util.Scanner;

public class Main {
	static int N;
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		DFS(2, 1);
		DFS(3, 1);
		DFS(5, 1);
		DFS(7, 1);

	}
	public static void DFS(int s, int jarisu){
		if(jarisu == N){
			if(isPrime(s))
				System.out.println(s);
			else return;
		}
		if(isPrime(s)){
			for(int i=1; i<10; i+=2){
				if(isPrime(s * 10 + i))
					DFS(s * 10 + i, jarisu+1);
			}
		}


	}
	public static boolean isPrime(int n){
		if(n == 2)
			return true;
		for(int i=2; i<=Math.sqrt(n); i++){
			if(n % i == 0)
				return false;
		}
		return true;
	}
}
