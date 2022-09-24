package Algorithm.src.학교특강.Day2.가장높은증가수열;

/**
 * 길이가 n인 수열이 주어지면 이 수열에서 연속된 부분 증가수열을 찾습니다.
 * 각 부분증가수열 은 높이가 있습니다. 증가수열의 높이란 증가수열의 첫항과 마지막항의 차를 의미합니다.
 * 수열이 주어지면 여러 증가수열 중 가장 높은 부분증가수열을 찾는 프로그램을 작성하세요.
 * 만약 수열이 [5, 2, 4, 7, 7, 3, 9, 10, 11]이 주어지면 가장 높은 부분증가수열은 [3, 9, 10, 11]이고, 높이는 8입니다.
 * 주의 : 이웃하는 두 수가 같을 경우 증가수열로 보지 않습니다.
 * */
public class Solution {
    public static int solution(int[] nums){
        int height = 0;
        int answer = 0;

        // 수열의 첫항과 마지막항의 차로 구하지말고
        // 두개의 높이를 누적
        // ex 일 때 1 4 8 12
        // 12-1 이 아닌 (4-1) + (8-4) + (12-8)

        for(int i=1; i<nums.length; i++){
            if(nums[i-1] < nums[i])
                height += nums[i]-nums[i-1];
            else{
                answer = Math.max(answer, height);
                height = 0;
            }
        }
        // 반례: 마지막 구간까지 증가수열임을 고려하여 중복코드 작성
        answer = Math.max(answer, height);

        return answer;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{8, 12, 2, 3, 7, 6, 12, 20, 3};
        solution(nums);
    }
}
