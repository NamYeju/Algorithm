package Algorithm.src.백준알고리즘.투포인터;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int start = 1, last = 1;
		int sum = 1;
		int cnt = 1;

		while(last != N){
			if(sum < N){
				last++;
				sum += last;
			}
			else if(sum > N){
				sum -= start;
				start++;
			}
			else if(sum == N){
				cnt++;
				last++;
				sum += last;
			}
		}
		System.out.println(cnt);
	}

}
