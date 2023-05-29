package Algorithm.src.프로그래머스.DFSandBFS.모음사전;

public class Solution {
	static char[] alphabet = {'A', 'E', 'I', 'O', 'U'};
	static int cnt;
	static int answer;
	public int solution(String word) {
		cnt = 0;
		answer = 0;
		dfs(word,"", 0);
		return answer;
	}
	public void dfs(String word, String str, int depth){
		if(str.equals(word)){
			answer = cnt;
			return;
		}
		if(depth == 5) {
			cnt++;
			return;
		}
		cnt++;
		for(int i = 0; i < alphabet.length; i++){
			dfs(word, str + alphabet[i], depth+1);
		}
	}
}


