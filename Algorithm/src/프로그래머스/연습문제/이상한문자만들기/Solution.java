package Algorithm.src.프로그래머스.연습문제.이상한문자만들기;

public class Solution {
    public static void main(String[] args) {
        solution("Gell   sdfaa ");
    }
    public static String solution(String s) {
        String answer = "";

        String[] str = s.split(" ", -1);

//        if(str.length == 1){
//            for(int i=0; i<str[0].length(); i++){
//                char c = str[i].charAt(i);
//                if(i % 2 == 1)
//                    answer += String.valueOf(c).toLowerCase();
//                else if(i%2 == 0)answer += String.valueOf(c).toUpperCase();
//                else if(c == ' ')
//                    answer+= " ";
//            }
//        }


        for(int i=0; i<str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                char c = str[i].charAt(j);
                if(j % 2 == 1)
                    answer += String.valueOf(c).toLowerCase();
                else answer += String.valueOf(c).toUpperCase();

                if(c == 32)
                    answer+= " ";
            }


        }

        System.out.println(answer);
        return answer;
    }
}
