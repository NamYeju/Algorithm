package Algorithm.src.프로그래머스.정렬.HIndex;

import java.util.Arrays;
import java.util.Collections;

/**내람차순*/

public class Solution {
	public static void main(String args[]){
		int array[] = {3, 0, 6, 1, 5};
		System.out.println(solution(array));
	}
	public static int solution(int[] citations){
		int answer  = 0;

		Integer[] citations2 = Arrays.stream(citations).boxed().toArray(Integer[]::new);
		Arrays.sort(citations2, Collections.reverseOrder());

		int n = citations.length;
		for(int i = 0; i < n; i++){
			int cnt = i + 1; // 인용된 갯수
			if(cnt <= citations2[i])
				answer = cnt;
			else break;

		}

		return answer;
	}
}
