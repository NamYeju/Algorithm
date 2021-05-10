package 프로그래머스.완전탐색.카펫;
/*
 yellow의 가로, 세로를  x,y라고 할 때
 brown의 갯수는 (x+y)*2 + 4
 brown이 가로, 세로 길이는 x+2 y+2
 
 24 -> 4/6 8/3
 
 1.yellow를  x y=yellow/x
 2. (x+y)*2 + 4 = brown 인게 최종 x,y
 answer[0] = x+2, y+2
 단 x+2 >= y+2
 */
public class Solution {
    public static int[] solution(int brown, int yellow) {
        int x, y;
        int height=0, weight=0;
    	int[] answer = {};
        answer = new int[2];
        for(int i=1; i<=yellow; i++) {
        	if(yellow % i == 0) {
        		x = i;
        		y = yellow / i;
        		if((x+y)*2+4 == brown && x>=y) {
        			height = x;
        			weight = y;
        			System.out.println(x);
        			System.out.println(y);
        			break;
        		}
        		
        	}
        }
        answer[0] = height;
        answer[1] = weight;
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    	return answer;
    }
    public static void main (String args[]) {
    	solution(10,2);
    }
}
