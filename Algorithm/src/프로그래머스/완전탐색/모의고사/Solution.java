package 프로그래머스.완전탐색.모의고사;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
	public static void main(String args[]) {
		int[]answers = {1,2,3,4,5};
		System.out.print(Arrays.toString(solution(answers)));
	}
    public static int[] solution(int[] answers) {
        int[] answer = {};
        ArrayList<Integer>arr = new ArrayList<Integer>();
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        
        int num_a = 0, num_b = 0, num_c = 0;
        
        //답 비교
        for(int i=0; i<answers.length;i++) {
        	if(answers[i]==a[i%5])
        		num_a++;
        	if(answers[i]==b[i%8])
        		num_b++;
        	if(answers[i]==c[i%10])
        		num_c++;
        }
        

        // 점수 비교
        int max = Math.max(num_a,(Math.max(num_b, num_c)));
        if(num_a == max)
        	arr.add(1);
        if(num_b == max)
        	arr.add(2);
        if(num_c == max)
        	arr.add(3);
        

       	Collections.sort(arr);
       	answer = new int[arr.size()];
        for(int i=0;i<arr.size();i++) {
        	answer[i] = arr.get(i);
        	System.out.print(answer[i]+"\n");
        }

        return answer;
    }
}
