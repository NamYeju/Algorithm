package Algorithm.src.KAKAO.카카오인턴십2020.키패드누르기;

import java.util.Arrays;
import java.util.Locale;

/*
* hand : 왼손잡이, 오른손잡이 매개변수
* numbers: 순서대로 누를 번호가 담긴 배열
* answer: 각 번호를 누를 손가락이 왼손인지 오른손인지 나타내는 연속된 문자열
* 123
* 456
* 789
*  0
* */
public class Solution {
    public static void main(String[] args){
        int[] numbers = {1,3,4,5,8,2,1,4,5,9,5};
        String hand = "right";
        System.out.println(solution(numbers, hand));
    }
    public static String solution(int[] numbers, String hand) {
        String answer = "";
        int keypad[][]={{-1,0,-1},{7,8,9},{4,5,6},{1,2,3}};
        int left_location = 0;
        int right_location = 0;

        for(int i=0; i< numbers.length; i++){
            for(int j=0; j<3; j++){
                if(numbers[i] == keypad[j][0]) {
                    answer += 'L';
                    left_location = j;
                }
                else if(numbers[i] == keypad[j][2]) {
                    answer += 'R';
                    right_location = j;
                }
                else if(numbers[i] == keypad[j][1]){
                    if(Math.abs(j-left_location) == Math.abs(j-right_location))
                        answer += hand.substring(0,1).toUpperCase(Locale.ROOT);
                    else if(Math.abs(j-left_location) < Math.abs(j-right_location))
                        answer += 'L';
                    else
                        answer += 'R';
                }
            }

        }
        return answer;
    }
}
