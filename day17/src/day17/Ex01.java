package day17;
/*
 Wapper	class
 int	 Integer
 char	 Char
 double	 Double
 ..
 */
class Test01{
	public void sumF(int a, int b) {
		System.out.println(a+b);
	}
	public void sumF(String a, String b) {
		System.out.println(a+b);
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		t.sumF(10, 20);
		t.sumF("aaa", "bbb");
	}
}
