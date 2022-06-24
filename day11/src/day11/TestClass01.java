package day11;

public class TestClass01 {
	public int test01() {
		int num = 100; //해당 지역에서만 사용하는 지역 변수라고 한다 
		System.out.println("test01 : "+num);
		return num;
	}
	public void test02(int num) {
		System.out.println("test02 : "+num);
	}
}
