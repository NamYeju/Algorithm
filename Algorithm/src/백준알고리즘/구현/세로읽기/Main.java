package Algorithm.src.백준알고리즘.구현.세로읽기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ArrayList<String>[] arr = new ArrayList[5];
		for(int i=0; i<5; i++){
			arr[i] = new ArrayList<>();
			String s = sc.nextLine();
			for(int j=0; j<s.length(); j++){
				arr[i].add(Character.toString(s.charAt(j)));
			}
		}

		String answer = "";

		for(int i=0; i<15; i++){
			for(int j=0; j<5; j++){
				if(arr[j].size() >= i+1)
					answer += arr[j].get(i);
			}
		}
		System.out.println(answer);
	}
}
