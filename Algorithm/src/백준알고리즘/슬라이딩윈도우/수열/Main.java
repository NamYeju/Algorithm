package Algorithm.src.백준알고리즘.슬라이딩윈도우.수열;

import java.io.*;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st2 = new StringTokenizer(br2.readLine());
        int arr[] = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        //System.out.println(solution(N, K, arr));
        int sum = 0;
        int answer;

        for(int i=0; i<K; i++){
            sum += arr[i];
        }
        answer = sum;

        for (int i=K; i<N; i++){
            sum += arr[i] - arr[i-K];
            answer = Math.max(answer, sum);
        }

        System.out.println(answer);

    }
}
