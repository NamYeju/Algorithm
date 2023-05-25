package Algorithm.src.프로그래머스.DFSandBFS.모음사전;

import java.util.*;
public class Solution {
	static String[] alphabet = {"A", "E", "I", "O", "U"};
	static List<String> list = new ArrayList<>();
	public int solution(String word) {
		dfs("", 0);
		int answer = list.indexOf(word);
		return answer;
	}
	public void dfs(String now, int depth){
		list.add(now);
		if(depth == 5) return;
		for(int i = 0; i < 4; i++){
			dfs(now + alphabet[i], depth+1);
		}
	}
}

