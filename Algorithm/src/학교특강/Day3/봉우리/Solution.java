package Algorithm.src.학교특강.Day3.봉우리;

/**
 * int [] dx = {-1,0,1,0};
 * int [] dy = {0,1,0,-1}
 *
 * int nx = i + dx[k]
 * int ny = j + dy[k]
 * */
public class Solution {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    // 앞에 조건: 인덱스가 -1 되지 않기 위해 존재하는 조건
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] >= board[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr = {{5, 3, 7, 2, 3},
                {3, 7, 1, 6, 1},
                {7, 2, 5, 3, 4},
                {4, 3, 6, 4, 1},
                {8, 7, 3, 5, 2}};
        System.out.println(solution(arr));

    }
}
