package Algorithm.src.프로그래머스.해시.전화번호목록;

import java.util.HashMap;

public class Solution {
     static void main(String[] args){
        String phone_book[]={"119","97674223","1195524421"};
        System.out.println(solution(phone_book));
    }
    public static boolean solution(String[] phone_book) {
        HashMap<String, Integer> phone_table = new HashMap<String, Integer>();
        boolean answer = true;
        for(int i=0; i<phone_book.length; i++){
            phone_table.put(phone_book[i],i);
        }
        for(int i=0; i<phone_book.length; i++){
            for(int j=1; j<phone_book[i].length(); j++){
                if(phone_table.containsKey(phone_book[i].substring(0,j))) {
                    answer = false;
                    return answer;
                }

            }
        }
        return answer;
    }
}
