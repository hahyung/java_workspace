package day10;

public class TestClass03 {
	public int sumFunc(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("두  수의 합 : "+sum);
		return sum;
	}
	public String test() {
		System.out.println("test호출");
		return "12345"; //돌려줄 값이 숫자이기 때문에 반환타입(void)을 String으로 맞춰준다
	}
}
