package Algorithm.src.프로그래머스.위클리챌린지.사주차_직업군추천하기;
/*
* table : 직업군 언어 점수 배열
* laguanges : 직업군 언어  배열
* preference : 언어 선호도
* 언어 선호도 * 직업군 언어 점수 max 직업군 return
* (여러개일 경우 사전 순)
* 0 5 4 3 2 1
* 0 1 2 3 4 5
* */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
class Solution {
    public static void main(String[] args){
        String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#",
                "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
                "HARDWARE C C++ PYTHON JAVA JAVASCRIPT",
                "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
                "GAME C++ C# JAVASCRIPT C JAVA"};
        String[] languages = {"PYTHON", "C++", "SQL"};
        int[] preference = {7,5,5};
        System.out.println(solution(table, languages, preference));
    }
        public static String solution(String[] table, String[] languages, int[] preference) {
            HashMap<String,Integer>map1=new HashMap<>();
            for(int i=0; i<languages.length; i++){
                map1.put(languages[i],preference[i]);
            }
            HashMap<String,Integer>map=new HashMap<>();
            for(int i=0; i<table.length; i++){
                String s[]=table[i].split(" ");
                int result=0;
                int cnt=5;
                for(int j=1; j<s.length; j++){
                    String temp=s[j];
                    if(map1.containsKey(temp)){
                        result+=(map1.get(temp)*cnt);
                    }
                    cnt--;
                }
                map.put(s[0],result);
            }
            ArrayList<String>s1=new ArrayList<>(map.keySet());

            Collections.sort(s1, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if(map.get(o1)==map.get(o2)){
                        return o1.compareTo(o2);
                    }
                    else{
                        return map.get(o2)-map.get(o1);
                    }
                }
            });
            String answer="";
            answer=s1.get(0);
            return answer;
        }
    }