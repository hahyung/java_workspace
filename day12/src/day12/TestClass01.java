package day12;

public class TestClass01 {
	public String str="�ν��Ͻ�";
	
	public void setStr() {
		String str;
		str = "���ڿ�";
		System.out.println(this.str);
	}
	
	
	public void func() {
		System.out.println("func ����");
		System.out.println(this);
		this.func02(); //this �ش� ������ ���� �ּҸ� �˰��ִ�
	}
	public void func02() {
		System.out.println("func02 ����");
	}
}
