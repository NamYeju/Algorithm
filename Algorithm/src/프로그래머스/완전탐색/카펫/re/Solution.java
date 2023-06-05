package Algorithm.src.프로그래머스.완전탐색.카펫.re;

public class Solution {
  public int[] solution(int brown, int yellow) {
    int[] answer = new int[2];
    for(int i = 1; i <= Math.sqrt(yellow); i++){
      if(yellow % i == 0){
        int height = i;
        int width = yellow/i;
        if((width + 2) * 2 + (height * 2) == brown){
          answer[0] = width + 2;
          answer[1] = height + 2;
        }
      }
    }
    return answer;
  }
}
