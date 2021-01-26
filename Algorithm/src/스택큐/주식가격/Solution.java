package 스택큐.주식가격;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

	public static void main(String args[]) {
		int[] prices= {1,2,3,2,3};
		System.out.print(Arrays.toString(solution(prices)));
	}
	public static int[] solution(int[]prices) {
		int[]answer = {};
		int num=0;
		ArrayList<Integer> list  = new ArrayList<Integer>();
		
		for(int i=0; i<prices.length;i++) {
			if(i!=prices.length-1) {
				for(int j=i+1; j<prices.length; j++) {
					if(prices[i]<=prices[j])
						num++;
					if(prices[i]>prices[j]) {
						num+=1;
						break;
					}
				}
			}
			if(i==prices.length-1) {
				num = 0;
			}
			list.add(num);
			num = 0;
		}
		answer = new int[list.size()];
		for(int i=0; i<list.size();i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
