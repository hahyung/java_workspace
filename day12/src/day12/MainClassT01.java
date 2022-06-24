package day12;

import java.util.Scanner;

/*
나이도 저장하는 기능을 만들어 주세요
set, get 메소드 생성
그리고 나이를 만으로 연산하는 메소드도 만들어 주세요
입력: 나이 입력 : 20
출력: 나이는 : 19세 이군요
*/
public class MainClassT01 {
	public static void main(String[] args) {
		TestClassT01 t = new TestClassT01();
		Scanner input = new Scanner(System.in);
		System.out.println("나이 입력 :");
		int age = input.nextInt();
		t.setAge(age);
		System.out.println("나이는 :"+t.getAge()+"세 이군요");
		
	}
	
}
