package day03;

import java.util.Scanner;

public class Q2 {
	//Ű�� ���̸� �Է¹޴´� 
	//Ű�� 125�̻� ���� 65�� �����Ͻ� ����ī ž�� ����
	//Ű�� 125�̸��϶� 125�̻� ž�� �����մϴ� ���
	//65�� �ʰ��϶� 65�� ���ϸ� ž�� �����մϴ� ���
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int height, age;
		
		System.out.println("Ű�� ���̸� �Է����ּ���");
		System.out.print("Ű : ");
		height = input.nextInt();
		System.out.print("���� : ");
		age = input.nextInt();
		
		if(height>=125 && age <= 65) {
			System.out.println("����ī ž�°���");
		}else if(height < 125) {
			System.out.println("125�̻� ž�°����մϴ�");
		}else if(age > 65) {
			System.out.println("65�� ���ϸ� ž�°����մϴ�");
		}else {
			System.out.println("�ٽ� �Է����ּ���");
		}
	}
}
