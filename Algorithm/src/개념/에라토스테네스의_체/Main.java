package Algorithm.src.개념.에라토스테네스의_체;

import java.util.ArrayList;

/** 소수(Prime Number) 판별 알고리즘
 * 주어진 값을 일일히 반목문으로 돌며 나눗셈연산을 통해 소수를 판별하면 비효율적이다.
 * 에라토스테네스의 체 알고리즘 동작 순서
 * (1) 2를 제외한 2의 배수 지우기
 * (2) 3을 제외한 3의 배수 지우기
 * (4) 4는 이미 2의 배수에서 지워졌으므로 건너뛰기
 * (5) 5를 제외한 5의 배수 지우기
 * ... (반복)...
 * */
public class Main {
    public static void main(String[] args) {
        int n = 25; // 임의의 숫자 n
        ArrayList<Integer> arrayList = new ArrayList<>(); // n까지의 숫자를 담을 리스트
        ArrayList<Integer> isPrimeNumber = new ArrayList<>(); // 소수만 담을 리스트

        for (int i = 0; i <= n; i++) {
            arrayList.add(i);
        }
        for (int i = 2; i <= n; i++) {
            if (arrayList.get(i) == 0)                // 동작 순서 (4)에 해당
                continue;
            isPrimeNumber.add(i);                    // 2는 리스트에 담기
            for (int j = i * 2; j <= n; j += i) {   // 2를 제외한 2의 배수 (4부터 6, 8 , ... n 까지)
                arrayList.set(j, 0);               // 지우기 = 0으로 값 변경
            }
        }
    }
}
