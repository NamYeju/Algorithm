package KAKAO.Winter2019.크레인인형뽑기게임;

import java.util.ArrayList;

/*++
 * 42
00000  [0][0]...[0][4]
00000   
00500 
02442
05131  [4][0] ...[4][4]         
 */
class Solution {
    static ArrayList<Integer> arr = new ArrayList<Integer>();
    static int answer = 0;
    public static int solution(int[][] board, int[] moves) {
        for(int i=0; i<moves.length; i++) {
        	System.out.println(i);
        	if(moves[i] == 1) {
        		System.out.println("*");
        		func(1, board);
        	}
        	if(moves[i] == 2) {
        		System.out.println("**");
        		func(2, board);
        	}
        	if(moves[i] == 3) {
        		func(3, board);
        	}
        	if(moves[i] == 4) {
        		func(4, board);
        	}
        	if(moves[i] == 5) {
        		System.out.println("*****");
        		func(5, board);
        	}
        }
        return answer;
    }
    public static void func(int x, int[][]board) {
    	for(int i=0; i<arr.size(); i++) {
    		System.out.println("arr[]="+ arr.get(i));
    	}
		for(int j=0; j<board[x-1].length; j++) {
			if(board[j][x-1]!=0) {
				if(arr.size()==0) {
					arr.add(board[j][x-1]);
				   	for(int i=0; i<arr.size(); i++) {
			    		System.out.println("arr[]="+ arr.get(i));
			    	}
				}
				else {
					if(arr.get(arr.size()-1) == board[j][x-1]) {
						arr.remove(arr.size()-1);
					   	for(int i=0; i<arr.size(); i++) {
				    		System.out.println("arr[]="+ arr.get(i));
				    	}
						answer += 2;
					}
				}
				board[j][x-1] = 0;
				break;
			}
			else break;
		}
    }
    public static void main(String args[]) {
    	int board[][] = {{0,0,0,0,0}, {0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
    	int moves[] = {1,5,3,5,1,2,1,4};
    	System.out.println(solution(board, moves));
    }
}