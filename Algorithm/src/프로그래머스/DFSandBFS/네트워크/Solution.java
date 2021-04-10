package ���α׷��ӽ�.DFSandBFS.��Ʈ��ũ;
/*
 A��ǻ��:110 B��ǻ��:111 C��ǻ��:011
 ������ ��ǻ���� visit�迭�� false��� ������ �� A���� Ž�� ���� -> A�� visit==true
 A�� ���� �ϳ��ϳ��� �ݺ����� ���� ���캸��([0][0]~[0][2]) ���� 1�̰� visit���� ���� ���� �� ����Ǿ��ִٰ� ����  ->[0][1](B��ǻ��)
 �׷��� dfs(B)�� ȣ���Ͽ� �ٽ� ���캻�� -> �̹��� [1][1] (C��ǻ��)
 dfs(C)�� ȣ������ �� ���ǿ� �´� ����� ���� ������ dfs(B)�� ���ư��� dfs(B)�� ���̻� ���ǿ� �´� ���� �����Ƿ� ��� ��� �Ϸ�
 dfs(A)�� �Ĺ����� , dfs(A)�� �Ϸ�&answer++
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
