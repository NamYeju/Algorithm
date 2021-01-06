package 연습문제.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Arrays;


public class Solution {
	public static void main(String[] args) {
		int arr[] = {5,9,7,10};

		System.out.print(solution(arr,5));
	}
    public static int[] solution(int[] arr, int divisor) {
    	int[] answer = {};
       
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i]%divisor == 0) {
        		arr2.add(arr[i]);
        	}
        }
 
        if(arr2.isEmpty()) {
        	answer = new int[1];
        	answer[0] = -1;
        }
        else {
        	answer = new int[arr2.size()];
	        for(int i=0; i<arr2.size(); i++) {
	        	answer[i] = arr2.get(i).intValue();
	        	}
	        Arrays.sort(answer);
        }
        	
  

        return answer;
    }
}

