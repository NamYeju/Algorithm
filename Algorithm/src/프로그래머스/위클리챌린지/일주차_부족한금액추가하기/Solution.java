package Algorithm.src.프로그래머스.위클리챌린지.일주차_부족한금액추가하기;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total_price = 0;
        for(int i=1; i<=count; i++){
            total_price += (long)price * i;
        }
        if(total_price >= (long)money)
            answer = total_price - (long)money;
        else answer = 0;
        return answer;
    }

}
