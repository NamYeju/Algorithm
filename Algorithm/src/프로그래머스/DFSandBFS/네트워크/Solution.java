package 프로그래머스.DFSandBFS.네트워크;
/*
 A컴퓨터:110 B컴퓨터:111 C컴퓨터:011
 각각의 컴퓨터의 visit배열을 false라고 생각할 때 A부터 탐색 시작 -> A의 visit==true
 A의 원소 하나하나를 반복문을 통해 살펴보면([0][0]~[0][2]) 값이 1이고 visit하지 않은 곳일 때 연결되어있다고 생각  ->[0][1](B컴퓨터)
 그러면 dfs(B)를 호출하여 다시 살펴본다 -> 이번엔 [1][1] (C컴퓨터)
 dfs(C)를 호출했을 때 조건에 맞는 경우의 수는 없으니 dfs(B)로 돌아가고 dfs(B)도 더이상 조건에 맞는 것이 없으므로 모든 재귀 완료
 dfs(A)로 컴백했음 , dfs(A)도 완료&answer++
 */
public class Solution {
    public static int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visit = new boolean[n];
        for(int i=0; i<n; i++) {
        	if(visit[i]!=true) {
        		dfs(computers,i,visit);
        		answer++;
        	}
        }
        return answer;
    }
    public static void dfs(int[][]arr, int node, boolean[] visit) {
    	visit[node] = true;
    	for(int i=0; i<arr.length; i++) {
    		if(arr[node][i]==1 && visit[i] == false) {
    			dfs(arr, i, visit);
    		}
    	}		
    	
    }
    public static void main(String args[]) {
    	int arr[][]= {{1,1,0},{1,1,1},{0,1,1}};
    	System.out.println(solution(3,arr));
    }
}
