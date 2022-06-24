package day12;
//set 값을 설정
//get 값을 얻어옴
public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t = new TestClass02();
		// t.str = "안녕하세요";
		// System.out.println(t.str);
		t.setting("홍길동");	
		String s = t.getter();
		System.out.println(s);
	}
	
}
