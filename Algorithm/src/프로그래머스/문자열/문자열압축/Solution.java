package Algorithm.src.프로그래머스.문자열.문자열압축;

import java.util.*;

public class Solution {
	public int solution(String s) {
		int answer = s.length();
		for(int i = 1; i <= s.length(); i++){
			List<String> tempList = token(i, s);
			answer = Math.min(answer,result(tempList));
		}
		return answer;
	}
	public List<String> token(int n, String s){
		List<String> tokenList = new ArrayList<>();
		int lastIndex = 0;
		for(int startIndex = 0; startIndex < s.length(); startIndex = lastIndex){
			lastIndex = startIndex + n;
			if(lastIndex > s.length() - 1)
				lastIndex = s.length();
			tokenList.add(s.substring(startIndex, lastIndex));
		}
		return tokenList;
	}
	public int result(List<String> tokenList){
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		String last = "";
		for(int i = 0; i < tokenList.size(); i++){
			String now = tokenList.get(i);
			if(now.equals(last)){
				cnt++;
			}
			else {
				if(cnt > 1){
					sb.append(cnt);}
				sb.append(last);
				last = now;
				cnt = 1;
			}
		}
		if(cnt > 1)
			sb.append(cnt);
		sb.append(last);
		return sb.toString().length();
	}
}