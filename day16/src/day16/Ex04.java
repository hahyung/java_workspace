package day16;

import java.util.ArrayList;

class A1{
	public void print() {
		System.out.println("AŬ����");
	}
}
class B1 extends A1{
	public void print() {
		System.out.println("BŬ����");
	}
	public void bbb() {}
}
class C1 extends A1{
	public void print() {
		System.out.println("CŬ����");
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
		A1 a; //�θ� ������ �ִ� �޼ҵ常 ȣ���� �� �ִ�
		a = new B1(); a.print(); //��ĳ�����̶�� �Ѵ�
		
		a = new C1(); a.print();
		
		B1 b = (B1)a; // �θ��� ���� �ڽ����·� ����ȯ�ϴ� ���� �ٿ�ĳ�����̶�� �Ѵ�
		b.bbb();
		
		ArrayList arr = new ArrayList();
		Object i = b; // Object�� ��� ���� �θ��̴�. � Ÿ�����ε� ���� ���� �� �ִ�
		arr.add("aaa");
		
		C1 cc = new C1();
		cc.add(111);
	}
}
