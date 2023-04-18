package Algorithm.src.백준알고리즘.DFS.안전영역;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static boolean[][] isVisited;
	static int[][] maps;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		maps = new int[N][N];

		int max = 0;
		for(int i = 0; i < N; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++){
				maps[i][j] = Integer.parseInt(st.nextToken());
				max = Math.max(max, maps[i][j]); // 최대높이
			}
		}

		int answer = 0;
		for(int h = 0; h <= max; h++){ // h 1이 아닌 0부터
			isVisited = new boolean[N][N];
			int cnt = 0;
			for(int i = 0; i < N; i++){
				for(int j = 0; j < N; j++){
					if(maps[i][j] > h && !isVisited[i][j]){
						cnt += dfs(i, j, h);
					}
				}
			}
			answer = Math.max(cnt, answer);
		}
		System.out.println(answer);
	}

	public static int dfs(int x, int y, int h){
		isVisited[x][y] = true;

		for(int i = 0; i < 4; i++){
			int nX = x + dx[i];
			int nY = y + dy[i];
			if(!(nX >= 0 && nX < N && nY >= 0 && nY < N))
				continue;
			if(maps[nX][nY] > h && !isVisited[nX][nY])
				dfs(nX, nY, h);
		}
		return 1;
	}

}
