package Algorithm.src.이코테.그리디.예제2;

import java.util.Scanner;

public class Main {
    static int result = 0;

    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for(int i = 0; i < s.length(); ++i) {
            int num = Character.getNumericValue(s.charAt(i));
            if (num != 0 && result != 0) {
                result *= num;
            } else {
                result += num;
            }
        }

        System.out.println(result);
    }
}
