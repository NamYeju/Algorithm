package 백준알고리즘.그리디알고리즘.캥거루세마리2;

import java.util.Scanner;

/*
 여러개의 테스트 케이스로 이루어져 있으며, 
 세 캥거루의 초기 위치 A, B, C가 주어진다. (0 < A < B < C < 100) 
 각 테스트에 대해 캥거루가 최대 몇 번 움직일 수 있는지 출력한다.

ABC 각각의 사이가 0이 될 때 까지 위치가 바뀜, 단 좌표는 변하더라도 글자ABC의 순서는 변하면 안됨
그리디는.............런타임오류 나는구나..... 최대한 짧고 단순하게 해야겠당..
 */
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int A, B, C, temp;
		int answer=0;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		/*
			if(B-A > C-B) {
				C = A+1;
				temp = B;
				B = C;
				C = temp;			
				answer++;
			}
			else if(B-A <= C-B) {
				A = B+1;
				temp = B;
				B = A;
				A = temp;
				answer++;
			}
		 */
		if(B-A > C-B) {
			answer = B-(A+1);
		}
		if(B-A <= C-B) {
			answer = C-(B+1);
		}
		System.out.println(answer);

	}

}
