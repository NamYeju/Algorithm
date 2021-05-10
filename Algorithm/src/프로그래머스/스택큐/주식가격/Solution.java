package 프로그래머스.스택큐.주식가격;

import java.util.Arrays;

public class Solution {

	public static void main(String args[]) {
		int[] prices= {1,2,3,2,3};
		System.out.print(Arrays.toString(solution(prices)));
	}
	public static int[] solution(int[]prices) {
		int[]answer = new int[prices.length];
		
		for(int i=0; i<prices.length;i++) {
			int num=0;
			for(int j=i+1; j<prices.length; j++) {
				if(prices[i]<=prices[j])
					num++;
				if(prices[i]>prices[j]) {
					num+=1;
					break;
				}
			}
			answer[i] = num;
		}

		return answer;
	}
}

