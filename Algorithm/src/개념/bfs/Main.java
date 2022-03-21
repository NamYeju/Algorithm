package Algorithm.src.개념.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 너비 우선 탐색 (BFS)
 시작점과 가까운 것 위주로 탐색 -> 최단 경로 보장
 * */
public class Main {
    static int number = 7; // 탐색할 노드 갯수
    static ArrayList<ArrayList<Integer>> nodeGraph = new ArrayList<ArrayList<Integer>>(); //탐색 예정인 노드들
    static boolean[] isVisited = new boolean[number+1]; // 방문 처리
    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>(); // 방문한 노드를 담아줄 queue

        queue.add(start);                                       // 1. queue에 탐색 시작점을 넣어주고
        isVisited[start] = true;                                // 2.  방문 처리
        while (!queue.isEmpty()){                               // 큐가 비지 않을 때 까지, 즉 방문할 노드가 남아있을 때 까지
            int x = queue.peek();                               // 3. 큐에 넣어준 값 하나를 가져오고
            System.out.print(x+ " ");
            queue.poll();                                      // 4. 큐에서 제거
            for (int i =0; i< nodeGraph.get(x).size(); i++){   //5.기져온 값과 연결된 노드를 탐색
                int y = nodeGraph.get(x).get(i);
                if(!isVisited[y]){                            // 6. 노드가 방문한 적이 없으면
                    queue.add(y); //                          //7. 큐에 넣어주고
                    isVisited[y] = true;                      //8. 방문처리
                }
            }

        }

    }
    public static void main(String args[]){
        for (int i =0; i<number+1; i++){
            nodeGraph.add(new ArrayList<>());
        }
        nodeGraph.get(1).add(2);
        nodeGraph.get(1).add(3);

        nodeGraph.get(2).add(1);
        nodeGraph.get(2).add(3);
        nodeGraph.get(2).add(4);
        nodeGraph.get(2).add(5);

        nodeGraph.get(3).add(1);
        nodeGraph.get(3).add(2);
        nodeGraph.get(3).add(6);
        nodeGraph.get(3).add(7);

        nodeGraph.get(4).add(2);
        nodeGraph.get(4).add(5);

        nodeGraph.get(5).add(2);
        nodeGraph.get(5).add(4);

        nodeGraph.get(6).add(3);
        nodeGraph.get(6).add(7);

        nodeGraph.get(7).add(3);
        nodeGraph.get(7).add(6);

        bfs(1);

    }
}
