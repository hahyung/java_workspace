package day17;

class Test02<E>{
	public void sumF(E a, E b) {
		System.out.println(a+""+b);
	}
	
}
public class Ex02 {
	public static void main(String[] args) {
		Test02<String> t = new Test02();
		t.sumF("aaa", "bbb");
	}
}
