package ���ؾ˰���.���ڿ�.���ϱ����Ŭ;
/*
 * 10���� ������ 0�� �ٿ� ���ڸ���
 * ���ڸ����� ���Ѱ� �����ڸ���
 * �������� �����ڸ����� ���ο� ���� ��°�ڸ���
 * */
public class Main {
	public static void main(String args[]) {
		System.out.println(cycle(26));
		//cycle(6);
	}
	public static int cycle(int num) {
		int initial = num;
		int cycle_num=0;
		int first, last;
		String strNum="";
		String newNum="";
		do {
		if(num>=0 && num<10) 
			strNum += "0" + Integer.toString(num);
		else 
			strNum = Integer.toString(num);
		System.out.println("str: "+strNum);
		first = strNum.charAt(1)-48; 
		last = Character.getNumericValue(strNum.charAt(0))+Character.getNumericValue(strNum.charAt(1)); 
		System.out.println("first:"+first+" last:"+last);
		if(last>=10)
			last = last%10;
		newNum += Integer.toString(first)+Integer.toString(last);
		num = Integer.parseInt(newNum);
		cycle_num ++;
		}while(initial != num);
		return cycle_num;
	}

	
}
