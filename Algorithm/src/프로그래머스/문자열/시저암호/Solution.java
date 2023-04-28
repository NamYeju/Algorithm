package Algorithm.src.프로그래머스.문자열.시저암호;

public class Solution {
	public String solution(String s, int n) {
		String answer = "";

		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == ' ')
				sb.append(" ");
			else{
				char newC = (char)(s.charAt(i) + n);
				if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
					if(newC > 'z'){
						newC = (char)(newC - 'z' - 1 + 'a');
					}
				}
				else{
					if(newC > 'Z'){
						newC = (char)(newC - 'Z' - 1 + 'A');
					}
				}
				sb.append(newC);
			}
		}
		answer = sb.toString();
		return answer;
	}
}
