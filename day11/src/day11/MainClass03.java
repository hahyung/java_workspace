package day11;

public class MainClass03 {
	public void test() {
		System.out.println("main test ¿‘¥œ¥Ÿ");
	}
	public static void main(String[] args) {
		MainClass03 m = new MainClass03();
		m.test();
		//TestClass03 t03 = new TestClass03();
		System.out.println(TestClass03.name);
		TestClass03.test();
		
		System.out.println(TestClass03.KOREA);
	}
}
