package day12;

import java.util.Scanner;

/*
���̵� �����ϴ� ����� ����� �ּ���
set, get �޼ҵ� ����
�׸��� ���̸� ������ �����ϴ� �޼ҵ嵵 ����� �ּ���
�Է�: ���� �Է� : 20
���: ���̴� : 19�� �̱���
*/
public class MainClassT01 {
	public static void main(String[] args) {
		TestClassT01 t = new TestClassT01();
		Scanner input = new Scanner(System.in);
		System.out.println("���� �Է� :");
		int age = input.nextInt();
		t.setAge(age);
		System.out.println("���̴� :"+t.getAge()+"�� �̱���");
		
	}
	
}
