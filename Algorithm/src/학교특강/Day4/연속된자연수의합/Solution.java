package Algorithm.src.학교특강.Day4.연속된자연수의합;
/**
 * 1. 15라고 가정하면 1부터 8까지 배열에 담음
 * 2. 1 2 3 4 5 6 7 8
 * lt와 rt 둘 다 1을 가리키고 있음
 * rt 한칸씩 오른쪽으로 이동 ...
 *
 * lt: 1 rt: 5 => 합이 15가 됐음 -> cnt 증가 -> rt 6 됨
 * rt가 6이 되니까 합이 15보다 커졌으므로(21) lt 한칸 옮김 -> lt = 2
 * 합이 15이하가 될 때까지 lt 옆으로 옮김 -> lt = 4
 * lt: 4 rt: 6 => 합 15 됐으니까 cnt 증가
 *
 * 반복
 *
 * */
public class Solution {
    public int solution(int n){
        int m = n/2+1;
        int[] nums = new int[m];
        for(int i=0; i<m; i++) nums[i]=i+1;
        int answer=0;
        int sum=0;
        int lt=0;

     

        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        System.out.println(T.solution(45678));

    }
}
