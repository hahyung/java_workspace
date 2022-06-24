package day10;

public class TestClass04 {
	public void SumFunc(int a, int b) {
		System.out.println("int, int");
		System.out.println(a+b);
	}
	public void sumFunc(int a) {
		System.out.println("a 값 : "+a);
	}
	public void SumFunc(int a, double b) { //안에 있는 자료형이 다르면 다른 메소드라고 인식한다.
		System.out.println("int, double");
		System.out.println(a+b);
	}
}
