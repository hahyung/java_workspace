package day03;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		//���Ḧ ���������� �Է¹޴´�. �������� ���� ���ڶ�� �ٽ� �Է����ּ��� ���� ���
		//���� �ݾ��� �Է� �Ѵ�. ���� �ݾ��� ���� ���ݺ��� ���ٸ� �ݾ��� �����մϴ� ���
		//������ �����  �������
		//���� �ܾ� ���
		Scanner input = new Scanner(System.in);
		int num, money, total;
		int  price = 0;
		String menu = null;
		
		System.out.println("��-----*���� ���Ǳ�*----��");
		System.out.println("|1.    ���̴�   1000��|");
		System.out.println("|2.    ĵĿ��    800��|");
		System.out.println("|3.     �ݶ�   1500��|");
		System.out.println("|4.     ����    500��|");
		System.out.println("��-------------------��");
		
		System.out.print("�޴��� �����ϼ���: ");
		num = input.nextInt();
		System.out.print("������ �ݾױ��� �Է��ϼ��� : ");
		money = input.nextInt();
		
		if (num == 1) {
			price = 1000;
			menu = "���̴�";
		}else if (num == 2) {
			price = 800;
			menu = "ĵĿ��";
		}else if (num == 3) {
			price = 1500;
			menu = "�ݶ�";
		}else if (num == 4) {
			price = 500;
			menu = "����";
		}else {
			System.out.println("�ٽ� �Է����ּ���");
		}
		System.out.println("==========================");
		total = money - price;
		if(total<0) {
			System.out.println("�ݾ��� �����մϴ�");
		}else {
			System.out.println("�ֹ��Ͻ� ����� "+menu+" "+price+"���Դϴ�.");
			System.out.println("���� �ܾ��� "+total+"���Դϴ�.");
		}
		
		
	}
}
