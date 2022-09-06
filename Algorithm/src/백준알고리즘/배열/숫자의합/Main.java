package Algorithm.src.백준알고리즘.배열.숫자의합;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =  sc.nextInt();
        sc.nextLine();
        String num = sc.nextLine();
        int sum = 0;

        for(int i=0; i<N; i++){
            //sum += Character.getNumericValue(num.charAt(i));
            sum += num.charAt(i)-'0';
        }

        System.out.println(sum);
    }
}
