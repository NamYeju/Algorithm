package 프로그래머스.DFSandBFS.타켓넘버;

class Solution {
    public static int answer = 0;
    public static int solution(int[] numbers, int target) {
        dfs(numbers,0,target);
        return answer;

    }
    public static void dfs(int []numbers,int index,int target){
        int sum=0;
        if(index==numbers.length){ //index가 4일때 dfs재귀호출시 index=5가 됨, 즉 5일때가 마지막 재귀
            for(int i=0; i<numbers.length; i++){
                sum+=numbers[i];
                System.out.println("sum="+sum);
            }
            if(target==sum){
                answer++;
            }

        }
        else{
            numbers[index]*=1; //백트래킹 visit == true
            System.out.println("a"+numbers[index]);
            dfs(numbers,index+1,target); //재귀
            System.out.println("a-dfs 재귀 완료 후");
            
            
            numbers[index]*=-1; //백트래킹visit == false
            System.out.println("b index="+index+"numbers[index]="+numbers[index]);
            dfs(numbers,index+1,target);
            System.out.println("b-dfs 재귀 완료 후");
        }
    }
    public static void main(String args[]) {
    	int arr[]= {1,1,1,1,1};
    	System.out.println(solution(arr,3));
    }
}
