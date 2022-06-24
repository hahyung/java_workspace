package day15;
class A01 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("A01 : "+i);
		}
	}
}
class B01 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("B01 : "+i);
		}
	}
}
public class Ex01 {
	public static void main(String[] args) {
		A01 a = new A01();
		B01 b = new B01();
		//a.run();
		//b.run();
		
		a.setDaemon(true); //메인이 종료가 되면 다른 Thread도 종료
		b.setDaemon(true);
		
		a.start(); //Thread를 동작 시키고 싶다면 run을 사용 start 를 사용하여 호출 부모가 가지고 있는 start를 호출
		b.start(); 
		
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
		
	}
}
