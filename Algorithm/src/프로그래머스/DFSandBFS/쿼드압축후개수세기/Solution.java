package Algorithm.src.프로그래머스.DFSandBFS.쿼드압축후개수세기;

public class Solution {
	static int zero_Cnt;
	static int one_Cnt;
	public static int[] solution(int[][] arr) {
		int[] answer = new int[2];
		dfs(0, 0, arr.length, arr);
		answer[0] = zero_Cnt;
		answer[1] = one_Cnt;
		return answer;
	}
	public static void dfs(int offsetX, int offsetY, int size, int[][] arr){
		if(size == 1){
			if(arr[offsetX][offsetY] == 1) one_Cnt++;
			if(arr[offsetX][offsetY] == 0) zero_Cnt++;
			return;
		}
		for(int i = offsetX; i < offsetX + size; i++){
			for (int j = offsetY; j < offsetY + size; j++){
				if(arr[i][j] == arr[offsetX][offsetY])
					continue;
				else{
					dfs(offsetX, offsetY, size/2, arr);
					dfs(offsetX + size/2, offsetY, size/2, arr);
					dfs(offsetX, offsetY+size/2, size/2, arr);
					dfs(offsetX + size/2, offsetY + size/2, size/2, arr);
					return;
				}

			}
		}
		if(arr[offsetX][offsetY] == 1) one_Cnt++;
		if(arr[offsetX][offsetY] == 0) zero_Cnt++;
	}
}
