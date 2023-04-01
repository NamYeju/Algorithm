package Algorithm.src.백준알고리즘.완전탐색.브루트포스.블랙잭;

import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] card = new int[N];

		for(int i=0; i<N; i++){
			card[i] = sc.nextInt();
		}

		int answer = 0;

		for(int i=0; i<N-2; i++){
			for(int j=i+1; j<N-1; j++){
				for(int k=j+1; k<N; k++){
					int sum = 0;
					sum = card[i] + card[j] + card[k];
					if(sum <= M)
						answer = Math.max(answer, sum);
				}
			}
		}
		System.out.println(answer);

	}

}
