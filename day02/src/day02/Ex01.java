package day02;

import java.util.Scanner; //�� ����� ������ ���ڴ�, Ư�� ��ɵ��� ������ �� �� �ʿ��ϴ�

public class Ex01 {
	public static void main(String[] args) {
		final String KOREA = "���ѹα�";
		System.out.println(KOREA);
		//KOREA = "�ɳ���";
		//System.out.println(KOREA);
		
		Scanner input = new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		String name = input.next(); //���ڿ�
		int age;
		
		System.out.println("���� �Է� : ");
		age = input.nextInt();
		
		System.out.println(name+"���� ���̴� "+age);
}
}