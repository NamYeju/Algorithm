package Algorithm.src.KAKAO.카카오인턴십2022.성격유형검사하기;

import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        System.out.println(solution(survey, choices));
    }

    public static String solution(String[] survey, int[] choices) {
        String answer="";

        HashMap<String, Integer> score = new HashMap<>();
        score.put("R", 0);
        score.put("T", 0);
        score.put("C", 0);
        score.put("F", 0);
        score.put("J", 0);
        score.put("M", 0);
        score.put("A", 0);
        score.put("N", 0);

        for(int i=0; i<choices.length; i++){
            // 비동의
            if(choices[i]>=1 && choices[i]<=3){
                int newScore = score.get(survey[i].substring(0, 1)) + 4-choices[i];
                score.put(survey[i].substring(0, 1), newScore);
            }
            // 동의
            else if(choices[i]>=5 && choices[i]<=7){
                int newScore = score.get(survey[i].substring(1)) + choices[i]-4;
                score.put(survey[i].substring(1), newScore);
            }
        }

        answer += score.get("R")>=score.get("T") ? "R" : "T";
        answer += score.get("C")>=score.get("F") ? "C" : "F";
        answer += score.get("J")>=score.get("M") ? "J" : "M";
        answer += score.get("A")>=score.get("N") ? "A" : "N";

        return answer;
    }
}
