package Algorithm.src.프로그래머스.배열.삼각달팽이;

public class Solution {
	public int[] solution(int n) {
		int[] dx = {1, 0, -1}; // 하 우 대각선
		int[] dy = {0, 1, -1};
		int[][] arr = new int[n][n];
		int x = 0;
		int y = 0;
		int num = 1;
		int d = 0;

		while(true){
			arr[x][y] = num++;
			int nx = x + dx[d];
			int ny = y + dy[d];
			if(nx == n || nx == -1 || ny == n || ny == -1 || arr[nx][ny]!=0){
				d = (d + 1) % 3;
				nx = x + dx[d];
				ny = y + dy[d];
				if(nx == n || nx == -1 || ny == n || ny == -1 || arr[nx][ny]!=0)
					break;
			}
			x = nx;
			y = ny;
		}

		int[] answer = new int[num - 1];
		int index = 0;
		for(int[] i : arr){
			for(int j : i){
				if(j!=0){
					answer[index++] = j;
				}
			}
		}
		return answer;
	}

}
