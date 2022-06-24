package day11;

public class TestClass02 {
	public int num = 100;
	public String name; //인스턴스 변수
	public void test01() {
		name = "홍길동";
		System.out.println("test01 : "+num);
	}
	public void test02() {
		System.out.println("이름 : "+name);
		System.out.println("test02 : "+num);
	}
}