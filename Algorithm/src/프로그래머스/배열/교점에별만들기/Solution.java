package Algorithm.src.프로그래머스.배열.교점에별만들기;

import java.util.*;

public class Solution {
	private static class Point{
		private final long x, y;
		private Point(long x, long y){
			this.x = x;
			this.y = y;
		}
	}
	// 교점 구하기
	public Point intersection(long a1, long b1, long c1, long a2, long b2, long c2){

		double x = (double)((b1 * c2) - (b2 * c1)) / ((a1 * b2) - (a2 * b1));
		double y = (double)((a2 * c1) - (a1 * c2)) / ((a1 * b2) - (a2 * b1));

		// 정수 판별
		if(x % 1 != 0 || y % 1 != 0)
			return null;

		return new Point((long)x, (long)y);
	}
	// 교점 중 가장 큰 x값, y값
	public Point maxPoint(List<Point> pointList){
		long mX = Long.MIN_VALUE;
		long mY = Long.MIN_VALUE;
		for(Point p : pointList){
			if(p.x > mX) mX = p.x;
			if(p.y > mY) mY = p.y;
		}
		return new Point(mX, mY);
	}
	// 교점 중 가장 작은 x값, y값
	public Point minPoint(List<Point> pointList){
		long mX = Long.MAX_VALUE;
		long mY = Long.MAX_VALUE;
		for(Point p : pointList){
			if(p.x < mX) mX = p.x;
			if(p.y < mY) mY = p.y;
		}
		return new Point(mX, mY);
	}
	public String[] solution(int[][] line) {
		List<Point> points = new ArrayList<>();
		// 교점 찾기
		for(int i = 0; i < line.length; i++){
			for(int j = i + 1; j < line.length; j++){
				Point p =
					intersection(line[i][0], line[i][1], line[i][2],
						line[j][0], line[j][1], line[j][2]);
				if(p != null)
					points.add(p);
			}
		}
		// 교점 중 최대 최소 x,y 구하기
		Point max = maxPoint(points);
		Point min = minPoint(points);

		int width = (int)(max.x - min.x + 1); // x축
		int height = (int)(max.y - min.y + 1); // y축

		// 배열 생성
		char[][] arr = new char[height][width];
		for(char[] c : arr){
			Arrays.fill(c, '.');
		}

		// 배열에 별 표시하기
		for(Point p : points){
			arr[(int)(max.y - p.y)][(int)(p.x - min.x)] = '*';
		}

		String[] answer = new String[arr.length];
		for(int i = 0; i < answer.length; i++){
			answer[i] = new String(arr[i]);
		}
		return answer;
	}
}


