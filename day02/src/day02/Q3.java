package day02;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		//�������� ���� ��� ������ 90�̻� A, 80�̻� B, 70�̻� C, 60�̻� D, 59���� F
		Scanner input = new Scanner(System.in);
		int score;
		System.out.print("���������� �Է��Ͻÿ� : ");
		score = input.nextInt();
		
		if(score>90) {
			System.out.println("A");
		}
		if(89>=score && score>80) {
			System.out.println("B");
		}
		if(79>=score && score>70) {
			System.out.println("C");
		}
		if(69>=score && score>60) {
			System.out.println("D");
		}
		if(score<=59) {
			System.out.println("F");
		}
			
		
	}
}
