package day10;

import java.util.Scanner;

public class TestClassT {
	public String inputFunc() {
		String name;
		Scanner input = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		name = input.next();
		return name;
	}
	public void outputFunc(String name) {
		System.out.println("����� �̸��� "+name);
	}
}
