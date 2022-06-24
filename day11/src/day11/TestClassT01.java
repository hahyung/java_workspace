package day11;

import java.util.Scanner;

public class TestClassT01 {
	public String name;
	public int age;
	public void input() {
		System.out.println("입력받는 기능 실행");
		Scanner input = new Scanner(System.in);
		System.out.println("이름입력");
		name = input.next();
		System.out.println("나이입력");
		age = input.nextInt();
		op(); //입력 받은 후 연산을 호출할 수 있다
		
	}
	public void op() {
		System.out.println("연산하는 기능 실행");
		age = age-1;
		System.out.println("age : "+age);
	}
	public void ouput() {
		System.out.println("출력하는 기능 실행");
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
}
