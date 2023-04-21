package Algorithm.src.백준알고리즘.배열.나머지합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long answer = 0;
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		long S[] = new long[N+1]; // 나머지 합배열 저장
		long arr[] = new long[M]; // M으로 나눴을 때 나머지에 해당하는 S[] 카운트
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i < S.length; i++){
			S[i] = (Integer.parseInt(st.nextToken()) + S[i-1]) % M;
			if(S[i] == 0) {
				answer++;
			}
			arr[(int)S[i]]++;
		}

		for(int i = 0; i < arr.length; i++){
			if(arr[i] > 1)
				answer += (arr[i] * (arr[i]-1)) / 2;
		}

		System.out.println(answer);
	}
}
