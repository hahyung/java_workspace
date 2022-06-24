package day02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/*
		제어문 : 프로그램의 흐름을 제어한다
		if, switch, for, while, do while 
		*/
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.println("1.쉬운게임");
		System.out.println("2.어려운게임");
		System.out.println("3.종료");
		System.out.print(">>> : ");
		num = input.nextInt();
		if(num == 1) {
			System.out.println("쉬운게임 실행");
		}
		if(num == 2) {
			System.out.println("어려운게임 실행");
		}
		if(num == 3) {
			System.out.println("게임 종료");
		}	
	}
}
