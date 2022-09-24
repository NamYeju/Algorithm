package Algorithm.src.학교특강.Day3.스택.괄호문자제거;

import java.util.Stack;

public class Solution {
    public static String solution(String str){
        String answer="";
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()){
            if(c == ')') {
                while (stack.pop()!='(');
            }
            else stack.push(c);
        }
        for (char c : stack)
            answer += c;

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution("(A(BC)D)EF(G(H)(IJ)K)LM(N)"));
    }
}
