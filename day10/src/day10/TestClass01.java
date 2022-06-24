package day10;

import java.util.Scanner;

public class TestClass01 {
	public void sumFunc() {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		System.out.println("수 입력");
		num1 = input.nextInt();
		System.out.println("수 입력");
		num2 = input.nextInt();
		int sum = num1 + num2;
		System.out.println("두  수의 합 : "+sum);
	}
}

