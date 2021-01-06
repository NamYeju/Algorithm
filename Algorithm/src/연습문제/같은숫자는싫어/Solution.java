package 연습문제.같은숫자는싫어;

import java.util.*;

public class Solution {
	
    public int[] solution(int []arr) {
        
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for(int i=1; i<arr.length; i++) {
        	
        	if(arr[i-1] != arr[i]) {
        		arr2.add(arr[i-1]);
        	}
		if(i==arr.length-1) {
        		arr2.add(arr[i]);
        	}
        	
        }
        int[] answer = new int[arr2.size()];
        for(int i=0;i<arr2.size();i++) {
        	answer[i] = arr2.get(i);
        }
   
        System.out.println("Hello Java");

        return answer;
    }
}
 
