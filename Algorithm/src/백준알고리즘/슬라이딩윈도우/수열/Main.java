package Algorithm.src.백준알고리즘.슬라이딩윈도우.수열;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int solution(int n, int k, int[]nums){
        int sum = 0;
        int answer;

        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        answer = sum;

        for (int i=k; i<n; i++){
            sum += nums[i] - nums[i-k];
            answer = Math.max(answer, sum);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int arr[] = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N, K, arr));

    }
}
