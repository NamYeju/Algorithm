package Algorithm.src.프로그래머스.연습문제.제일작은수제거하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴
 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴
 * */
public class Solution {

    public static int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> arrList = new ArrayList<>();

        if(arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        for(int i : arr){
            arrList.add(i);
        }

        int min = arrList.get(0);

        for(int i=0; i< arrList.size(); i++){
            if(min > arrList.get(i))
                min = arrList.get(i);
        }

        arrList.remove(Integer.valueOf(min));

        answer = new int[arrList.size()];
        for(int i=0; i< arrList.size(); i++){
            answer[i] = arrList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arrs = new int[]{4};
        System.out.println(Arrays.toString(solution(arrs)));
    }
}
