package Algorithm.src.학교특강.Day3.스카이라인;

public class Solution {
    /**
     * 1. 베열의 인덱스 값엔 각각 의미 부여해야함
     * row 의 최대값 = {7,9,5,8}
     * col의 최대값 = {7,8,9,8}
     * 2. board를 탐색하면서 최대값 비교
     * */
    public static int solution(int[][] board){
        int answer=0;
        int n=board.length;
        int[] row = new int[n];
        int[] col = new int[n];

        // 1
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]>row[i]) row[i]=board[i][j];
                if(board[j][i]>col[i]) col[i]=board[j][i];
            }
        }
        // 2
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                answer+=Math.min(row[i], col[j])-board[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args){
        int[][] arr={{2, 5, 7, 3},
                {6, 8, 9, 7},
                {3, 2, 4, 5},
                {7, 2, 5, 8}};
        System.out.println(solution(arr));

    }
}
