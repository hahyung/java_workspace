package day06;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		//�� �л����� �� �л����� ������ �Է¹޾�, �л����� ��ü ��������� ���ϱ�
		//1. �л��� 2.�����Է� 3.����Ʈ 4.��� 5.����
		
		Scanner input = new Scanner(System.in);
		boolean start = true;
		int num, stu=0;
		double avg =0;
		int score[] = {};
		
		while(start) {
			System.out.println("1. �л��� | 2. ���� �Է� | 3. ����Ʈ | 4. ��� | 5. ����");
			System.out.print(">>> ");
			num = input.nextInt();
		
		switch(num) {
		
		case 1: 
			System.out.print("�л��� �Է� : ");
			stu = input.nextInt();
			score = new int[stu];break;
		
		case 2:
			for(int i=0;i<score.length;i++) {
				System.out.print("�л�"+(i+1)+"> ");
				score[i] = input.nextInt();		
			}break;
		case 3:
			for(int i=0; i<score.length; i++) {
				System.out.println("�л�"+(i+1)+" : "+score[i]);
			}break;
		case 4:
			int sum = 0;
			for(int i = 0; i<score.length; i++) {
				sum+=score[i];
			}
			avg = (double)sum/stu;
			System.out.println("������� : "+avg);break;
		case 5: 
			System.out.println("���α׷�����");
		default:
			start = false;
		}
		}
		
	}
}
