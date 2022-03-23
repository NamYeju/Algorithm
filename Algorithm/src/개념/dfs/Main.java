package Algorithm.src.개념.dfs;

import java.util.ArrayList;

/**
 * 깊이 우선 탐색 (DFS)
 * 스택 원리를 이용 (재귀)
 * */
public class Main {
    static int num = 7;
    static boolean isVisited[] = new boolean[num+1];
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    static void dfs(int x){
        if(!isVisited[x]) isVisited[x] = true; // 1. 최상단 노드 방문처리
        else return;
        System.out.print(x + " ");
        for(int i=0; i<graph.get(x).size(); i++){ //2. 최상단 노드에게 방문하지 않은 인접 노드가 있으면 스택에 넣고 방문처리
            int y = graph.get(x).get(i);
            dfs(y); // 3. 반복 (더이상 방문해야 할 인접노드가 없으면 스택에서 최상단 노드를 뺌 == 재귀종료 )
        }

    }
    public static void main(String args[]){
        for(int i =0; i<num+1; i++){
            graph.add(new ArrayList<>());
        }
        graph.get(1).add(2);
        graph.get(1).add(3);

        graph.get(2).add(1);
        graph.get(2).add(3);
        graph.get(2).add(4);
        graph.get(2).add(5);

        graph.get(3).add(1);
        graph.get(3).add(2);
        graph.get(3).add(6);
        graph.get(3).add(7);

        graph.get(4).add(2);
        graph.get(4).add(5);

        graph.get(5).add(2);
        graph.get(5).add(4);

        graph.get(6).add(3);
        graph.get(6).add(7);

        graph.get(7).add(3);
        graph.get(7).add(6);

        dfs(1);

    }
}
