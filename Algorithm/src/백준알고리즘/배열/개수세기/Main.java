package Algorithm.src.백준알고리즘.배열.개수세기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int target = Integer.parseInt(br.readLine());
		int answer = 0;
		for (int a : arr){
			if(a == target)
				answer++;
		}
		System.out.println(answer);
	}
}
