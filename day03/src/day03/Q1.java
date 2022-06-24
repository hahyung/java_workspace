package day03;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		//음료를 선택지에서 입력받는다. 선택지에 없는 숫자라면 다시 입력해주세요 문구 출력
		//넣을 금액을 입력 한다. 넣은 금액이 음료 가격보다 적다면 금액이 부족합니다 출력
		//선택한 음료와  가격출력
		//남은 잔액 출력
		Scanner input = new Scanner(System.in);
		int num, money, total;
		int  price = 0;
		String menu = null;
		
		System.out.println("┌-----*음료 자판기*----┐");
		System.out.println("|1.    사이다   1000원|");
		System.out.println("|2.    캔커피    800원|");
		System.out.println("|3.     콜라   1500원|");
		System.out.println("|4.     생수    500원|");
		System.out.println("└-------------------┘");
		
		System.out.print("메뉴를 선택하세요: ");
		num = input.nextInt();
		System.out.print("넣으실 금액권을 입력하세요 : ");
		money = input.nextInt();
		
		if (num == 1) {
			price = 1000;
			menu = "사이다";
		}else if (num == 2) {
			price = 800;
			menu = "캔커피";
		}else if (num == 3) {
			price = 1500;
			menu = "콜라";
		}else if (num == 4) {
			price = 500;
			menu = "생수";
		}else {
			System.out.println("다시 입력해주세요");
		}
		System.out.println("==========================");
		total = money - price;
		if(total<0) {
			System.out.println("금액이 부족합니다");
		}else {
			System.out.println("주문하신 음료는 "+menu+" "+price+"원입니다.");
			System.out.println("남은 잔액은 "+total+"원입니다.");
		}
		
		
	}
}
