package day09;

import test.Member;

/*
 클래스란 하나의 자료형이라고 생각하면 된다
 클래스로 만든 변수는 객체라고 표현
 접근 제한자
 - public : 클래스 내부, 외부에서 접근 가능
 - private : 클래스 내부에서만 접근 가능
 - protected : 상속받은 자식 또는 내부에서 접근 가능
 - default : 같은 패키지 안에서 접근 가능
 */
public class MainClass01 {
	public static void main(String[] args) {
		Member m = new Member();
		m.name = "홍길동";
		
		
		TestClass01 t = new TestClass01();
		t.name="홍길동";
		t.addr="종로3가";
		t.age=25;
		
	}
	
	
}
