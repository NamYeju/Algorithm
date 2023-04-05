package Algorithm.src.개념.dfs.스택구현;

import java.util.ArrayList;
import java.util.Stack;

public class Main {
	public static void main(String args[]){
		int V = 6;
		int E = 6;
		int[][] nodes = {{1,2}, {1,3}, {2, 5}, {2, 6}, {3,4}, {4,6}};
		dfs(V, E, nodes);
	}
	static void dfs(int V, int E, int[][]nodes) {
		// 그래프 초기화
		ArrayList<Integer>[] graph = new ArrayList[V+1];
		for (int i = 0; i <= V; i++) {
			graph[i] = new ArrayList<>();
		}
		// 그래프 표현
		for (int i=0; i<nodes.length; i++){
			graph[nodes[i][0]].add(nodes[i][1]);
		}
		// 방문배열 초기화
		Boolean visited[] = new Boolean[V + 1];

		// 스택에 탐색 시작 노드 삽입
		Stack stack = new Stack();
		stack.push(1);
		visited[0] = true;
		visited[1] = true;

		// 탐색
		while(!stack.isEmpty()){
			int node = (int)stack.pop();
			for (int i=0; i<graph[node].size(); i++){
				int target = graph[node].get(i);
				if(visited[target] == false){
					stack.push(target);
					visited[target] = true;
				}

			}
		}
	}
}
