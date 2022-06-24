package day02;

import java.util.Scanner;

public class T1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까? ");
		String name = input.next();
		
		int kscore;
		int escore;
		int mscore;
		System.out.print(name +" 님의 국어 점수 : ");
		kscore = input.nextInt();
		System.out.print(name +" 님의 영어 점수 : ");
		escore = input.nextInt();
		System.out.print(name +" 님의 수학 점수 : ");
		mscore = input.nextInt();
		
		System.out.println("============");
		System.out.println("이 름 : "+ name);
		System.out.println("============");
		System.out.println("국 어 : "+ kscore);
		System.out.println("영 어 : "+ escore);
		System.out.println("수 학 : "+ mscore);
		System.out.println("============");
		System.out.println("합 계 : "+ (kscore+escore+mscore));
		System.out.println("============");
	
		
		
		
	}
}
