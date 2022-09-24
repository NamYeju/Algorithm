package Algorithm.src.학교특강.Day3.회장선거;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> solution(int n, int[][] votes, int k){
        ArrayList<Integer> answer=new ArrayList<>();
        int[][] report = new int[n][n];
        int[] candidate = new int[n];

        // 1
        for(int[] x : votes){
            report[x[0]][x[1]] = 1;
        }

        // 2
        for (int i=0; i< n; i++){
            int cnt = 0;
            for (int j=0; j< n; j++){
                if(report[j][i] == 1)
                    cnt++;
            }
            if(cnt >= k) candidate[i] = 1;
        }

        // 3
        for(int i=0; i< n; i++){
            int cnt = 0;
            for(int j=0; j < n; j++){
                if(report[i][j] == 1 && candidate[j]==1)
                    cnt++;
            }
            answer.add(cnt);
        }

        return answer;
    }

    public static void main(String[] args){
        int[][] arr={{0, 1}, {0, 3}, {1, 2}, {2, 0}, {2, 3}, {3, 0}};

        System.out.println(solution(4, arr, 2));

    }
}
/**
 * 1. <report>
 * (초기화)
 * 0 0 0 0
 * 0 0 0 0
 * 0 0 0 0
 * 0 0 0 0
 * ex [0][1] 0번학생이 1번을 추천햇는가 안했는가
 * -------
 * 0 1 0 1
 * 0 0 1 0
 * 1 0 0 1
 * 1 0 0 0
 *
 * 2. <candidate>
 * 0 0 0 0
 * -------
 * (report 탐색 )
 * 인덱스 값 = 추천 받은 사람의 횟수
 * 즉, k번 이상의 추천을 받으면
 * report 세로줄 탐색하면서 1의 횟수 파악
 * 1 0 0 1
 *
 * 3. <answer>
 * 0 0 0 0
 * report 가로줄 탐색하면서 횟수 파악
 * 1 0 2 1
 * */