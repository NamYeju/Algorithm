package 프로그래머스.연습문제.두정수사이의합;

public class Solution {
    public long solution(int a, int b) {
    	long answer = 0;
    	if(a<b)
    		for(int i = a; i<=b;i++)
    			answer += i;
        if(a>b)
        	for(int i = b; i<=a; i++)
        		answer += i;
        if(a==b)
        	answer = a;
        
        return answer;
    }
}
