package 프로그래머스.연습문제.정수제곱근판별;

class Solution {
	public long solution(long n) {
		long answer = 0;
		for(long i = 0; i <= n; i++){
			if(i*i == n){
				answer = (i + 1)*(i+1);
				break;
				}
			else
				answer = -1;
			}
		return answer;
		}
	}
