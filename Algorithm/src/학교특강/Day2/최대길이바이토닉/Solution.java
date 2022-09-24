package Algorithm.src.학교특강.Day2.최대길이바이토닉;

import java.util.ArrayList;

//카카오 기출
public class Solution {
    public static int soluiton(int[] arr){
        int answer = 0;
        ArrayList<Integer> peak = new ArrayList<>();

        // 바이토닉 수열의 꼭짓점 인덱스 찾기
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]>arr[i-1] && arr[i]<arr[i+1])
                peak.add(i);
        }

        // 꼭짓점을 기준으로 길이 찾기
        for(int p : peak) {
            int left = p;
            int right = p;
            int cnt = 1;

            while (left-1>=0 && arr[left] > arr[left-1]) {
                cnt++;
                left--;
            }
            while (right+1>arr.length-1 && arr[right] > arr[right+1]) {
                cnt++;
                right++;
            }
            answer = Math.max(answer, cnt);
        }
        return answer;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1, 3, 2, 5, 7, 4, 2, 5, 1};
        soluiton(arr);
    }
}
