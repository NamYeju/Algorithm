package Algorithm.src.프로그래머스.DFSandBFS.타켓넘버;

class Solution2 {
	static int answer = 0;

	public static void main(String[] args) {
		int[] numbers = new int[] {1, 1, 1, 1, 1};
		int target = 3;
		System.out.println(solution(numbers, target));
	}

	public static int solution(int[] numbers, int target){
		dfs(numbers, target, 0, 0);
		return answer;
	}
	public static void dfs(int numbers[], int target, int sum, int depth){
		if(depth == numbers.length){
			if(sum == target)
				answer++;
			return;
		}
		dfs(numbers, target, sum + numbers[depth], depth+1);
		dfs(numbers, target, sum - numbers[depth],  depth+1);
	}

}

