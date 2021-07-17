package 프로그래머스.그리디.체육복;

import java.util.ArrayList;

/*
 무조건 수업을 들을 수 있는 학생 수: 
 reverse에 해당하는 학생 //1
 전체학생중 lost/reverse 둘중 아무것도 해당안되는 학생  //2
 추가학생:
 reserve의 -1 +1 학생번호중 lost번호와 일치하는 //3
 단 reverse와 lost에 모두 포함되면 reverse에서 제거해야됨
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
