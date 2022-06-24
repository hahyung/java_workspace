package day10;

import java.util.Scanner;

public class TestClassT {
	public String inputFunc() {
		String name;
		Scanner input = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name = input.next();
		return name;
	}
	public void outputFunc(String name) {
		System.out.println("당신의 이름은 "+name);
	}
}
