package Algorithm.src.백준알고리즘.그리디알고리즘.동전0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[] arr = new int[N];
		for(int i = N-1; i>=0; i--){
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int answer = 0;
		for(int i=0; i<N; i++){
			if(arr[i]<=K){
				answer += K / arr[i];
				K = K % arr[i];
			}
		}

		System.out.println(answer);

	}
}
