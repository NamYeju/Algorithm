package Algorithm.src.프로그래머스.구현.스킬트리;

public class Solution {
  public int solution(String skill, String[] skill_trees) {
    int answer = 0;

    for(String str : skill_trees){
      if(findSkill(str, skill))
        answer++;
    }
    return answer;
  }

  public boolean findSkill(String user_skill, String skill){
    int now_index = -2;
    for(int i = 0; i < skill.length(); i++){
      int target = user_skill.indexOf(skill.charAt(i));
      if(target >= now_index){
        if(now_index == -1 && target != -1) return false;
        now_index = target;
      }
      if(target < now_index){
        if(target != -1) return false;
        else now_index = target;
      }
    }
    return true;
  }
}
