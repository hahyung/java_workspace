package day04;

import java.util.Scanner;

public class T2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num=0;
		String home=null , company = null;
		while(true) {
			System.out.println("1.�츮�� ���");
			System.out.println("2.ȸ�� ���");
			System.out.println("3.��� ����");
			num = input.nextInt();
		
			switch(num) {
			case 1: 
				System.out.print("�츮 �� : ");
				home = input.next();break;
			case 2:
				System.out.print("ȸ�� : ");
				company = input.next();break;
			case 3:
				if(home != null && company != null) {
				System.out.println("�츮�� : "+home);
				System.out.println("ȸ�� : " + company);
				}else {
					System.out.println("��� ���� �ϼ���");
				}break;
			}
		}
	}
}
