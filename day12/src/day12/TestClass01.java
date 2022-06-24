package day12;

public class TestClass01 {
	public String str="인스턴스";
	
	public void setStr() {
		String str;
		str = "문자열";
		System.out.println(this.str);
	}
	
	
	public void func() {
		System.out.println("func 실행");
		System.out.println(this);
		this.func02(); //this 해당 변수의 시작 주소를 알고있는
	}
	public void func02() {
		System.out.println("func02 실행");
	}
}
