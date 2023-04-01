package Algorithm.src.백준알고리즘.완전탐색.브루트포스.약수구하기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int answer;
		ArrayList<Integer> arr = new ArrayList<>();

		for(int i=1; i<=N; i++){
			if(N % i == 0){
				arr.add(i);
			}
		}
		if(arr.size() < K) answer = 0;
		else answer = arr.get(K-1);

		System.out.println(answer);
	}
}
