package day14;
class C01{
	protected String n;
}
class C02 extends C01{
	public void test() {
		n = "æ»≥Á«œººø‰";
		print();
	}
	public void print() {System.out.println(n);}
}
public class Ex04 {
	public static void main(String[] args) {
		C02 c = new C02();
		c.test();
	}
}
