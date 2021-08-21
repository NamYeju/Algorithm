package Algorithm.src.KAKAO.카카오인턴십2020.키패드누르기;

import java.util.Arrays;

/*
* hand : 왼손잡이, 오른손잡이 매개변수
* numbers: 순서대로 누를 번호가 담긴 배열
* answer: 각 번호를 누를 손가락이 왼손인지 오른손인지 나타내는 연속된 문자열
* 123
* 345
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
        int left_location = 0;
        int right_location = 0;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==1 || numbers[i]==3 || numbers[i]==7)
                answer += "L";
            else if (numbers[i]==1 || numbers[i]==3 || numbers[i]==7)
                answer += "R";
            else{

            }
        }
        return answer;
    }
}
