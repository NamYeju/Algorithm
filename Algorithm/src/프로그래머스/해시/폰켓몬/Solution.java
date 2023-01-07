package Algorithm.src.프로그래머스.해시.폰켓몬;

import java.util.HashSet;

class Solution {
	public int solution(int[] nums) {
		int answer = 0;

		int n = nums.length/2;
		HashSet hs = new HashSet();
		for(int x : nums){
			if(!hs.contains(x))
				hs.add(x);
		}

		if(hs.size() < n)
			answer = hs.size();
		else if(hs.size() >= n)
			answer = n;

		return answer;
	}
}