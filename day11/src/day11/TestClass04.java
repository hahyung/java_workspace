package day11;

import java.util.HashMap;
import java.util.Scanner;

public class TestClass04 {
	public void display() {
		Scanner input = new Scanner(System.in);
		int age;
		String name;
		System.out.println("�̸��Է�");
		name = input.next();
		System.out.println("�����Է�");
		age = input.nextInt();
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
	}

}
