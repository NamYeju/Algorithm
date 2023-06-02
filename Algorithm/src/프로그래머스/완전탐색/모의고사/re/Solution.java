package Algorithm.src.프로그래머스.완전탐색.모의고사.re;

import java.util.Arrays;

public class Solution {
  public int[] solution(int[] answers) {

    int[][] rules = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
    int[] score = {0,0,0};
    int max = 0;

    for(int i = 0; i < rules.length; i++){
      int[] rule = rules[i];
      for(int j = 0; j < answers.length; j++){
        if(answers[j] == rule[j % rule.length]){
          if(++score[i] > max)
            max = score[i];
        }
      }
    }

    final int finalMax = max;

    return Arrays.stream(score)
        .filter(i -> i == finalMax)
        .map(i -> i + 1)
        .toArray();
  }
}
