package 프로그래머스.연습문제.핸드폰번호가리기;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for(int i=0; i<phone_number.length()-4; i++) {
        	answer+="*";
        }
        answer += phone_number.substring(phone_number.length()-4, phone_number.length());
        return answer;
    }
}