package Algorithm.src.백준알고리즘.이진탐색.수찾기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] A;
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		A = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		int M = sc.nextInt();
		for(int i = 0; i < M; i++){
			int result = binarySearch(sc.nextInt());
			System.out.println(result);
		}
	}
	public static int binarySearch(int target){
		int start = 0;
		int end = A.length - 1;
		while(start <= end){
			int mid = (start + end) / 2;
			if(target == A[mid]) {
				return 1;
			}
			else if(target < A[mid]){
				end = mid - 1;
				continue;
			}
			else if(target > A[mid]){
				start = mid + 1;
				continue;
			}
		}
		return 0;
	}
}
