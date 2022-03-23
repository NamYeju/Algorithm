package Algorithm.src.개념.UnionFind;

/**
 * Union-Find (합집합 찾기) = 서로소 집합 알고리즘 : 대표적인 그래프 알고리즘
 * 여러 개의 노드가 존재할 때 두개의 노드를 선택해서 현재 이 노드가 서로 같은 그래프에 속하는가 판별별
 * -> 크루스칼 알고리즘 등에 사용됨
 */
public class Main {
    //2. 부모 노드 찾기
    //if 노드 1와 2 연결 : 2의 부모노드는 1
    //if 노드 2와 3 연결 : 3의 부모노드는 2
    //하지만 궁극적으로 1과 2이 연결 된 상태이므로 3의 부모노드는 1이 되어야 한다 -> 재귀
    static int getParent(int array[], int x){
        if(array[x] == x) return x;
        else return getParent(array,array[x]);
    }

    // 1. 부모 노드 합치기 (노드 연결)
    static void unionParent(int array[], int a, int b){
        a = getParent(array, a);
        b = getParent(array, b);
        if(a < b) array[b] = a;
        else array[a] = b;
    }
    // 3. 같은 부모 노드를 가지는 지 확인 (그래프 연결 유무 판별)
    static boolean findParent(int[] array, int a, int b){
        if(getParent(array, a) == getParent(array, b)) return true;
        else return false;
    }
    public static void main(String args[]){
        int parentArray[] = new int[11];             // 개별적으로 존재하는 11개의 노드들
        for(int i=0; i< parentArray.length; i++){
            parentArray[i] = i;                      // 현재는 각 노드들의 부모노드는 자기 자신
        }

        System.out.println(findParent(parentArray,1,2)); // false

        unionParent(parentArray, 1, 2); // 1과 2 노드 연결
        unionParent(parentArray, 2, 3); // 2와 3 노드 연결

        System.out.println(findParent(parentArray, 1, 2)); // true
        System.out.println(findParent(parentArray, 1, 3)); // true
        System.out.println(findParent(parentArray, 2, 3)); // true
    }
}
