package ���α׷��ӽ�.�׸���.ü����;

import java.util.ArrayList;

/*
 ������ ������ ���� �� �ִ� �л� ��: 
 reverse�� �ش��ϴ� �л� //1
 ��ü�л��� lost/reverse ���� �ƹ��͵� �ش�ȵǴ� �л�  //2
 �߰��л�:
 reserve�� -1 +1 �л���ȣ�� lost��ȣ�� ��ġ�ϴ� //3
 �� reverse�� lost�� ��� ���ԵǸ� reverse���� �����ؾߵ�
 * */
class Solution {
	public static void main(String args[]) {
		int []lost = {3};
		int []reserve = {3};
		System.out.println(solution(3, lost, reserve));
		}
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        ArrayList<Integer>lost_arr = new ArrayList<Integer>();
        ArrayList<Integer>reserve_arr = new ArrayList<Integer>();
        
        answer += n-lost.length; //1,2
        
        for(int i=0; i<lost.length; i++) {
        	lost_arr.add(lost[i]);
        }
        for(int i=0; i<reserve.length; i++) {
        	reserve_arr.add(reserve[i]);
        }
        for(int i=0; i<reserve_arr.size(); i++) {
        	if(lost_arr.contains(reserve_arr.get(i))) {
        		lost_arr.set(lost_arr.indexOf(reserve_arr.get(i)), -1);
        		reserve_arr.set(reserve_arr.indexOf(reserve_arr.get(i)), -1);
        		answer++;
        	}
        }
    
        //3
        for(int i=0; i<lost_arr.size(); i++) {
        	if(lost_arr.get(i) == 1) {
        		if(reserve_arr.contains(lost_arr.get(i)+1)) {
        			reserve_arr.remove(Integer.valueOf(lost_arr.get(i)+1));
        			answer++;
        		}
        	}
        	else if(lost_arr.get(i)>1 && lost_arr.get(i)<n) {        	
        		if(reserve_arr.contains(lost_arr.get(i)-1)){
        			reserve_arr.remove(Integer.valueOf(lost_arr.get(i)-1));
        			answer++;
        		}
        		else if(reserve_arr.contains(lost_arr.get(i)+1)){
        			reserve_arr.remove(Integer.valueOf(lost_arr.get(i)+1));
        			answer++;
        			
        		}
        	}
        	else if(lost_arr.get(i) == n)
        		if(reserve_arr.contains(lost_arr.get(i)-1)){
        			reserve_arr.remove(Integer.valueOf(lost_arr.get(i)-1));
        			answer++;
        		}
        	
        }
        
        return answer;
    }
}
