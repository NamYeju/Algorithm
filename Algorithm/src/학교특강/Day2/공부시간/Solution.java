package Algorithm.src.학교특강.Day2.공부시간;

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

    public static String solution(String[] times){
        ArrayList<Integer> log = new ArrayList<>();
        int a=0;

        for(String x:times){
            log.add(getTime(x));
        }

        for(int i=0; i<log.size(); i+=2){
            int time = log.get(i+1) - log.get(i);

            if(time<5)
                a += 0;
            else if(time>105)
                a+=105;
            else
                a+=time;
        }

        int H = a / 60;
        int M = a % 60;

        return (H<10?"0"+H:H) + ":" + (M<10?"0"+M:M);

    }

    public static void main(String[] args) {
        String[] log = new String[]{"08:30", "09:00", "14:00", "16:00", "16:01", "16:06", "16:07", "16:11"};
        System.out.println(solution(log));

    }
}
