package Algorithm.src.학교특강.Day2.수열의경우수;

import java.util.ArrayList;

public class Solution {
    public static int solution(int[] arr){
        int answer = 0;

        ArrayList<Integer> peaks = new ArrayList<>();
        for(int i=1; i< arr.length; i++){
            if(arr[i-1]<arr[i] && arr[i+1]>arr[i])
                peaks.add(i);
        }
        answer += peaks.size();

        // peak를 기준으로 left right에 각각 몇개가 있는지 구한 후 left의 길이와 right의 길이를 곱하면
        // 부분집합 경우의 수가 됨
        for(int p : peaks){
            int left = p;
            int right = p;
            int leftCnt = 0;
            int rightCnt = 0;

            while(left-1>=0 && arr[left]>arr[left-1]){
                left--;
                leftCnt ++;
            }
            while(right+1<arr.length && arr[right]<arr[right+1]){
                right++;
                rightCnt ++;
            }
            answer += leftCnt * rightCnt;
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 2, 5, 7, 4, 2, 5, 1};
        solution(nums);
    }
}
