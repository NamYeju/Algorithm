package ���ؾ˰���.���ڿ�.���ϱ����Ŭ;
/*
 * 10���� ������ 0�� �ٿ� ���ڸ���
 * ���ڸ����� ���Ѱ� �����ڸ���
 * �������� �����ڸ����� ���ο� ���� ��°�ڸ���
 * */
public class Main {
	public static void main(String args[]) {
		System.out.println(cycle(0));
		//cycle(6);
	}
	public static int cycle(int num) {
		int initial = num;
		int cycle_num=0;
		int first, last;
		StringBuffer strNum = new StringBuffer();
		StringBuffer newNum = new StringBuffer();
		//String strNum="";
		//String newNum="";
		do {
			if(num>=0 && num<10) {
				strNum.append(0);
				strNum.append(Integer.toString(num));}
			else 
				strNum.append(Integer.toString(num));
			System.out.println("str: "+strNum);
			first = strNum.charAt(1)-48; 
			last = Character.getNumericValue(strNum.charAt(0))+Character.getNumericValue(strNum.charAt(1)); 
			if(last>=10)
				last = last%10;
			System.out.println("first:"+first+" last:"+last);
			newNum.append(Integer.toString(first));
			newNum.append(Integer.toString(last));
			//newNum += Integer.toString(first)+Integer.toString(last);
			num = Integer.parseInt(newNum.toString());
			cycle_num ++;
			strNum.delete(0, strNum.length());
			newNum.delete(0, newNum.length());
			System.out.println("after delete "+strNum);
		}while(initial != num);
		return cycle_num;
	}

	
}
