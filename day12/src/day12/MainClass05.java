package day12;
/*
 생성자
 - 클래스 이름과 동일한 메소드
 - 반환타입은 없다
 - 값을 초기화하는 용도로 사용한다
 - 객체 생성시 호출되는 메소드이다
 - 생성자도 메소드 이기 때문에 오버로딩이 가능하다
 */
class AAA{ //하나의 파일에서 여러개의 public class를 만들 수 없다
	private String version;
	public AAA() {
		System.out.println("생성자 실행");
	}
	public AAA(String v) {
		System.out.println(v+" : v 생성자");
		version = v;
	}
}

public class MainClass05 {
	public static void main(String[] args) {
		AAA a = new AAA("10");
		
	}
}
