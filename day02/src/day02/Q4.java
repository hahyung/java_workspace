package day02;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
	//국수영 각 과목의 점수를 int형 타입의 변수 3개를 선언하고 입력받기.
	//모두 80점 이상이면서 총 점수가 260점이상이면 "합격"를 출력, 한 과목이라도 80점 미만인 경우, "불합격"를 출력하기
		Scanner input = new Scanner(System.in);
		int kScore, mScore, eScore, sum;
		
		System.out.print("국어 점수 : ");
		kScore = input.nextInt();
		System.out.print("수학 점수 : ");
		mScore = input.nextInt();
		System.out.print("영어 점수 : ");
		eScore = input.nextInt();
		
		sum = kScore+mScore+eScore;
		if (kScore<80 || mScore<80 || eScore<80 || sum<260) {
			System.out.println("불합격");
		}
		if (kScore>=80 && mScore>=80 && eScore>=80 && sum>=260) {
			System.out.println("합격");
		}
		
	}
}
