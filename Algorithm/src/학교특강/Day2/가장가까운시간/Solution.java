package Algorithm.src.학교특강.Day2.가장가까운시간;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    // 주어진 시간을 분 단위로 바꿈
    public static int getTime(String time){
        String[] tmp = time.split(":");
        int H = Integer.parseInt(tmp[0]); // 시간
        int M = Integer.parseInt(tmp[1]); // 분

        return H*60 + M;
    }

    public static int solution(String[] times){
        ArrayList<Integer> tmp = new ArrayList<>();
        int answer;

        for(int i=0; i<times.length; i++){
            tmp.add(getTime(times[0]));
        }

//        for(String x:times){
//            tmp.add(getTime(x));
//        }

        Collections.sort(tmp);

        answer = 24*60 + tmp.get(0) - tmp.get(tmp.size()-1);

        for(int i=1; i< tmp.size(); i++){
            answer = Math.min(answer, tmp.get(i) - tmp.get(i-1));
        }

        return answer;

    }

    public static void main(String[] args) {
        String[] tmp = new String[]{"00:12","00:00", "01:05", "00:57"};
        System.out.println(solution(tmp));


    }
}
