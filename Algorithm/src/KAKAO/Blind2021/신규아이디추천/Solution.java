package KAKAO.Blind2021.�űԾ��̵���õ;

class Solution {
    public static String solution(String new_id) {
        String answer = "";        
        //1�ܰ�
        new_id = new_id.toLowerCase(); 
        System.out.println("1�ܰ�"+new_id);
        //2�ܰ�
        String string2="";
        for(int i=0; i<new_id.length(); i++) {
    		if((new_id.charAt(i)>='a' && new_id.charAt(i)<='z') ||
    				((new_id.charAt(i)>='0') && (new_id.charAt(i)<='9'))||
    				new_id.charAt(i)=='-' || new_id.charAt(i)=='_' ||
    				new_id.charAt(i)=='.'){
    		string2 += new_id.charAt(i);
    		}
    	
        }
        answer = string2;
        System.out.println("2�ܰ�"+string2);
    	//3�ܰ�
        String string3="";
        for(int i=0; i<string2.length()-1; i++) {
        	if(string2.charAt(i)=='.' && string2.charAt(i+1)!='.'||string2.charAt(i)!='.') {
        		string3 += string2.charAt(i);
        	}	
        	
        }
        string3+=string2.charAt(string2.length()-1);
        
        answer = string3;
        System.out.println("3�ܰ�"+string3);

    	//4�ܰ�
        String string4 = "";
    	for(int i=0; i<string3.length();i++) {
    	      char c=string3.charAt(i);
    	      System.out.println(c);
    	      if(c=='.' && i==string3.length()-1) {  
    	    	  continue;
    	      }
    	      else if(c=='.' && i==0) {
    	    	  continue;
    	      }
    	      else {
    	    	  string4+=c;
    	      }
			/*
			 * if(string3.charAt(i)!='.') string4 += string3.charAt(i);
			 * if(string3.charAt(i)=='.' && i!=0) string4 += string3.charAt(i);
			 * if(string3.charAt(i)=='.' && i!=string3.length()-1) string4 +=
			 * string3.charAt(i);
			 */
    		
    	}
    	answer = string4;
        System.out.println("4�ܰ�"+answer);
        
        //5�ܰ�
        if(answer.length() == 0) {
        	answer += 'a';
        }
        System.out.println("5�ܰ�"+answer);
        //6�ܰ�
        String string6="";
        if(answer.length()>=16) {
        	for(int i=0; i<15;i++) {
        		string6 += answer.charAt(i);
        	}
   
        	if(string6.charAt(string6.length()-1)=='.')
        		answer = string6.substring(0, string6.length()-1);
        	else  answer = string6;
        }
       
        System.out.println("6�ܰ�"+answer);
        //7�ܰ�
     
        while(answer.length()<3) {
        	answer += answer.charAt(answer.length()-1);
        }
        
        System.out.println("7�ܰ�"+answer);
          
       
        return answer;
    }
    public static void main (String args[]) {
    	System.out.println("����= "+solution("abcdefghijklmn.p"));
    	
    }
}
