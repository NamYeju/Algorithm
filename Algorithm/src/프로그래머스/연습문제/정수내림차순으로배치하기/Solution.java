package Algorithm.src.프로그래머스.연습문제.정수내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴. 예를들어 118372면 873211
 *
 * */
public class Solution {
    public static long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        Integer[] arr = new Integer[str.length()];

        for(int i=0; i<str.length(); i++){
            arr[i] = Character.getNumericValue(str.charAt(i));
        }

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));

        String s="";
        for(int i=0; i<arr.length; i++){
            s+=arr[i];
            System.out.println(s);
        }
        answer = Long.parseLong(s);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(11830072));
    }
}
