package Algorithm.src.개념.dfs.재귀구현;

import java.util.ArrayList;

public class Main {
	static boolean[] visited;
	static ArrayList<Integer>[] graph;
	public static void main(String args[]){
		int V = 6;
		int E = 6;
		int[][] nodes = {{1,2}, {1,3}, {2, 5}, {2, 6}, {3,4}, {4,6}};
		visited = new boolean[V+1];
		graph = new ArrayList[V+1];
		for (int i = 0; i <= V; i++) {
			graph[i] = new ArrayList<>();
		}
		// 그래프 표현
		for (int i=0; i<nodes.length; i++){
			graph[nodes[i][0]].add(nodes[i][1]);
		}
		dfs(1);

	}
	static void dfs(int start){
		if(!visited[start]) visited[start] = true;
		else return;
		System.out.println(start);
		for(int i=0; i<graph[start].size(); i++){
			int y = (int)graph[start].get(i);
			if(visited[y] == false)
				dfs(y);
		}
	}

}

