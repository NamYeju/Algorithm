package Algorithm.src.프로그래머스.스택큐.같은숫자는싫어;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
	public static int[] solution(int []arr) {
		int[] answer = {};

		Stack<Integer> stack = new Stack();
		for(int i:arr){
			if(stack.size() == 0 || stack.peek()!=i)
				stack.push(i);
		}

		answer = new int[stack.size()];

		for(int i=stack.size()-1; i>=0; i--){
			answer[i] = stack.pop();
		}

		return answer;
	}
	public static void main(String[] args) {
		int[] arr = new int[]{4,4,4,3,3};
		System.out.println(Arrays.toString(solution(arr)));
	}
}
