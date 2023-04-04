package Algorithm.src.백준알고리즘.DFS.연결요소의개수;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int M = sc.nextInt();

		Boolean[] visited = new Boolean[V+1];
		for (int i=0; i<V+1; i++){
			visited[i] = Boolean.FALSE;
		}
		int trueCnt = 0; // 방문노드 횟수
		int cnt = 0; // dfs 횟수

		Stack<Integer> stack = new Stack<>();

		// 그래프
		ArrayList<Integer>[] graph = new ArrayList[V+1];
		for(int i=1; i<=V; i++) {
			graph[i] = new ArrayList<>();
		}
		for(int i=1; i<=M; i++){
			int S = sc.nextInt();
			int E = sc.nextInt();
			graph[S].add(E);
			graph[E].add(S);
		}

		// 탐색
		stack.push(1);
		visited[0] = Boolean.TRUE;
		visited[1] = Boolean.TRUE;
		trueCnt ++;

		while (!(stack.empty() && trueCnt == V)){
			if(!stack.isEmpty()) {
				Integer item = stack.pop();
				for (int i = 0; i < graph[item].size(); i++) {
					if (visited[graph[item].get(i)] == Boolean.FALSE) {
						stack.push(graph[item].get(i));
						visited[graph[item].get(i)] = Boolean.TRUE;
						trueCnt++;
					}
				}
			}
			if(stack.isEmpty()){
				cnt++;
				for(int i=1; i<V+1; i++){
					if(visited[i] == Boolean.FALSE) {
						stack.push(i);
						visited[i] = Boolean.TRUE;
						trueCnt++;
						break;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
