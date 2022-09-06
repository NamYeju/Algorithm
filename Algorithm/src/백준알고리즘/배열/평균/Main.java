package Algorithm.src.백준알고리즘.배열.평균;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] score = new int[N];

        for(int i=0; i< N; i++){
            score[i] = sc.nextInt();
        }

        int max = 0;
        int sum = 0;

        for(int i=0; i< N; i++){
            max = Math.max(max, score[i]);
            sum += score[i];
        }

        System.out.println(sum * 100.0 / max / N);
    }
}
