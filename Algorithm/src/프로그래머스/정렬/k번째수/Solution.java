package 프로그래머스.정렬.k번째수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
	public static void main(String args[]) {
		int[]array = {1,5,2,6,3,7,4};
		int[][]commands = {{2,5,3},{4,4,1},{1,7,3}};
		
		System.out.print("answer[]="+Arrays.toString(solution(array,commands)));
	}
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        ArrayList<Integer>array2 = new ArrayList<Integer>();
        
        for(int i=0; i<commands.length;i++) {
        	if(!(array2.isEmpty())) {
        		array2.clear();
        	}
	       	for(int j=commands[i][0];j<=commands[i][1];j++) {
	       		array2.add(array[j-1]);
	       	}
	       	Collections.sort(array2);
	       	
	        answer[i] = array2.get(commands[i][2]-1);

        }

        return answer;
    }
}
