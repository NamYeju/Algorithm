package ���α׷��ӽ�.��������.���ڿ������������ι�ġ�ϱ�;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
	public static void main(String args[]) {
		String s = "Zbcdefg";
		System.out.println(solution(s));
	}
    public static String solution(String s) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        
        char[] arr = new char[s.length()];
        for(int i=0; i<s.length(); i++) {
        	 arr[i] = s.charAt(i);
        }
        
        for(char temp : arr){
          list.add(Character.toString(temp));
        }

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("�������� : " + list);

     
        return answer;
    }
}