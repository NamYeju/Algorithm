package ���α׷��ӽ�.DFSandBFS.Ÿ�ϳѹ�;

class Solution {
    public static int answer = 0;
    public static int solution(int[] numbers, int target) {
        dfs(numbers,0,target);
        return answer;

    }
    public static void dfs(int []numbers,int index,int target){
        int sum=0;
        if(index==numbers.length){ //index�� 4�϶� dfs���ȣ��� index=5�� ��, �� 5�϶��� ������ ���
            for(int i=0; i<numbers.length; i++){
                sum+=numbers[i];
                System.out.println("sum="+sum);
            }
            if(target==sum){
                answer++;
            }

        }
        else{
            numbers[index]*=1; //��Ʈ��ŷ visit == true
            System.out.println("a"+numbers[index]);
            dfs(numbers,index+1,target); //���
            System.out.println("a-dfs ��� �Ϸ� ��");
            
            
            numbers[index]*=-1; //��Ʈ��ŷvisit == false
            System.out.println("b index="+index+"numbers[index]="+numbers[index]);
            dfs(numbers,index+1,target);
            System.out.println("b-dfs ��� �Ϸ� ��");
        }
    }
    public static void main(String args[]) {
    	int arr[]= {1,1,1,1,1};
    	System.out.println(solution(arr,3));
    }
}
