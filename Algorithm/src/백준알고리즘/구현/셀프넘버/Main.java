package Algorithm.src.백준알고리즘.구현.셀프넘버;

public class Main {
	public static void main(String[] args) {
		boolean[] chk = new boolean[10001];
		chk[0] = true;
		for(int num = 1; num < 10000; num++){
			if(d(num) < 10000)
				chk[d(num)] = true;
			if(chk[num] == false)
				System.out.println(num);
		}
	}
	public static int d(int num){
		int sum = 0;
		sum += num;
		while(num != 0){
			sum += num % 10;
			num = num / 10;
		}
		return sum;
	}
}
