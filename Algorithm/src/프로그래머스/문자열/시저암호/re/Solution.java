package Algorithm.src.프로그래머스.문자열.시저암호.re;

public class Solution {
	public String solution(String s, int n) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		for(char c : s.toCharArray()){
			sb.append(push(c, n));
		}
		answer = sb.toString();
		return answer;
	}
	public char push(char c, int n){
		if(c == ' ')
			return ' ';
		char offset = Character.isUpperCase(c) ? 'A' : 'a';
		int position = c - offset;
		position = (position + n) % 26;

		return (char) (offset + position);
	}
}
