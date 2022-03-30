package Algorithm.src.백준알고리즘.그리디알고리즘.설탕배달;

import java.util.Scanner;

/**
 * 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
 * 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지
 * 첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)
 * 상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 배달해야하는 무게
        int cnt = 0;

        //3과 5 둘다 안나눠 떨어지는
        if(N%5 != 0 && N%3!=0) {
            System.out.println(-1);
        }
        // 5로 나눠 떨어질 때 => 무조건 다 5로 나눠야 최솟값
        if(N % 5 == 0) {
            System.out.println(N / 5);
        }

        // 5로 나눠 떨어지지는 않지만 나머지가 3일때 => 5로 나누고 그 다음 3으로 나누기
        if(N % 5 != 0){
            if(N%5 == 3) {
                cnt += N / 5 + 1;
                System.out.println(cnt);
            }
            else{ // 나머지가 3이 아닌 다른 수인 경우
                System.out.println(-1);
            }
        }

        // 5로 나눠 떨어지지 않지만 N이 3의 배수일때
        if(N % 5 != 0 && N%3 == 0){
            System.out.println(N/3);
        }

        //3으로 나눴을 때 나머지가 2이면
        if(N%3 ==2)
            System.out.println(N/3);
    }
}
