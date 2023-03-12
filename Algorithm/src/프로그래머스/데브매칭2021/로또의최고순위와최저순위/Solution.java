package Algorithm.src.프로그래머스.데브매칭2021.로또의최고순위와최저순위;

import java.util.Arrays;

public class Solution {
	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];;

		int zero_num = 0;
		int same_num = 0;

		Arrays.sort(lottos);
		Arrays.sort(win_nums);

		for(int lotto : lottos){
			if(lotto == 0) {
				zero_num++;
				continue;
			}
			for(int win_num : win_nums){
				if(win_num == lotto){
					same_num++;
					break;
				}
			}
		}

		answer[0] = 7 - (zero_num + same_num);
		answer[0] = answer[0]>=6 ? 6 : answer[0];
		answer[1] = 7 - (same_num);
		answer[1] = answer[1]>=6 ? 6 : answer[1];

		return answer;
	}

	public static void main(String args[]){
		int lottos[] = {44, 1, 0, 0, 31, 25};
		int win_nums[] = {31, 10, 45, 1, 6, 19};

		System.out.println(Arrays.toString(solution(lottos, win_nums)));
	}
}
