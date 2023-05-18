package Algorithm.src.프로그래머스.배열.거리두기확인하기;

import java.util.*;

public class Solution {
	static char[][] seat;
	public int[] solution(String[][] places) {
		int[] answer = new int[5];
		int i = 0;
		for(String[] place : places){
			answer[i++] = makePlaceArray(place);
		}
		return answer;
	}
	public int makePlaceArray(String[] place){
		seat = new char[5][5];
		ArrayList<Position> p_list = new ArrayList<>();
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				seat[i][j] = place[i].charAt(j);
				if(seat[i][j] == 'P')
					p_list.add(new Position(i, j));
			}
		}
		for(int i = 0; i < p_list.size(); i++){
			for(int j = i +1; j < p_list.size(); j++){
				int x1 = p_list.get(i).x;
				int x2 = p_list.get(j).x;
				int y1 = p_list.get(i).y;
				int y2 = p_list.get(j).y;
				if(Math.abs(x1-x2) + Math.abs(y1-y2) == 1) return 0;
				if(Math.abs(x1-x2) + Math.abs(y1-y2) == 2){
					int temp = isPossible(x1, y1, x2, y2, seat);
					if(temp == 0) return 0;
				}
			}
		}
		return 1;
	}
	public int isPossible(int x1, int y1, int x2, int y2, char[][] seat){
		if((x1 + 1 == x2) && (y1 == y2))
			return 0;
		if((x1 == x2) && (y1 + 1 == y2))
			return 0;
		if((x1 + 1 == x2) && (y1 + 1 == y2) && ((seat[x1+1][y1]=='O')||(seat[x1][y1+1]=='O')))
			return 0;
		if((x1 + 1 == x2) && (y1 - 1 == y2) && ((seat[x1][y1-1]=='O')||(seat[x1+1][y1]=='O')))
			return 0;
		if((x1 == x2) && (y1 + 2 == y2) && (seat[x1][y1+1] == 'O'))
			return 0;
		if((x1 + 2 == x2) && (y1 == y2) && (seat[x1+1][y1] == 'O'))
			return 0;
		return 1;
	}
	class Position{
		int x;
		int y;
		Position(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
}

