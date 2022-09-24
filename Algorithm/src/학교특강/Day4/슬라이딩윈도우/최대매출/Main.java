package Algorithm.src.학교특강.Day4.슬라이딩윈도우.최대매출;

public class Main {
    public static int solution(int[] nums, int k){
        int sum = 0;
        int answer = 0;

        // 1. 처음 k만큼의 창을 만들거야
        for(int i=0; i<3; i++){
            sum += nums[i];
        }

        answer = sum;

        // 2. k 크기만큼 쭉쭉 밀기
        for(int i=k; i<nums.length; i++){
            sum += nums[i];
            sum -= nums[i-k];
            answer = Math.max(sum, answer);
        }

        return answer;
    }
    public static void main(String[] args) {
        int nums[] = new int[]{12, 15, 11, 20, 25, 10, 20, 19, 13, 15};
        int k = 3;
        System.out.println(solution(nums, k));
    }
}
