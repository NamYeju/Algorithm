package Algorithm.src.KAKAO.카카오인턴십2020.키패드누르기;

import java.util.Arrays;
import java.util.Locale;

/*
* hand : 왼손잡이, 오른손잡이 매개변수
* numbers: 순서대로 누를 번호가 담긴 배열
* answer: 각 번호를 누를 손가락이 왼손인지 오른손인지 나타내는 연속된 문자열
* 123 //3 [3][1]
* 456 //2 [2][0] [2][1]
* 789 //1
*  0 //0
* => LRLLLRLLRRL
* 긍까 왼손이 4 오른손이 2에 있을때 5 누르려면 거리계산할 때 다 1씩 같은데 내가 지금 456라인 위치값을 2로 놔두고 123라인 위치값을 3으로 놔뒀더니
* 거리가 왼쪽이 더 가깝다고 판단되서 l로 생김.
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
        int[][] left_location = new int[0][0];
        int[][] right_location = new int[0][0];

        for(int i=0; i< numbers.length; i++){
            for(int j=0; j<4; j++){
                if(numbers[i] == keypad[j][0]) {
                    answer += 'L';
                    left_location = j;
                }
                else if(numbers[i] == keypad[j][2]) {
                    answer += 'R';
                    right_location = j;
                }
                else if(numbers[i] == keypad[j][1]){
                    if(Math.abs(j-left_location) == Math.abs(j-right_location)) {
                        if(hand=="right")
                            right_location = j;
                        else if(hand=="left")
                            left_location = j;
                        answer += hand.substring(0, 1).toUpperCase(Locale.ROOT);
                    }
                    else if(Math.abs(j-left_location) < Math.abs(j-right_location)) {
                        left_location = j;
                        answer += 'L';
                    }
                    else {
                        right_location = j;
                        answer += 'R';

                    }
                }
            }

        }
        return answer;
    }
}
