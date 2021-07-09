package 프로그래머스.그리디.체육복;

import java.util.ArrayList;

/*
 무조건 수업을 들을 수 있는 학생 수: 
 reverse에 해당하는 학생 //1
 전체학생중 lost/reverse 둘중 아무것도 해당안되는 학생  //2
 추가학생:
 reserve의 -1 +1 학생번호중 lost번호와 일치하는 //3
 * */
class Solution {
	public static void main(String args[]) {
		int []lost = {3};
		int []reserve = {1};
		System.out.println(solution(3, lost, reserve));
		}
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        ArrayList<Integer>arr = new ArrayList<Integer>(); //lost인 애들이 빌려야 할 학생번호
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
