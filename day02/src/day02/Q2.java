package day02;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, sum;
		
		System.out.print("�� ������ �Է��ϼ��� : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		sum = num1+num2;
		
		if(sum%2==0) {
			System.out.println("¦��");
		}
		if(sum%2!=0) {
			System.out.println("Ȧ��");
		}
	}
}
