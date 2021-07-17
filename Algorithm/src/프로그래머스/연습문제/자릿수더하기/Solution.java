package 프로그래머스.연습문제.자릿수더하기;

import java.util.*;

public class Solution {
	public static void main(String args[]) {
		System.out.println(solution(12));
	}
    public static int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        System.out.println(str);
        for(int i = 0; i<str.length(); i++) {
        	System.out.println(i+"=>"+str.charAt(i));
        	answer += Character.getNumericValue(str.charAt(i));
        }

        return answer;
    }
}
