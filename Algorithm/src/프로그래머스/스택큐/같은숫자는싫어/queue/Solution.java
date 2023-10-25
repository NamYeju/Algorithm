package Algorithm.src.프로그래머스.스택큐.같은숫자는싫어.queue;

import java.util.*;

public class Solution {
  public ArrayList<Integer> solution(int []arr) {
    Queue<Integer> queue = new LinkedList<>();
    ArrayList<Integer> answer = new ArrayList<>();
    for(int x : arr){
      if(queue.size() == 0){
        queue.offer(x);
        answer.add(x);
      }
      if(queue.size() != 0 && queue.peek() != x){
        queue.poll();
        queue.offer(x);
        answer.add(x);
      }
    }
    return answer;
  }
}
