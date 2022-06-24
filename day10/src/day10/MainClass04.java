package day10;
/*
 오버로딩
 - 동일한 이름의 메소드를 만드는 것
 - 이름이 같은 메소드를 구별하기 위해서는 매개변수에 따라 구분한다
 - 매개변수의 개수 또는 타입이 서로 다르면 다른 메소드로 인식
 */
public class MainClass04 {
	public static void main(String[] args) {
		TestClass04 t = new TestClass04();
		t.SumFunc(10, 20);
		t.SumFunc(10, 20.222);
		t.sumFunc(12345);
		
/*
 random
 */
	for(int i =0;i<5;i++) {
		int ran = (int)(Math.random()*100)+10;
		System.out.println(ran);
	}
		
	}
}
