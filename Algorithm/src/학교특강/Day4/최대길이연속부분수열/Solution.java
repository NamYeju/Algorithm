package Algorithm.src.학교특강.Day4.최대길이연속부분수열;

public class Solution {
    public int solution(int[] nums, int k){
        int answer=0;
        int cnt=0;
        int lt=0;
        for(int rt = 0; rt<nums.length; rt++){
            if(nums[rt] == 0) cnt++;
            while(cnt > k){
                if(nums[lt] == 0) cnt --;
                lt ++;
            }
            answer = Math.max(answer, rt-lt+1);
        }
        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        int[] arr = new int[]{1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1};
        System.out.println(T.solution(arr, 2));

    }
}
