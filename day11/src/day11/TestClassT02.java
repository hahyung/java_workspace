package day11;

import java.util.Scanner;

public class TestClassT02 {
	public String name, grade;
	public int kor, eng, math, sum;
	public double avg;
	/*
	 �Է�, ����, ��� ����� ����� �ּ���
	 �Է� : �̸�, ��, ��, ��
	 ���� : ���� ���ϴ� ���, ����� ���ϴ� ���, ����� ���ϴ� ���
	 ��� : �̸�, ��, ��, ��, ��, ���, ���
	 ��� : ����� 90�̻� A, 80�̻� B ������ C
	 */
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.print("�̸� : ");
		name = input.next();
		System.out.print("���� ����: ");
		kor = input.nextInt();
		System.out.print("���� ����: ");
		eng = input.nextInt();
		System.out.print("���� ����: ");
		math = input.nextInt();
	}
	public void op() {
		sum = kor + eng + math;
		avg = sum/3.0;
		if(avg>=90) {
			grade = "A";
		}else if(avg>=80) {
			grade = "B";
		}else {
			grade = "C";
		}
	}
	public void print() {
		System.out.println("�̸� : "+name);
		System.out.println("��: "+kor+" ��: "+eng+" ��: "+math);
		System.out.println("��: "+sum);
		System.out.println("���: "+avg);
		System.out.println("���: "+grade);
	}
}
