package ���α׷��ӽ�.�����ڵ�ç����.�ΰ��̾Ƽ����ϱ�;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<Integer> sumlist = new ArrayList<Integer>();
        for(int i:numbers) {
        	num.add(i);
        }
        Collections.sort(num);
        for(int i=0; i<num.size();i++) {
        	int x = num.get(i);
        	for(int j=i+1; j<num.size(); j++) {
        		int y = num.get(j);
        		int sum = x+y;
        		if(!sumlist.contains(sum))
        			sumlist.add(sum);
        	}
        }
        answer = new int[sumlist.size()];
        for(int i=0; i<sumlist.size(); i++) {
        	answer[i] = sumlist.get(i);
        }
        return answer;
    }
}