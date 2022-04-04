package Algorithm.src.프로그래머스.연습문제.소수찾기;

import java.util.ArrayList;

public class Solution {
    static int answer = 0;
    public static int solution(int n){
        int nList[] = new int[n+1];
        ArrayList<Integer> isPrimeNumber = new ArrayList<>();

        for(int i=0; i<=n; i++){
            nList[i]=i;
        }
        for(int i=2; i<=n; i++){
            if(nList[i] == 0)
                continue;
            isPrimeNumber.add(i);
            for(int j=i+i; j<=n; j+=i){
                nList[j] = 0;
            }
        }
        answer = isPrimeNumber.size();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }

}



