package ���α׷��ӽ�.�׸���.ü����;

import java.util.ArrayList;

/*
 ������ ������ ���� �� �ִ� �л� ��: 
 reverse�� �ش��ϴ� �л� //1
 ��ü�л��� lost/reverse ���� �ƹ��͵� �ش�ȵǴ� �л�  //2
 �߰��л�:
 reserve�� -1 +1 �л���ȣ�� lost��ȣ�� ��ġ�ϴ� //3
 * */
class Solution {
	public static void main(String args[]) {
		int []lost = {3};
		int []reserve = {1};
		System.out.println(solution(3, lost, reserve));
		}
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        ArrayList<Integer>arr = new ArrayList<Integer>(); //lost�� �ֵ��� ������ �� �л���ȣ
        ArrayList<Integer>arr2 = new ArrayList<Integer>();
        answer += n-lost.length; //1,2
        //3
        for(int i=0; i<lost.length; i++) {
        	if(lost[i] == 1) 
        		arr.add(lost[i]+1);
        	else if(lost[i]>1 && lost[i]<n) {        	
        		arr.add(lost[i]-1);
        		arr.add(lost[i]+1);
        	}
        	else if(lost[i] == n)
        		arr.add(lost[i]-1);
        	
        }

        for(int i=0; i<arr.size(); i++) {
        	for(int j=0; j<reserve.length; j++) {
        		if(arr.get(i) == reserve[j])
        			arr2.add(Integer.valueOf(arr.get(i)));
        	}
        }
        
        for(int i=0; i<lost.length;i++) {
        	if(arr2.contains(lost[i]-1)) {
        		while(arr2.remove(Integer.valueOf(lost[i]-1))) {};
        		answer+=1;
        	}
        	else if(arr2.contains(lost[i]+1)) {
        		while(arr2.remove(Integer.valueOf(lost[i]+1))) {};
        		answer+=1;
        	}
        }
        
        return answer;
    }
}
