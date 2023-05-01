package Algorithm.src.프로그래머스.문자열.문자열압축;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int solution(String s) {
		int answer = s.length();
		for(int i = 1; i <= s.length(); i++){
			List<String> tempList = token(i, s);
			System.out.println(tempList);
		}
		return answer;
	}
	public List<String> token(int n, String s){
		List<String> tokenList = new ArrayList<>();
		int cnt = 0;
		for(int i = 0; i + n  <= s.length(); i = i + n){
			tokenList.add(s.substring(i, i + n));
			cnt++;
		}
		// 알맞게 토큰 자른 후 나머지 토큰
		if(cnt * n < s.length()){
			tokenList.add(s.substring(cnt * n - 1));
		}

		return tokenList;
	}
}
