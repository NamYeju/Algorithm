package 프로그래머스.연습문제.자연수뒤집어배열로만들기;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        String str = String.valueOf(n);
        answer = new int[str.length()];
        
        for(int i = str.length()-1; i>=0; i--) {
        	answer[str.length()-(i+1)] = Character.getNumericValue(str.charAt(i));
        }
        return answer;
    }
}
