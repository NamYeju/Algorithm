package Algorithm.src.프로그래머스.완전탐색.최소직사각형;

public class Solution {
	public int solution(int[][] sizes) {
		int answer = 0;
		int fnlMax = 0, fnlMin = 0;
		int max = 0, min = 0;
		for(int i = 0; i < sizes.length; i++){
			max = Math.max(sizes[i][0], sizes[i][1]);
			min = Math.min(sizes[i][0], sizes[i][1]);

			fnlMax = Math.max(max, fnlMax);
			fnlMin = Math.max(min, fnlMin);
		}

		answer = fnlMax * fnlMin;

		return answer;
	}
}
