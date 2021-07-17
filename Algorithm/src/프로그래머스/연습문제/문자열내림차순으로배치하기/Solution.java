package 프로그래머스.연습문제.문자열내림차순으로배치하기;

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
        System.out.println("내림차순 : " + list);

     
        return answer;
    }
}