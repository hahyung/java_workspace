package day05;

import java.util.Scanner;

public class T2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, num2, sum=0, sum2=0;
		
		System.out.println("1~10 ������ ���� �Է��ϼ���: ");
		num = input.nextInt();
		for(int i=0; i <=num; i++) {
			sum+=i;
		}
		System.out.println("�Է¹��� �������� �� : "+sum);
		
		System.out.println("===========================");
		System.out.println("10~20 ������ ���� �Է��ϼ���: ");
		num2 = input.nextInt();
		for(int i=10; i <=num2; i++) {
			sum2+=i;
		}
		System.out.println("�Է¹��� �������� �� : "+sum2);
		
	}
}
