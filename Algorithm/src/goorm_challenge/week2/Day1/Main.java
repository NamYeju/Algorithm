package Algorithm.src.goorm_challenge.week2.Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** 완전탐색 */
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String input = br.readLine();

    List<String[]> store = new ArrayList<>();
    Set<String> wordSet = new HashSet<>();

    for(int i = 1; i < N; i++){
      for(int j = i + 1; j < N; j++){
        // 연속하는 3개의 부분문자열 나누기
        String first = input.substring(0, i);
        String second = input.substring(i, j);
        String third = input.substring(j, N);
        store.add(new String[]{first, second, third});
        // 중복하지 않은 부분문자열
        wordSet.add(first);
        wordSet.add(second);
        wordSet.add(third);
      }
    }
    // P 각 원소의 점수 구하기
    List<String> wordSetToList = new ArrayList<>(wordSet);
    Collections.sort(wordSetToList);
    HashMap<String, Integer> score = new HashMap<>();
    int s = 1;
    for(String word : wordSetToList){
      score.put(word, s++);
    }
    // 부분문자열의 점수 구하기 & 최대 점수 구하기
    int answer = 0;
    for(String[] str : store){
      int sum = 0;
      for(int i = 0; i < 3; i++){
        sum += score.get(str[i]);
      }
      answer = Math.max(sum, answer);
    }
    System.out.println(answer);
  }
}
