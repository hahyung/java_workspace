package day02;

import java.util.Scanner;

public class T1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("����� �̸��� �����Դϱ�? ");
		String name = input.next();
		
		int kscore;
		int escore;
		int mscore;
		System.out.print(name +" ���� ���� ���� : ");
		kscore = input.nextInt();
		System.out.print(name +" ���� ���� ���� : ");
		escore = input.nextInt();
		System.out.print(name +" ���� ���� ���� : ");
		mscore = input.nextInt();
		
		System.out.println("============");
		System.out.println("�� �� : "+ name);
		System.out.println("============");
		System.out.println("�� �� : "+ kscore);
		System.out.println("�� �� : "+ escore);
		System.out.println("�� �� : "+ mscore);
		System.out.println("============");
		System.out.println("�� �� : "+ (kscore+escore+mscore));
		System.out.println("============");
	
		
		
		
	}
}
