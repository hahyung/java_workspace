package day14;
class A02{
	public A02(String n ) {
		System.out.println(n +" : A02 실행");
	}
	public void t() {System.out.println("부모");}
}
class A01 extends A02{
	public void t() { System.out.println("자식");}
	public A01() {
		super("값"); //부모한테 값을 전달해 줄 때 super로 작성
		System.out.println("A01 생성자 실행");
		this.t(); //자기 자신의 값을 가지고 옴
		super.t(); //부모의 값을 가지고 옴
	}
	public A01(String s) {
		super(s);
	}
}
public class Ex03 {
	public static void main(String[] args) {
		//A01 a = new A01();
		A01 a = new A01("받아주는 값");
	}
}
