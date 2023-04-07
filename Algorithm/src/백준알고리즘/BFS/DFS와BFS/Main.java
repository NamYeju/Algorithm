package Algorithm.src.백준알고리즘.BFS.DFS와BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer>[] graph;
	static boolean[] isVisited;

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int V = sc.nextInt();

		graph = new ArrayList[N+1];
		isVisited = new boolean[N+1];

		for(int i=0; i<=N; i++){
			graph[i] = new ArrayList<>();
		}
		for(int i=0; i<M; i++){
			int s = sc.nextInt();
			int e = sc.nextInt();
			graph[s].add(e);
			graph[e].add(s);
		}
		Arrays.stream(graph).forEach(g -> Collections.sort(g));

		DFS(V);
		isVisited = new boolean[N+1];
		System.out.println();
		BFS(V);
	}
	public static void DFS(int start){
		if(!isVisited[start]) {
			isVisited[start] = true;
			System.out.print(start+" ");
		}
		else return;

		for(int i=0; i<graph[start].size(); i++){
			int node = graph[start].get(i);
			if(!isVisited[node]){
				DFS(node);
				isVisited[node] = true;
			}
		}
	}
	public static void BFS(int start){
		Queue<Integer> queue = new LinkedList<>();

		queue.add(start);
		isVisited[start] = true;

		while (!queue.isEmpty()){
			int node = queue.poll();
			System.out.print(node+ " ");
			for (int i=0; i<graph[node].size(); i++){
				int next = graph[node].get(i);
				if(!isVisited[next]) {
					queue.add(next);
					isVisited[next] = true;
				}
			}
		}
	}
}
