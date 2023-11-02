package Algorithm.src.프로그래머스.구현.키패드누르기;

import java.lang.Math;

public class Solution {
  static int[][] keypad = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {-1, 0, -1}};
  public String solution(int[] numbers, String hand) {
    StringBuilder answer = new StringBuilder();
    Location left_location = new Location(3, 0);
    Location right_location = new Location(3, 2);

    for(int number : numbers){
      if(number == 1 || number == 4 || number == 7){
        answer.append("L");
        changeLocation(number, left_location);
      }
      else if(number == 3 || number == 6 || number == 9){
        answer.append("R");
        changeLocation(number, right_location);
      }
      else if(number == 2 || number == 5 || number == 8 || number == 0){
        int left = calculate(number, left_location);
        int right = calculate(number, right_location);
        if(left - right > 0){
          answer.append("R");
          changeLocation(number, right_location);
        }
        else if(left - right < 0){
          answer.append("L");
          changeLocation(number, left_location);
        }
        else{
          if(hand.equals("right")){
            answer.append("R");
            changeLocation(number, right_location);
          }
          else{
            System.out.println("@l"+hand);
            answer.append("L");
            changeLocation(number, left_location);
          }

        }
      }
    }
    return answer.toString();
  }
  public void changeLocation(int number, Location location){
    for(int i = 0; i < 4; i++){
      for(int j = 0; j < 3; j++){
        if(keypad[i][j] == number){
          location.setLocation(i, j);
          break;
        }
      }
    }
  }
  public int calculate(int target, Location location){
    int value = 0;
    for(int i = 0; i < 4; i++){
      for(int j = 0; j < 3; j++){
        if(keypad[i][j] == target){
          value = Math.abs(location.x - i) + Math.abs(location.y - j);
        }
      }
    }
    return value;
  }
}
class Location {
  int x;
  int y;
  public Location(int x, int y){
    this.x = x;
    this.y = y;
  }
  public void setLocation(int x, int y){
    this.x = x;
    this.y = y;
  }
}
