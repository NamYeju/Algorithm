package Algorithm.src.프로그래머스.그리디.조이스틱;

public class Solution {
    public static void main(String[] args) {
        solution("JEROEN");
    }
    static public int solution(String name) {
        // A B C D E F G H I J K L M | N O P Q R S T U V Y X Y Z
        // AAA -> JAZ

        int answer = 0;
        // 순환 돌면서 연속되는 A 갯수 세기
        int aCount=0;
        for(int i=0; i<name.length()-1; i++){
            if(name.charAt(i)=='A' && name.charAt(i+1)=='A')
                aCount++;
        }
        aCount+=1;

        if(aCount<name.length()/2) {
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) != 'A') {
                    if (name.charAt(i) <= 'M') {
                        answer += name.charAt(i) - 'A' + 1; // +1은 right 방향의 이동횟수 의미
                        System.out.println("i: " + i + "and answer: " + answer);
                    } else {
                        answer += 'Z' - name.charAt(i) + 2; //+2는 A에서 Z로 이동하는 횟수 의미 + right 방향의 이동횟수
                        System.out.println("i: " + i + "and answer: " + answer);
                    }
                } else {
                    answer += 1;
                    System.out.println("i: " + i + "and answer: " + answer);
                }
            }
            answer -= 1;
        }
        System.out.println(answer);
        return answer;
    }
}
