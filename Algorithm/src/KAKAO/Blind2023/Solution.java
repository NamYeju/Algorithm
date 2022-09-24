package Algorithm.src.KAKAO.Blind2023;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 today "2022.05.19"
 terms["A 6", "B 12", "C 3"] // 1달 -> 28일
 privacies["2021.05.02 A", "2021.07.01 B" "2022.02.19 C", "2022.02.20 C"]
 result[1,3]

 1. privacies의 날짜와 약관날짜를 더한다
    이떄, 기존의 달 + 유효기간  > 12 => 내년으로 넘어감
 2. today를 넘어가면 result에 추가

 hashMap today year:2022 month:05 day:19
 hashMap privacies year:2021 month: 05 day: 02 terms: 6 (배열 privacies의 텀 스트링을 month로 replace)

 */
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};

        //1-1 . 해시맵 변환
        HashMap<String, String> todayMap = new HashMap<>();
        String[] sToday = today.split(".");
        todayMap.put("year", sToday[0]);
        todayMap.put("month", sToday[1]);
        todayMap.put("day", sToday[2]);

        // 1-2
        HashMap<String, String> mP = new HashMap<>();
        for(int i=0; i< privacies.length; i++){
            String[] s = privacies[i].split(" ");
            String[] splitS = s[0].split(".");
            mP.put("year", splitS[0]);
            mP.put("month", splitS[1]);
            mP.put("day", splitS[2]);

            //s[1]
        }



        return answer;
    }
}

// 문제점 배열에 담긴 여러 값들을 각각 어떻게 꺼내서 비교하지 ?