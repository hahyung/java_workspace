package day02;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
	//������ �� ������ ������ int�� Ÿ���� ���� 3���� �����ϰ� �Է¹ޱ�.
	//��� 80�� �̻��̸鼭 �� ������ 260���̻��̸� "�հ�"�� ���, �� �����̶� 80�� �̸��� ���, "���հ�"�� ����ϱ�
		Scanner input = new Scanner(System.in);
		int kScore, mScore, eScore, sum;
		
		System.out.print("���� ���� : ");
		kScore = input.nextInt();
		System.out.print("���� ���� : ");
		mScore = input.nextInt();
		System.out.print("���� ���� : ");
		eScore = input.nextInt();
		
		sum = kScore+mScore+eScore;
		if (kScore<80 || mScore<80 || eScore<80 || sum<260) {
			System.out.println("���հ�");
		}
		if (kScore>=80 && mScore>=80 && eScore>=80 && sum>=260) {
			System.out.println("�հ�");
		}
		
	}
}
