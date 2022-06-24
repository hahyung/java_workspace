package day10;

import java.util.Scanner;

public class TestClassT03 {
	public int[] inputFunc() {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[2];
		
		System.out.println("두 수를 입력하세요");
		arr[0] = input.nextInt();
		arr[1] = input.nextInt();
		//System.out.println("수 입력");
		//arr[0] = input.nextInt();
		//System.out.println("수 입력");
		//arr[1] = input.nextInt();
		return arr;
	}
	public int sumFunc(int[] arr) {
		int sum = arr[0] + arr[1];
		return sum;
		//return a[0] + a[1];
	}
	public void outputFunc(int sum) {
	//public void outputFunc(int a,int b,int c)	
		System.out.println("두 수의 합 : "+sum);
		//System.out.println(a +"+"+b+"="+c);
	}
}
