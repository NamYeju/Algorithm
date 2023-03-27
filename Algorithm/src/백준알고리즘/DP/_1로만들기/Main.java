package Algorithm.src.백준알고리즘.DP._1로만들기;

import java.util.Scanner;

public class Main {
	static int answer = 0;
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] Dp = new int[n+1];

		Dp[0] = 0; Dp[1] = 0;

		for(int i=2; i<=n; i++){
			Dp[i] = Dp[i-1] + 1;
			if(i%3 == 0)
				Dp[i] = Math.min(Dp[i/3]+1, Dp[i]);
			if(i%2 == 0)
				Dp[i] = Math.min(Dp[i/2]+1, Dp[i]);
		}

		System.out.println(Dp[n]);
	}


}
