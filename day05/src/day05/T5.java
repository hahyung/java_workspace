package day05;

import java.util.Scanner;

public class T5 {
	public static void main(String[] args) {
		//자판기
		Scanner input = new Scanner(System.in);
		int num, money=0;
		boolean flag = true;
		System.out.print("요금을 투입 하세요 >>> ");
		money = input.nextInt();
		while(flag) {
			System.out.println("==========커피 자판기=========");
			System.out.println("1. 커피 200\t2. 코코아 250\t3. 반환\t4. 종료");
			System.out.print("메뉴를 선택하세요 >>> ");
			num = input.nextInt();
			if(num==1) {
				if(money>=0) {
					System.out.println("맛있게드세요^^");
				}else {
					System.out.println("잔돈이 부족합니다");
				}
				money = money - 200;
			}else if (num==2) {
				if(money>=0) {
					System.out.println("맛있게드세요^^");
				}else {
					System.out.println("잔돈이 부족합니다");
				}
				money = money - 250;
			}else if(num==3) {
				if(money>0) {
					System.out.println("반환 금액 "+money+"원 입니다");
				}else {
					System.out.println("반환할 금액이 없습니다.");
				}
			}else if(num==4) {
				System.out.println("종료합니다");break;
			}
		}
	}
}
