package 해시.완주하지못한선수;

import java.util.HashMap;

public class Solution {
	public static void main(String args[]){
		String arr[]= {"leo","kiki","eden"};
		String arr2[]= {"eden","kiki"};
		System.out.print(solution(arr,arr2));

	}
    public static String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String answer = "";

        
        for(int i=0; i<participant.length; i++) {
        	map.put(participant[i], map.getOrDefault(participant[i], 0)+1);
        }
        
        for(int i=0; i<completion.length; i++) {
        	map.put(completion[i], map.get(completion[i])-1);
        }
        
        for (String key : map.keySet()) {
        	if (map.get(key)!=0) {
        		answer = key;
        		}
        	}

        return answer;
    }
}
