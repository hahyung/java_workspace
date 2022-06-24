package day10;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t01 = new TestClass02();
		int n = 1000;
		t01.test(1000, "안녕하세요");
		
		Scanner input = new Scanner(System.in);
		int num1, num2;
		System.out.println("수 입력");
		num1 = input.nextInt();
		System.out.println("수 입력");
		num2 = input.nextInt();
		
		t01.sumFunc(num1,num2);
	}
}
