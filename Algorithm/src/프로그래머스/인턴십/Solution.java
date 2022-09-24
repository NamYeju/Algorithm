class Solution {

    public static int solution(int[][] atmos) {
        int answer = 0;
        boolean isEnable = false;
        int day = -1;
        String state1 = "";
        String state2 = "";


        for(int i=0; i< atmos.length; i++){

            if(atmos[i][0]>=81 && atmos[i][1]<=150)
                state1 = "나쁨";
            else if(atmos[i][1]>=151)
                state1 = "매우나쁨";
            if(atmos[i][0]>=36 && atmos[i][1]<=75)
                state2 = "나쁨";
            else if(atmos[i][1]>=76)
                state2 = "매우나쁨";

            if(atmos[i][0]<81 && atmos[i][1]<36) {
                if(day == 0 && isEnable == true)
                    day++;
                else if(day == 1 && isEnable == true) {
                    day = -1;
                    isEnable = false;
                }
                continue;
            }
            if((atmos[i][0]<81 && state2.equals("매우나쁨"))||(atmos[i][1]<36 && state1.equals("매우나쁨"))||(atmos[i][1]<36 && state1.equals("나쁨"))||(atmos[i][0]<81 && state2.equals("나쁨"))||(state1.equals("나쁨")&&state2.equals("나쁨")) || (state1.equals("나쁨")&&state2.equals("매우나쁨")) ||(state1.equals("매우나쁨")&&state2.equals("나쁨")) ){
                if(isEnable==false){
                    isEnable = true;
                    day = 0;
                    answer++;
                }
                else if(isEnable==true){
                    if(day == 0)
                        day++;
                    else if(day == 1) {
                        day = -1;
                        isEnable = false;
                    }
                }
            }
            if((state1.equals("매우나쁨")&&state2.equals("매우나쁨"))) {
                if(isEnable==false) {
                    answer++;
                }
                else {
                    isEnable = false;
                    day = -1;
                }
            }

        }

        return answer;
    }
}
