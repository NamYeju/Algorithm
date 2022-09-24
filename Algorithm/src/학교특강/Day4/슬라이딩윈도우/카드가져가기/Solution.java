package Algorithm.src.학교특강.Day4.슬라이딩윈도우.카드가져가기;

public class Solution {
    public static int solution(int[] nums, int k){
        int answer = 0;
        int sum = 0;

        // 1. 현수가 가져가고 남을 카드 갯수만큼의 합
        for (int i=0; i<nums.length - k; i++){
            sum += nums[i];
        }
        answer = sum;

        // 2. 그 합중에서 (슬라이딩 윈도우 =>) 젤 작은 값 구하기
        // 젤 작아야 현수가 가져갈 카드합이 젤 큰거니까
        k = nums.length - k;
        for (int i = k; i<nums.length; i++){
            sum += nums[i] - nums[i-k];
            answer = Math.min(sum, answer);
        }

        // 3. 카드 전체 합에서 뺴기
        int total = 0;
        for(int i : nums){
            total += i;
        }

        return total - answer;
    }
    public static void main(String[] args){
        int[] arr = new int[]{2, 3, 7, 1, 2, 1, 5};
        System.out.println(solution(arr, 4));

    }
}
