package day09;

import test.Member;

/*
 Ŭ������ �ϳ��� �ڷ����̶�� �����ϸ� �ȴ�
 Ŭ������ ���� ������ ��ü��� ǥ��
 ���� ������
 - public : Ŭ���� ����, �ܺο��� ���� ����
 - private : Ŭ���� ���ο����� ���� ����
 - protected : ��ӹ��� �ڽ� �Ǵ� ���ο��� ���� ����
 - default : ���� ��Ű�� �ȿ��� ���� ����
 */
public class MainClass01 {
	public static void main(String[] args) {
		Member m = new Member();
		m.name = "ȫ�浿";
		
		
		TestClass01 t = new TestClass01();
		t.name="ȫ�浿";
		t.addr="����3��";
		t.age=25;
		
	}
	
	
}
