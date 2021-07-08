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
    		for(int j=0; j<board[moves[i]-1].length; j++) {
    			if(board[j][moves[i]-1]!=0) {
    				if(arr.isEmpty()) {
    					arr.add(board[j][moves[i]-1]);
    				}
    				else {
    					if(arr.get(arr.size()-1) == board[j][moves[i]-1]) {
    						arr.remove(arr.size()-1);
    						answer += 2;
    					}
    					else arr.add(board[j][moves[i]-1]);
    					
    				}
    				board[j][moves[i]-1] = 0;
    				break;
    			}
    		}
        }
        return answer;
    }
   

    public static void main(String args[]) {
    	int board[][] = {{0,0,0,0,0}, {0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
    	int moves[] = {1,5,3,5,1,2,1,4};
    	System.out.println(solution(board, moves));
    }
}