package 연습문제.나누어떨어지는숫자배열;

import java.util.ArrayList;


public class Solution {
	public static void main(String[] args) {
		int arr[] = {5,9,7,10};
		
		System.out.print("asdf");
		System.out.print(solution(arr,5));
	}
    public static int[] solution(int[] arr, int divisor) {
    	
       
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i]%divisor == 0) {
        		arr2.add(arr[i]);
        	}
        }
 
        	int[] answer = new int[arr2.size()];
        
        	if(arr2.size()==0) {
        		answer[0] = -1;
        	}
	        for(int i=0; i<arr2.size(); i++) {
	        	answer[i] = arr2.get(i).intValue();
	        	}
        
        
        return answer;
    }
}
