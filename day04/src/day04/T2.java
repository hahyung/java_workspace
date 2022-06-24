package day04;

import java.util.Scanner;

public class T2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num=0;
		String home=null , company = null;
		while(true) {
			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			num = input.nextInt();
		
			switch(num) {
			case 1: 
				System.out.print("우리 집 : ");
				home = input.next();break;
			case 2:
				System.out.print("회사 : ");
				company = input.next();break;
			case 3:
				if(home != null && company != null) {
				System.out.println("우리집 : "+home);
				System.out.println("회사 : " + company);
				}else {
					System.out.println("등록 먼저 하세요");
				}break;
			}
		}
	}
}
