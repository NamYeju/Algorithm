package Algorithm.src.프로그래머스.문자열.문자열다루기기본;

public class Solution {
  public boolean solution(String s) {
    if(s.length() != 4 && s.length() != 6)
      return false;
    return s.matches("[0-9]+");
  }
}
