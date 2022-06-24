package day16;

import java.util.ArrayList;

final class A{ //final이라는 키워드를 넣게 되면 해당하는 클래스는 상속을 할 수 없다, 메소드를 변경하지 말고 사용할 때 사용
	public void aaa() {  
		System.out.println("A클래스");
	}
}
class B extends ArrayList{
	A a = new A();
	public void bbb() {
		String s;
		a.aaa();
		System.out.println("B클래스");
	}
}
class AA{
	public void aa() {}
}
class BB extends AA{
	public void bb() {}
}
public class Ex02 {
	public static void main(String[] args) {
		BB bb = new BB();
		
		B b = new B(); b.bbb();
		
		b.add("aaa");
		System.out.println(b.get(0));
	}
}
