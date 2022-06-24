package day11;

import java.util.Scanner;

public class TestClassT02 {
	public String name, grade;
	public int kor, eng, math, sum;
	public double avg;
	/*
	 입력, 연산, 출력 기능을 만들어 주세요
	 입력 : 이름, 국, 영, 수
	 연산 : 합을 구하는 기능, 평균을 구하는 기능, 등급을 구하는 기능
	 출력 : 이름, 국, 영, 수, 합, 평균, 등급
	 등급 : 평균이 90이상 A, 80이상 B 나머진 C
	 */
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.print("이름 : ");
		name = input.next();
		System.out.print("국어 점수: ");
		kor = input.nextInt();
		System.out.print("영어 점수: ");
		eng = input.nextInt();
		System.out.print("수학 점수: ");
		math = input.nextInt();
	}
	public void op() {
		sum = kor + eng + math;
		avg = sum/3.0;
		if(avg>=90) {
			grade = "A";
		}else if(avg>=80) {
			grade = "B";
		}else {
			grade = "C";
		}
	}
	public void print() {
		System.out.println("이름 : "+name);
		System.out.println("국: "+kor+" 영: "+eng+" 수: "+math);
		System.out.println("합: "+sum);
		System.out.println("평균: "+avg);
		System.out.println("등급: "+grade);
	}
}
