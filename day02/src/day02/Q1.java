package day02;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score;
		
		System.out.print("점수를 입력하세요 : ");
		score = input.nextInt();
		
		if(score>70) {
			System.out.println("pass");
		}
		if(score<=69) {
			System.out.println("fail");
		}
	}
}
