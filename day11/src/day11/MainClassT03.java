package day11;

import java.util.Scanner;

/*
 updown ������ ����ÿ�
 ���ο��� �⺻ �������� ȭ���� �����, ����� �޼ҵ�� �����Ͻÿ�
 ��� : �������� �̴� ���, �ְ��� üũ, ������, �ְ� ��� Ȯ�� ���
 */
public class MainClassT03 {
	public static void main(String[] args) {
		TestClassT03 t03 = new TestClassT03();
		Scanner input = new Scanner(System.in);
		int num;
		boolean run = true;
		while(run) {
			System.out.println("===UP & Down Game ===");
			System.out.println("1. ���� ����");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� ����");
			num = input.nextInt();
		switch(num) {
		case 1:
			t03.answer(); break;
		case 2:
			int hs = t03.highScore();
			t03.hsCheck(hs);
			break;
		case 3:
			System.out.println("���� ����");
		default:
			run = false;
		}
		}
	}
}
