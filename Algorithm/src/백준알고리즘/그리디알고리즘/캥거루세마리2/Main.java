package ���ؾ˰���.�׸���˰���.Ļ�ŷ缼����2;

import java.util.Scanner;

/*
 �������� �׽�Ʈ ���̽��� �̷���� ������, 
 �� Ļ�ŷ��� �ʱ� ��ġ A, B, C�� �־�����. (0 < A < B < C < 100) 
 �� �׽�Ʈ�� ���� Ļ�ŷ簡 �ִ� �� �� ������ �� �ִ��� ����Ѵ�.

ABC ������ ���̰� 0�� �� �� ���� ��ġ�� �ٲ�, �� ��ǥ�� ���ϴ��� ����ABC�� ������ ���ϸ� �ȵ�
�׸����.............��Ÿ�ӿ��� ���±���..... �ִ��� ª�� �ܼ��ϰ� �ؾ߰ڴ�..
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
