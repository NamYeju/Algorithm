package Algorithm.src.프로그래머스.문자열.신규아이디추천;

public class Solution {
public String solution(String new_id) {
  String answer = "";
  answer= new_id.toLowerCase(); // 1단계
  answer= answer.replaceAll("[^a-z0-9._-]", ""); // 2단계
  answer = answer.replaceAll("[.]{2,}", "."); // 3단계
  answer= answer.replaceAll("^\\.|\\.$", ""); // 4단계

  while(answer.length() < 3){
    if(answer.length() == 0)
      answer += "a";
    answer += answer.charAt(answer.length() - 1);
  }
  if(answer.length() > 15){
    answer.substring(0, 16);
    while(answer.charAt(answer.length() - 1) == '.') {
      answer.replaceAll("\\.$", "");
    }
  }
  return answer;
  }
}
