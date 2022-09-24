package Algorithm.src.학교특강.Day2.키보드;

public class Solution {
    public static int solution(String str, int n){
        int answer = 0;
        int[] used = new int[27];
        for(int x : str.toCharArray()){
            if(x>97 && x<=122)
                used[x-97] = 1;
            else if(x>=65 && x<=90){
                used[26] = 1;
                used[x-65] = 1; //대문자를 소문자로 바꾸고 대신 Shift키는 따로 체크
            }
        }

        int cnt = 0;
        for(int i=0; i<27; i++){
            if(used[i] == 1)
                cnt++;
            if(cnt<=n) return str.length();
            else return -1;
        }

        return answer;
    }
    public static void main(String[] args) {
        String s = "time to time";
        int n = 5;
        System.out.println(solution(s, n));
    }
}
