package Algorithm.src.KAKAO.채용연계형인턴십2021.숫자문자열과영단어;

class Solution {
    public int solution(String s) {

        String[] num = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i=0; i<10; i++){
            s = s.replace(num[i], Integer.toString(i));
        }

        int answer = Integer.parseInt(s);

        return answer;
    }
}
