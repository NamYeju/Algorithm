package Algorithm.src.이코테.그리디.예제1;

import java.util.Scanner;

public class Main {
    static int cnt = 0;

    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int target = N / K * K;
        cnt += N - target;

        for(N = target; N != 1; ++cnt) {
            N /= K;
        }

        System.out.println(cnt);
    }
}
