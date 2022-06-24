package day14;
//예외 전가
class D01{
	public void test() throws InterruptedException { //내가 예외 처리하지 않고 전가하겠다1
		Thread.sleep(0);
	}
}
class D02 extends D01{
	public void test2() throws InterruptedException {// 내가 예외 처리하지 않고 전가하겠다2
		test();
	}
}
public class Ex08 {
	public static void main(String[] args) 
					throws InterruptedException{
		D02 d = new D02();
		d.test2();
		
		try {
			System.out.println(10/2);
		} catch (Exception e) {
			System.out.println("catch 실행");
		} finally {
			System.out.println("finally 실행");
		}
		System.out.println("다음 문장들 실행!");		
	}
				
}
