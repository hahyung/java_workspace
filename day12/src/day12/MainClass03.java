package day12;

import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		Scanner input = new Scanner(System.in);
		System.out.println("�̸� �Է�");
		String name = input.next();
		t.setName(name);
		
		System.out.println("��� �̸� : "+t.getName());
	}
}
