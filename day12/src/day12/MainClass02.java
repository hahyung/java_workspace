package day12;
//set ���� ����
//get ���� ����
public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t = new TestClass02();
		// t.str = "�ȳ��ϼ���";
		// System.out.println(t.str);
		t.setting("ȫ�浿");	
		String s = t.getter();
		System.out.println(s);
	}
	
}
