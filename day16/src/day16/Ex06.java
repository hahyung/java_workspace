package day16;
class Ex06Class implements Test{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("test");
	}
	
}
public class Ex06 {//interface 상속은 implements 를 사용한다
	public static void main(String[] args) {
		Ex06Class e = new Ex06Class();
		e.test();
	}

}
