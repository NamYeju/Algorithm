package 프로그래머스.연습문제.x만큼간격이있는n개의숫자;

import java.util.Arrays;

class Solution {
	public static void main(String args[]) {
		int x = 0;
		int n = 5;
		System.out.println(Arrays.toString(solution(x,n)));
	}
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i=0; i<n; i++) {
        	answer[i] = x*(i+1);
        
        }
        return answer;
    }
}
