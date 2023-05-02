package Algorithm.src.프로그래머스.문자열.문자열내p와y의개수;

public class Solution {
	boolean solution(String s) {
		boolean answer = true;
		s = s.toLowerCase();

		int pCnt = 0, yCnt = 0;
		for(char c : s.toCharArray()){
			if(c == 'p')
				pCnt++;
			if(c == 'y')
				yCnt++;
		}
		answer = (pCnt == yCnt) ? true : false;

		return answer;
	}
}
