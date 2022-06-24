package day12;

public class TestClass02 {
	private String str; //외부의 접근을 막는다, 내부에서만 접근할 수 있다
	private int num;
	private String name;
	
	public void setStr() {} //변수를 만들고 set으로 설정해야할 때 이름을 set변수 로 지어 사용한다
	public void setNum() {}
	public void setName() {}

	public void getStr() {}
	
	public void setting(String s) {
		str = s;
	}
	public String getter() {
		return str;
	}
}
