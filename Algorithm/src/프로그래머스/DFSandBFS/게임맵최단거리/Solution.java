package Algorithm.src.프로그래머스.DFSandBFS.게임맵최단거리;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	static int N;
	static int M;
	static int answer = 0;
	static boolean isVisited[][];
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};

	public int solution(int[][] maps){
		N = maps.length-1;
		M = maps[0].length-1;
		isVisited = new boolean[maps.length][maps[0].length];
		Node node = new Node(0, 0, 1);
		return answer = BFS(maps, node);
	}
	public static int BFS(int[][] maps, Node node){
		Queue<Node> queue = new LinkedList();
		queue.add(node);
		isVisited[node.x][node.y] = true;
		while (!queue.isEmpty()){
			Node poll = queue.poll();

			for(int i=0 ; i<4; i++){
				int nX = poll.x + dx[i];
				int nY = poll.y + dy[i];
				if(nX == N && nY == M){
					return poll.cnt+1;
				}
				if(nX > N || nX < 0 || nY > M ||nY < 0)
					continue;
				if(maps[nX][nY] == 0 || isVisited[nX][nY])
					continue;

				queue.add(new Node(nX, nY, poll.cnt+1));
				isVisited[nX][nY] = true;
			}

		}
		return -1;

	}
	static class Node{
		int x, y, cnt;

		Node(int x, int y, int cnt){
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
	}
}


