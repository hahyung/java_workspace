package day06;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] coin = {500, 100, 50, 10};
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
					for(int i = 0; i < coin.length; i++){
						System.out.println(coin[i] + "원 : " + money/coin[i] + "개");
					    	money = money % coin[i];
					}
				}else {
					System.out.println("반환할 금액이 없습니다.");
				}
			}else if(num==4) {
				System.out.println("종료합니다");break;
			}
		}
	}
}
