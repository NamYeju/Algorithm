package Algorithm.src.백준알고리즘.구현.개미;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int N, M, t;
	static String s1, s2;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		s1 = br.readLine();
		s2 = br.readLine();
		t = Integer.parseInt(br.readLine());

		String left[] = new String[N];
		String right[] = new String[M];
		ArrayList<Integer> arr = new ArrayList<>();

		for(int i = 0; i < N; i++){
			left[i] = String.valueOf(s1.charAt(i));
			arr.add(0);
		}
		for(int i = 0; i < M; i++){
			right[i] = String.valueOf(s2.charAt(i));
			arr.add(1);
		}

		if(t != 0) {
			for (int j = 1; j <= t; j++) {
				for (int i = 0; i < arr.size() - 1; ) {
					if (arr.get(i) == 0 && arr.get(i + 1) == 1) {
						arr.set(i, 1);
						arr.set(i + 1, 0);
						i += 2;
					} else
						i += 1;

				}
				//System.out.println(Arrays.toString(arr.toArray()));
			}
		}
		int r = 0;
		int l = 0;
		String answer = "";
		for(int i=0; i<arr.size(); i++){
			if(arr.get(i) == 0){
				answer+=left[N-1-l];
				l++;
			}
			if(arr.get(i) == 1){
				answer += right[r];
				r++;
			}
		}
		System.out.println(answer);
	}
}
