package Algorithm.src.프로그래머스.DFSandBFS.게임맵최단거리.다른풀이;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	static int N;
	static int M;
	static int answer = 0;
	static int isVisited[][];
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};

	public static void main(String[] args) {
		int maps[][] = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
		System.out.println(solution(maps));
	}

	public static int solution(int[][] maps){
		N = maps.length-1;
		M = maps[0].length-1;
		isVisited = new int[maps.length][maps[0].length]; // 방문체크 boolean 대신 int[]로 선언하여 cnt 메모리제이션으로 처리
		return answer = BFS(maps);
	}
	public static int BFS(int[][]maps){
		Queue queue = new LinkedList();
		queue.add(new int[]{0,0});
		isVisited[0][0] = 1;
		while (!queue.isEmpty()){
			int[] poll = (int[])queue.poll();
			int x = poll[0];
			int y = poll[1];
			if(x == N && y == M){
				return isVisited[N][M];
			}
			for(int i=0 ; i<4; i++){
				int nX = x + dx[i];
				int nY = y + dy[i];

				if(nX > N || nX < 0 || nY > M ||nY < 0)
					continue;
				if(maps[nX][nY] == 0 || isVisited[nX][nY] != 0)
					continue;

				queue.add(new int[]{nX, nY});
				isVisited[nX][nY] = isVisited[x][y] + 1;
			}

		}
		return -1;
	}

}


