package day16;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		AA���� ���� = new AA����();
		BB���� ���� = new BB����();
		System.out.println("���� ó��� �Խ��ϴ�");
		System.out.println("1.���� 2.����");
		int choice = 0, num;
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		if(num==1) {
			System.out.println("���� ���� �ϼ̽��ϴ�");
		}else {
			System.out.println("���� ���� �ϼ̽��ϴ�");
		}
		System.out.println("1.���� 2.���");
		choice = input.nextInt();
		if(choice==1 && num ==1) ����.attack();
		else if(choice==2 && num ==1) ����.defense();
		else if(choice==1 && num ==2) ����.attack();
		else if(choice==2 && num ==2) ����.defense();
	}
}
