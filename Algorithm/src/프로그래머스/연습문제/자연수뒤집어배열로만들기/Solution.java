package ���α׷��ӽ�.��������.�ڿ���������迭�θ����;

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
