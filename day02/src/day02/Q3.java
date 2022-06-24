package day02;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		//시험점수 별로 등급 나누기 90이상 A, 80이상 B, 70이상 C, 60이상 D, 59이하 F
		Scanner input = new Scanner(System.in);
		int score;
		System.out.print("시험점수를 입력하시오 : ");
		score = input.nextInt();
		
		if(score>90) {
			System.out.println("A");
		}
		if(89>=score && score>80) {
			System.out.println("B");
		}
		if(79>=score && score>70) {
			System.out.println("C");
		}
		if(69>=score && score>60) {
			System.out.println("D");
		}
		if(score<=59) {
			System.out.println("F");
		}
			
		
	}
}
