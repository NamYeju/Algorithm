package Algorithm.src.개념.스택;

import java.util.Stack;

public class Main {
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        stack.push(5);
        stack.push(4);
        stack.pop();
        stack.push(6);
        stack.pop();
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
        return;
    }
}
