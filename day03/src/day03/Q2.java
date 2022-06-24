package day03;

import java.util.Scanner;

public class Q2 {
	//키와 나이를 입력받는다 
	//키가 125이상 나이 65세 이하일시 범퍼카 탑승 가능
	//키가 125미만일때 125이상만 탑승 가능합니다 출력
	//65세 초과일때 65세 이하만 탑승 가능합니다 출력
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int height, age;
		
		System.out.println("키와 나이를 입력해주세요");
		System.out.print("키 : ");
		height = input.nextInt();
		System.out.print("나이 : ");
		age = input.nextInt();
		
		if(height>=125 && age <= 65) {
			System.out.println("범퍼카 탑승가능");
		}else if(height < 125) {
			System.out.println("125이상만 탑승가능합니다");
		}else if(age > 65) {
			System.out.println("65세 이하만 탑승가능합니다");
		}else {
			System.out.println("다시 입력해주세요");
		}
	}
}
