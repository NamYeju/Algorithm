package 프로그래머스.완전탐색.소수찾기;

public class Solution {
	public static void main(String args[]) {
		solution("17");
	}
    public static void solution(String numbers) {
        int answer = 0;
        int num[] = new int[numbers.length()];
        for(int i=0; i<numbers.length();i++) {
        	num[i] = Character.getNumericValue(numbers.charAt(i));
        	System.out.println(num[i]);
        }
        //return answer;
    }
}
