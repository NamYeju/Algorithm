package Algorithm.src.프로그래머스.위클리챌린지.이주차_상호평가;

class Solution {
    public static void main(String[] args){
        int scores[][]={{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
        System.out.println(solution(scores));
    }
    public static String solution(int[][] scores) {
        String answer = "";
        for(int i=0; i<scores.length; i++){
            int cnt = scores.length;
            int myScore = scores[i][i];
            int totalScore = 0;
            boolean myScoreIsMax = false;
            boolean myScoreIsMin = false;
            boolean sameWithMyScore = false;
            for(int j=0; j<scores.length; j++){
                if(myScore > scores[j][i] && i!=j) {
                    myScoreIsMax = true;
                }
                else if(myScore < scores[j][i] && i!=j){
                    myScoreIsMin = true;
                }
                else if(myScore == scores[j][i] && j!=i){
                    sameWithMyScore = true;
                }
                totalScore += scores[j][i];
            }
            if(sameWithMyScore == false && ((myScoreIsMax == true && myScoreIsMin == false)||(myScoreIsMax == false && myScoreIsMin == true))) {
                totalScore -= myScore;
                cnt -= 1;
            }
            try {
                if (totalScore / cnt >= 90)
                    answer += "A";
                else if (totalScore / cnt < 90 && totalScore / cnt >= 80)
                    answer += "B";
                else if (totalScore / cnt < 80 && totalScore / cnt >= 70)
                    answer += "C";
                else if (totalScore / cnt < 70 && totalScore / cnt >= 50)
                    answer += "D";
                else
                    answer += "F";
            }
            catch (Exception e){
                System.out.println("0 error");
            }
        }

        return answer;
    }


}