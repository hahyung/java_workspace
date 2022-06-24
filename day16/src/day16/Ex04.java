package day16;

import java.util.ArrayList;

class A1{
	public void print() {
		System.out.println("A클래스");
	}
}
class B1 extends A1{
	public void print() {
		System.out.println("B클래스");
	}
	public void bbb() {}
}
class C1 extends A1{
	public void print() {
		System.out.println("C클래스");
	}
	public void add(Object a) {
		double d = (double)a;
		System.out.println(a);
	}
}
public class Ex04 {
	public static void main(String[] args) {
		/*A1 a;
		B1 b;
		C1 c;
		a = new A1(); a.print();
		b = new B1(); b.print();
		c = new C1(); c.print();*/
		A1 a; //부모가 가지고 있는 메소드만 호출할 수 있다
		a = new B1(); a.print(); //업캐스팅이라고 한다
		
		a = new C1(); a.print();
		
		B1 b = (B1)a; // 부모의 값을 자식형태로 형변환하는 것을 다운캐스팅이라고 한다
		b.bbb();
		
		ArrayList arr = new ArrayList();
		Object i = b; // Object는 모든 값의 부모이다. 어떤 타입으로도 값을 받을 수 있다
		arr.add("aaa");
		
		C1 cc = new C1();
		cc.add(111);
	}
}
