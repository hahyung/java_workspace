package day12;

import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) {
		TestClass04 t = new TestClass04();
		int k,e,m;
		//��,��,��,��,���
		//�� ��, ����, �����ϴ� ��� �����
		Scanner input = new Scanner(System.in);
		System.out.println("���� ����");
		k = input.nextInt();
		System.out.println("���� ����");
		e = input.nextInt();
		System.out.println("���� ����");
		m = input.nextInt();
		t.setNum(k, e, m);
		t.op();
		System.out.println("�� "+t.getKor()+" �� "+t.getMath()+" �� "+t.getEng());
		System.out.println("���� �� : "+t.getSum());
		System.out.println("���� ��� : "+t.getAvg());
	}
}
