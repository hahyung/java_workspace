package day05;

import java.util.Scanner;

public class T4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//�α���
		int num;
		String id=null, pw=null, sid=null, spw=null;
		boolean flag = true;
		
		
		while(flag) {
			System.out.println("1.�α���");
			System.out.println("2.ȸ������");
			System.out.println("3.������");
			System.out.println(">>> ");
			num = input.nextInt();
			/*
			if(num==3) {
				System.out.println("���α׷��� �����մϴ�.");break;
			}
			switch(num) {
			case 1: 
				System.out.print("���̵� �Է� : ");
				id = input.next();
				System.out.print("��й�ȣ �Է� : ");
				pw = input.next();
				if(id.equals(sid) && pw.equals(spw)) {
					System.out.println("�������� !!!!");
				}else {
				System.out.println("�������� !!!");
				}break;
			case 2:
				System.out.print("������ ���̵� �Է� : ");
				sid = input.next();
				System.out.print("������ ��й�ȣ �Է� : ");
				spw = input.next();
				System.out.println("���� �Ϸ�!!!");
			}
			*/
			if(num==3) {
				System.out.println("���α׷��� �����մϴ�.");break;
			}else if(num == 2) {
				System.out.print("������ ���̵� �Է� : ");
				sid = input.next();
				System.out.print("������ ��й�ȣ �Է� : ");
				spw = input.next();
				System.out.println("���� �Ϸ�!!!");
			}else if(num==1) {
					System.out.print("���̵� �Է� : ");
					id = input.next();
					System.out.print("��й�ȣ �Է� : ");
					pw = input.next();
					if(id.equals(sid) && pw.equals(spw)) {
						System.out.println("�������� !!!!");
					}else {
					System.out.println("�������� !!!");
					}
			}
		}
	}
}
		
		

