package day10;
/*
 �����ε�
 - ������ �̸��� �޼ҵ带 ����� ��
 - �̸��� ���� �޼ҵ带 �����ϱ� ���ؼ��� �Ű������� ���� �����Ѵ�
 - �Ű������� ���� �Ǵ� Ÿ���� ���� �ٸ��� �ٸ� �޼ҵ�� �ν�
 */
public class MainClass04 {
	public static void main(String[] args) {
		TestClass04 t = new TestClass04();
		t.SumFunc(10, 20);
		t.SumFunc(10, 20.222);
		t.sumFunc(12345);
		
/*
 random
 */
	for(int i =0;i<5;i++) {
		int ran = (int)(Math.random()*100)+10;
		System.out.println(ran);
	}
		
	}
}
