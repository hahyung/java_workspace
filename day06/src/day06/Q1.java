package day06;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		//총 학생수와 그 학생들의 점수를 입력받아, 학생들의 전체 평균점수를 구하기
		//1. 학생수 2.점수입력 3.리스트 4.평균 5.종료
		
		Scanner input = new Scanner(System.in);
		boolean start = true;
		int num, stu=0;
		double avg =0;
		int score[] = {};
		
		while(start) {
			System.out.println("1. 학생수 | 2. 점수 입력 | 3. 리스트 | 4. 평균 | 5. 종료");
			System.out.print(">>> ");
			num = input.nextInt();
		
		switch(num) {
		
		case 1: 
			System.out.print("학생수 입력 : ");
			stu = input.nextInt();
			score = new int[stu];break;
		
		case 2:
			for(int i=0;i<score.length;i++) {
				System.out.print("학생"+(i+1)+"> ");
				score[i] = input.nextInt();		
			}break;
		case 3:
			for(int i=0; i<score.length; i++) {
				System.out.println("학생"+(i+1)+" : "+score[i]);
			}break;
		case 4:
			int sum = 0;
			for(int i = 0; i<score.length; i++) {
				sum+=score[i];
			}
			avg = (double)sum/stu;
			System.out.println("평균점수 : "+avg);break;
		case 5: 
			System.out.println("프로그램종료");
		default:
			start = false;
		}
		}
		
	}
}
