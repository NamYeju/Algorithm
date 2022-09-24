package Algorithm.src.학교특강.Day2.제곱수정렬;

/**
 * 오름차순 정렬되어 있는 길이가 n인 수열이 주어집니다.
 * 수열의 원소를 제곱하여 오름차순 정 열한 배열을 반환하는 프로그램을 작성하세요.
 * 주의 : sort 함수를 사용하면 안됩니다.
 * */
public class Solution {
    public static int[] solution(int[] arr){
        int[] answer = new int[arr.length];

        int left = 0;
        int right = arr.length - 1;
        for(int i = arr.length-1; i >= 0; i--){
            if(Math.abs(arr[left]) < Math.abs(arr[right])){
                answer[i] = arr[right] * arr[right];
                right --;
            }
            else {
                answer[i] = arr[left] * arr[left];
                left --;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{-4, -1, 0, 3, 10};
        solution(arr);

        for(int x : arr){
            System.out.println(x);
        }
    }
}
