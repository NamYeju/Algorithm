package Algorithm.src.학교특강.Day4.슬라이딩윈도우.최대매출;

public class Solution {
    // 슬라이딩 윈도우
    // 0인덱스부터 k만큼 sum을 하고 for문을 돌면서 한칸씩 밀기
    // sum += (nums[i] - nums[i-k])
    public static int solution(int[] nums, int k){
        int sum = 0;
        int answer = 0;

        for(int i=0; i<k; i++){
            sum+= nums[i];
        }
        answer = sum;

        for(int i=k; i<nums.length; i++){
            sum += nums[i] - nums[i-k];
            answer = Math.max(answer, sum);
        }
        return answer;
    }
    public static void main(String[] args) {
        int nums[] = {12, 15, 11, 20, 25, 10, 20, 19, 13, 15};
        int k = 3;
        System.out.println(solution(nums, k));
    }
}
