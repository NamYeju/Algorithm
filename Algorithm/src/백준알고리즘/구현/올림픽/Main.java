package Algorithm.src.백준알고리즘.구현.올림픽;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		int index = 0;
		int answer = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[][] arr = new int[N][4];

		for(int i = 0; i < N; i++){
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
			arr[i][3] = Integer.parseInt(st.nextToken());
		}

		for(int i=0; i<N; i++){
			if(arr[i][0] == K)
				index = i;
		}

		for(int i=0; i<N; i++){
			if(i != index && arr[i][1] > arr[index][1])
				answer++;
			else if(i != index && arr[i][1] == arr[index][1] && arr[i][2] > arr[index][2])
				answer++;
			else if(i != index && arr[i][1] == arr[index][1] && arr[i][2] == arr[index][2] && arr[i][3] > arr[index][3])
				answer++;

		}
		answer++;

		System.out.println(answer);
	}
}
