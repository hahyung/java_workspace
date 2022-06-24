package day12;

import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		Scanner input = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = input.next();
		t.setName(name);
		
		System.out.println("당신 이름 : "+t.getName());
	}
}
