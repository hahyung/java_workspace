package day03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int num = 10;
		if(num%2==0) {//������ ���̸� ���� ���� ����
			System.out.println("¦��");
		}else {//if ������ �����̸� else ����
			System.out.println("Ȧ��");
		}
		System.out.println("���� ����� ����");
		
		//���� �Է� �޾� 5�� ������� �ƴ��� ����
		System.out.println("���� �Է� �޾� 5�� ������� �ƴ��� ����");
		Scanner input = new Scanner(System.in);
		int num1;
		
		System.out.print("���ڸ� �Է����ּ��� : ");
		num1 = input.nextInt();
		
		if(num1%5==0) {
			System.out.println("5�� ����Դϴ�");
		}else {
			System.out.println("5�� ����� �ƴմϴ�");
		}
		
		//���� �Է� �޾� 0���� ũ�� 100���� ������ ����, �ƴϸ� ���������� ���
		System.out.println("���� �Է� �޾� 0���� ũ�� 100���� ������ ����, �ƴϸ� ���������� ���");
		int num2;
		
		System.out.print("�� �Է� : ");
		num2 = input.nextInt();
		
		if(num2<100 && num2>0 ) {
			System.out.println("����");
		}else {
			System.out.println("������");
		}
		
		//���� �Է� �޾� ¦���̸鼭 3�� ����̸� ���, �ƴϸ�
		System.out.println("���� �Է� �޾� ¦���̸鼭 3�� ����̸� ���, �ƴϸ�");
		int num3;
		
		System.out.print("�� �Է� : ");
		num3 = input.nextInt();
		
		if(num3%2==0 && num3%3==0) { //num3%6 == 0 ���ε� ����
			System.out.println("¦���鼭 3�� ���");
		}else {
			System.out.println("�ƴ�");
		}
		
		//���� �Է� �޾� ¦���̸鼭 3�� ����̸� ���
		//3�� ����� �ƴϸ�, ¦���� �ش��ϸ� ¦��, �Ǵ� Ȧ��
		//¦���� �ƴϸ�, 3�� ������� �ش��ϸ� 3�� ���, �ƴ�
		//�ش���� ������ �ش� ���� ����
		System.out.println("���� �Է� �޾� ¦���̸鼭 3�� ����̸� ���");
		System.out.println("3�� ����� �ƴϸ�, ¦���� �ش��ϸ� ¦��, �Ǵ� Ȧ��");
		System.out.println("¦���� �ƴϸ�, 3�� ������� �ش��ϸ� 3�� ���, �ƴ�");
		System.out.println("�ش���� ������ �ش� ���� ����");
		
		int num4;
		
		System.out.print("�� �Է� : ");
		num4 = input.nextInt();
		
		if(num4%6 == 0) {
			System.out.println("3�� ����鼭 ¦��");
		} else {
			if(num4%3==0) {
				System.out.println("3�� ���");
			}else {
				if(num4%2==0) {
					System.out.println("¦��");
				}else {
					System.out.println("�����");
					}
				}				
			}
		
	}
}
