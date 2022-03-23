package Algorithm.src.개념.크루스칼알고리즘;

import java.util.ArrayList;

/**
 * 가장 적은 비용으로 모든 노드 연결
 * 최소 비용 신장 트리
 * 간선을 거리가 잛은 순서대로 그래프에 포함 (단, 사이클이 생기지 않도록 -> Union-Find 알고리즘 )
 * */
public class Main {
    // 1~3: Union-Find 알고리즘

    // 2. 부모 노드 찾기
    static int getParent(int array[], int x){
        if(array[x] == x) return x;
        else return getParent(array,array[x]);
    }

    // 1. 노드 연결
    static void unionParent(int array[], int a, int b){
        a = getParent(array, a);
        b = getParent(array, b);
        if(a < b) array[b] = a;
        else array[a] = b;
    }
    // 3. 그래프 연결 유무 판별
    static boolean findParent(int[] array, int a, int b){
        if(getParent(array, a) == getParent(array, b)) return true;
        else return false;
    }
    // 간선 클래스
    static class Edge{
        int node[] = new int[2];
        int distance;

        public Edge(int x, int y, int distance) {
            this.node[0] = x;
            this.node[1] = y;
            this.distance = distance;
        }

    }
    public static void main(String args[]){
        ArrayList node = new ArrayList();
        node.add(new Edge(1,7,12));
        node.add(new Edge(1,4,28));
        node.add(new Edge(1,2,67));
        node.add(new Edge(1,5,17));
        node.add(new Edge(2,4,24));
        node.add(new Edge(2,5,62));
        node.add(new Edge(3,5,20));
        node.add(new Edge(3,6,37));
        node.add(new Edge(4,7,13));
        node.add(new Edge(5,6,45));
        node.add(new Edge(5,7,73));


    }

}

