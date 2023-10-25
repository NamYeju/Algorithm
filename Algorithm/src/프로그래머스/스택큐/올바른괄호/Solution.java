package Algorithm.src.프로그래머스.스택큐.올바른괄호;

import java.util.*;
public class Solution {
  boolean solution(String s) {
    Stack<Character> st = new Stack<>();

    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) == '(') st.add('(');
      if(s.charAt(i) == ')'){
        if(st.empty()) return false;
        st.pop();
      }
    }
    return st.empty();
  }
}
