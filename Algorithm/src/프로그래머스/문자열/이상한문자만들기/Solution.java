package Algorithm.src.프로그래머스.문자열.이상한문자만들기;

public class Solution {
	public String solution(String s) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		int index = 0;
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if((c != ' ') && (index % 2 == 0)){ // 짝수
				if('a' <= c && c <= 'z')
					c = (char)(c - ('a'-'A'));
				sb.append(c);
				index++;
			}
			else if((c != ' ') && (index % 2 != 0)){ // 홀수
				if('A' <= c && c <= 'Z')
					c = (char)(c + ('a'-'A'));
				sb.append(c);
				index++;
			}
			else{ // 공백
				sb.append(" ");
				index = 0;
			}
		}
		answer = sb.toString();
		return answer;
	}
}