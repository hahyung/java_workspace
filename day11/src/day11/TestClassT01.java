package day11;

import java.util.Scanner;

public class TestClassT01 {
	public String name;
	public int age;
	public void input() {
		System.out.println("�Է¹޴� ��� ����");
		Scanner input = new Scanner(System.in);
		System.out.println("�̸��Է�");
		name = input.next();
		System.out.println("�����Է�");
		age = input.nextInt();
		op(); //�Է� ���� �� ������ ȣ���� �� �ִ�
		
	}
	public void op() {
		System.out.println("�����ϴ� ��� ����");
		age = age-1;
		System.out.println("age : "+age);
	}
	public void ouput() {
		System.out.println("����ϴ� ��� ����");
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
	}
}
