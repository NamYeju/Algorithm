package Algorithm.src.프로그래머스.정렬.가장큰수;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static  void main(String args[]){
        int numbers[] = {6,10,2};
        solution(numbers);
    }
    public static String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];

        for(int i=0; i<numbers.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        if(str[0].equals(0))
            return "0";
        else{
            for(int i=0; i<str.length; i++){
                answer += str[i];
            }
        }
        return answer;
    }
}
