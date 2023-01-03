package Algorithm.src.프로그래머스.정렬.HIndex;

import java.util.Arrays;

/** 오름차순 */
public class Solution2 {
	public static void main(String args[]){
		int array[] = {3, 0, 6, 1, 5};
		System.out.println(solution(array));
	}
	public static int solution(int[] citations){
		int answer = 0;

		Arrays.sort(citations);

		int n = citations.length;

		for(int i = 0; i < n; i++){
			if(citations[i]  >= n-i) {
				answer = n-i;
				break;
			}
		}

		return answer;
	}
}
