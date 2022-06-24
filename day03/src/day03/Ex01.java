package day03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int num = 10;
		if(num%2==0) {//조건이 참이면 종속 문장 실행
			System.out.println("짝수");
		}else {//if 조건이 거짓이면 else 실행
			System.out.println("홀수");
		}
		System.out.println("다음 문장들 실행");
		
		//수를 입력 받아 5의 배수인지 아닌지 구분
		System.out.println("수를 입력 받아 5의 배수인지 아닌지 구분");
		Scanner input = new Scanner(System.in);
		int num1;
		
		System.out.print("숫자를 입력해주세요 : ");
		num1 = input.nextInt();
		
		if(num1%5==0) {
			System.out.println("5의 배수입니다");
		}else {
			System.out.println("5의 배수가 아닙니다");
		}
		
		//수를 입력 받아 0보다 크고 100보다 작으면 정상, 아니면 비정상으로 출력
		System.out.println("수를 입력 받아 0보다 크고 100보다 작으면 정상, 아니면 비정상으로 출력");
		int num2;
		
		System.out.print("수 입력 : ");
		num2 = input.nextInt();
		
		if(num2<100 && num2>0 ) {
			System.out.println("정상");
		}else {
			System.out.println("비정상");
		}
		
		//수를 입력 받아 짝수이면서 3의 배수이면 출력, 아니면
		System.out.println("수를 입력 받아 짝수이면서 3의 배수이면 출력, 아니면");
		int num3;
		
		System.out.print("수 입력 : ");
		num3 = input.nextInt();
		
		if(num3%2==0 && num3%3==0) { //num3%6 == 0 으로도 가능
			System.out.println("짝수면서 3의 배수");
		}else {
			System.out.println("아님");
		}
		
		//수를 입력 받아 짝수이면서 3의 배수이면 출력
		//3의 배수가 아니며, 짝수만 해당하면 짝수, 또는 홀수
		//짝수가 아니며, 3의 배수에만 해당하면 3의 배수, 아님
		//해당되지 않으면 해당 되지 않음
		System.out.println("수를 입력 받아 짝수이면서 3의 배수이면 출력");
		System.out.println("3의 배수가 아니며, 짝수만 해당하면 짝수, 또는 홀수");
		System.out.println("짝수가 아니며, 3의 배수에만 해당하면 3의 배수, 아님");
		System.out.println("해당되지 않으면 해당 되지 않음");
		
		int num4;
		
		System.out.print("수 입력 : ");
		num4 = input.nextInt();
		
		if(num4%6 == 0) {
			System.out.println("3의 배수면서 짝수");
		} else {
			if(num4%3==0) {
				System.out.println("3의 배수");
			}else {
				if(num4%2==0) {
					System.out.println("짝수");
				}else {
					System.out.println("벗어나다");
					}
				}				
			}
		
	}
}
