package Algorithm.src.KAKAO.Blind2022.신고결과받기;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public  int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, HashSet<String>> reportMap = new HashMap<>();
        Map<String, Integer> resultMap = new HashMap<>();

        //resultMap 초기화 -> resultMap의 value값은 answer의 index로 활용
        for(int i=0; i< id_list.length; i++){
            resultMap.put(id_list[i], i);
        }
        //reportMap 초기화
        for(int i=0; i<id_list.length; i++){
            reportMap.put(id_list[i], new HashSet<>());
        }

        // String[] -> map 형태의 report
        for(String s : report){
            String[] str = s.split(" ");
            reportMap.get(str[1]).add(str[0]);
        }

        // 정지당할 회원 추출 : hashset size >= k
        for(int i=0; i<id_list.length; i++){
            HashSet<String> userList = reportMap.get(id_list[i]);
            if(userList.size() >= k){
                for(String name : userList)
                    answer[resultMap.get(name)]++;
            }
        }

        return answer;
    }
}
