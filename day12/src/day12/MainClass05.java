package day12;
/*
 ������
 - Ŭ���� �̸��� ������ �޼ҵ�
 - ��ȯŸ���� ����
 - ���� �ʱ�ȭ�ϴ� �뵵�� ����Ѵ�
 - ��ü ������ ȣ��Ǵ� �޼ҵ��̴�
 - �����ڵ� �޼ҵ� �̱� ������ �����ε��� �����ϴ�
 */
class AAA{ //�ϳ��� ���Ͽ��� �������� public class�� ���� �� ����
	private String version;
	public AAA() {
		System.out.println("������ ����");
	}
	public AAA(String v) {
		System.out.println(v+" : v ������");
		version = v;
	}
}

public class MainClass05 {
	public static void main(String[] args) {
		AAA a = new AAA("10");
		
	}
}
