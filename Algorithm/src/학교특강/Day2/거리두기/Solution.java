package Algorithm.src.학교특강.Day2.거리두기;

import java.util.ArrayList;

public class Solution {
    // left right를 통해 탐색하면 nums의 범위가 클 때 시간초과
    // 왼쪽을 기준으로 탐색 O(n)
    // arr: 1 0 0 1 0 0 1
    // dist: 0 1 2 0 1 2 0
    // 빈자리가 있으면 dist 값을 1씩 증가시켰다가 1만나면 0으로 초기화
    public static int solution(int[] nums){
        int answer = 0;
        int n = nums.length;
        int[] dist = new int[n];
        int d = 1000;

        for(int i=0; i<n; i++){
            if(nums[i]==1) d=0;
            else{
                d++;
                dist[i] = Math.min(dist[i], d);
            }
        }

        for(int x: dist){
            answer = Math.min(answer, x);
        }
        return answer;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1, 0, 0, 0, 1, 0, 0, 1, 0, 1};
        solution(arr);
    }
}
