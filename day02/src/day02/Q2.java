package day02;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, sum;
		
		System.out.print("두 정수를 입력하세요 : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		sum = num1+num2;
		
		if(sum%2==0) {
			System.out.println("짝수");
		}
		if(sum%2!=0) {
			System.out.println("홀수");
		}
	}
}
