package Algorithm.src.학교특강.Day2.바이토닉수열;

/**
 * 바이토닉 수열이란 수열이 증가했다가 감소하는 수열을 의미합니다.
 * 길이가 n인 수열이 매개변수 nums에 주어지면 이 수열이 바이토닉 수열인지 판별하는 프로그 램을 작성하세요.
 * 만약 [1, 2, 3, 4, 2, 1]이면 바이토닉 수열입니다.
 * 하지만 [1, 2, 2, 3, 2, 1]과 같이 같은 값 이 연속으로 있으면 바아토닉 수열이라 하지 않습니다.
 * */
public class Solution {
    public static String solution(int[] arr){
        String answer="";

        for(int i=0; i< arr.length; i++){
            if(arr[i] == arr[i+1]){
                answer = "NO";
                return  answer;
            }


        }

        //while(arr[i]<arr[i+1])

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 3, 1};
        solution(arr);
    }
}
