package Algorithm.src.프로그래머스.정렬.HIndex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
	public static void main(String args[]){
		int array[] = {3, 0, 6, 1, 5};
		System.out.println(solution(array));
	}
	public static int solution(int[] citations){
		int hIndex  = 0;

		ArrayList<Integer> arrayList = new ArrayList<>();
		Integer[] citations2 = Arrays.stream(citations).boxed().toArray(Integer[]::new);
		Arrays.sort(citations2, Collections.reverseOrder());

		int n = citations.length;
		for(int i = 0; i < n; i++){
			if(citations2[i] >= i) {
				arrayList.add(i+1);
			}
		}
		hIndex = arrayList.get(arrayList.size()-1);

		return hIndex;
	}
}
