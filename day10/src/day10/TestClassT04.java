package day10;

import java.util.ArrayList;
import java.util.Scanner;
// T03�� ArrayList�� ��ȯ
public class TestClassT04 {
	public ArrayList inputFunc() {
		Scanner input = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		
		int value;
		System.out.println("���� �Է��ϼ���");
		arr.add(input.nextInt());
		System.out.println("���� �Է��ϼ���");
		arr.add(input.nextInt());
		
		return arr;
	}
	public int sumFunc(ArrayList arr) {

		//int sum = (int)arr.get(0) + (int)arr.get(1);
		//return sum;
		
		return (int)arr.get(0) + (int)arr.get(1);
	}
	public void outputFunc(ArrayList arr, int s) {

		System.out.println("�� ���� ��: "+arr.get(0)+"+"+arr.get(1)+"="+s);
		//System.out.println("�� ���� �� : "+sum);

	}
}
