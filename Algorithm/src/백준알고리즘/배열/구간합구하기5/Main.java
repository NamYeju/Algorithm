package Algorithm.src.백준알고리즘.배열.구간합구하기5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int arr[][] = new int[N][N];
		int sum[][] = new int[N][N];

		for(int i=0; i<N; i++){
			int s = 0;
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++){
				arr[i][j] = Integer.parseInt(st.nextToken());
				s += arr[i][j];
				sum[i][j] = s;
			}
		}

		String answer = "";
		for(int i=0; i<M; i++){
			int temp = 0;

			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());

			if (y1 == 1) {
				for(int j = x1; j <= x2; j++) {
					temp += sum[j - 1][y2 - 1];
				}
			}else if(x1 == x2 && y1 == y2){
				temp += arr[x1-1][y2-1];
			}
			else {
				for(int j = x1; j <= x2; j++) {
					temp += (sum[j-1][y2-1] - sum[j-1][y1-2]);
				}
			}
			answer += temp + " ";
		}
		System.out.println(answer);
	}
}
