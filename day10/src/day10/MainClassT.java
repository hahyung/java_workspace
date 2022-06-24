package day10;
/*
이름을 입력 받아 출력하는 프로그램을 만드세요
입력기능, 출력기능, 메인
*/

public class MainClassT {
	public static void main(String[] args) {
		TestClassT t01 = new TestClassT();
		
		String n = t01.inputFunc();
		t01.outputFunc(n);
	}
}
