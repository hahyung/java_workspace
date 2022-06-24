package day02;

import java.util.Scanner; //이 기능을 가지고 오겠다, 특정 기능들을 가지고 올 때 필요하다

public class Ex01 {
	public static void main(String[] args) {
		final String KOREA = "대한민국";
		System.out.println(KOREA);
		//KOREA = "케나다";
		//System.out.println(KOREA);
		
		Scanner input = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = input.next(); //문자열
		int age;
		
		System.out.println("나이 입력 : ");
		age = input.nextInt();
		
		System.out.println(name+"님의 나이는 "+age);
}
}
