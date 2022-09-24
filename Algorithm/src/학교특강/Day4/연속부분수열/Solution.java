package Algorithm.src.학교특강.Day4.연속부분수열;

public class Solution {
    public static int solution(int[] nums, int m){
        int answer=0;
        int sum=0;
        int lt=0; // left

        for(int  rt = 0; rt< nums.length; rt++){
            sum += nums[rt];
            while(sum>rt) {
                sum += nums[lt];
            }
            lt = rt;
            //(if sum==m, answer++;
        }

        return answer;
    }

    public static void main(String[] args){
        int[] arr = new int[]{1, 2, 1, 2, 1, 2, 1};
        System.out.println(solution(arr, 3));

    }
}
