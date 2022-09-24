package Algorithm.src.학교특강.Day3.스택.충돌하는수열;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public static ArrayList<Integer> solution(int[] nums){
        ArrayList<Integer> answer=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        for(int x : nums){
            if(x>0) stack.push(x);
            else{
                if(stack.empty() || stack.peek()<0) stack.push(x);
                else{
                    int flag=0;
                    while(!stack.empty() && stack.peek()>0){
                        int left=stack.pop();
                        if(Math.abs(x)>left) flag=1;
                        else if(Math.abs(x)==left){
                            flag=0;
                            break;
                        }
                        else{
                            stack.push(left);
                            flag=0;
                            break;
                        }
                    }
                    if(flag==1) stack.push(x);
                }
            }
        }
        for(int x : stack) answer.add(x);
        return answer;
    }

    public static void main(String[] args){
        int[] arr = new int[]{-2, -1,  2, 1, -3, 2};
        System.out.println(solution(arr));
    }
}
