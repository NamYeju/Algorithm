package 프로그래머스.DFSandBFS.단어변환;
/*
 bfs(hit)->hot-> dot -> dog -> log -> lot -> bfs(lot)끝 cnt:4 // lot false
 bfs(log) -> bfs(cog) cnt: 4 // cog false
 bfs(dog) -> log -> cog // dog false
 dot  // dot false
 hot // hot false
 * */
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
	static int answer1 = 0;
    public static int solution(String begin, String target, String[] words) {
       
        boolean visit[] = new boolean[words.length];
        ArrayList<String> wordarr = new ArrayList<>(Arrays.asList(words));
        if(wordarr.contains(target)) {
        	
        			dfs(begin, target,words,visit,0);
        	
        		
        }
        else return 0;
        
        return answer1;
    }
    public static void dfs(String begin,String target, String[] arr, boolean[] visit,int answer) {
    	int num = 0; //단어중 한글자 제외 모두 같으면 교체 가능
    	if(begin.equals(target)) {
    		answer1=answer;
    		return ;
    	}
    	
    	
    	for(int j=0; j<arr.length; j++) {
    		num=0;
    		if(visit[j]==false) {
	    	for(int i=0; i<begin.length(); i++) {
	    		if(begin.charAt(i) == arr[j].charAt(i)) {
	    			num++;
	    		}
	    	}
			if(num == begin.length()-1 ) {
				//System.out.println(arr[j]);
			    
				visit[j] = true;
				dfs(arr[j],target ,arr, visit, answer+1);	
				visit[j] = false;
			
			}
			if(num == begin.length()-1 && visit[j]== true) {
				return ;
			}
    		}
    	}
    }

    public static void main (String args[]) {
    	String[] words= {"hot", "dot", "dog", "lot", "log", "cog"};
    	String begin = "hit";
    	String target = "cog";
    	System.out.println(solution(begin, target, words));
    }
}
