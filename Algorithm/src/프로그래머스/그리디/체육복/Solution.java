package ���α׷��ӽ�.�׸���.ü����;

import java.util.ArrayList;

/*
 * ��ü�л��� n lost���������л���ȣ reserveü�����ִ��л���ȣ
 * 2<=n<=30
 * 1<=lost.length<=n
 * 
 * 
 * */
class Solution {
	public static void main(String args[]) {
		int []lost = {2, 4};
		int []reserve = {1, 3, 5};
		solution(5, lost, reserve);
	}
    public static void solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        ArrayList<Integer>arr = new ArrayList<Integer>();
        for(int i=0; i<reserve.length; i++) {
        	if(reserve[i] == 1) 
        		arr.add(reserve[i]+1);
        	else if(reserve[i]>1 && reserve[i]<n) {
        		if(!arr.contains(reserve[i]-1))
        			arr.add(reserve[i]-1);
        		if(!arr.contains(reserve[i]+1))	
        			arr.add(reserve[i]+1);
        	}
        	else if(reserve[i] == n){
        		if(!arr.contains(reserve[i]-1))
        			arr.add(reserve[i]-1);
        	}
        }
        for(int i=0; i<arr.size(); i++)
        	System.out.println(arr.get(i));
        //return answer;
    }
}
