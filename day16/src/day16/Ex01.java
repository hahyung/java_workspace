package day16;
/*
 Overriding
 -��ӹ��� �ڽĿ��� �θ��� �޼ҵ�� �����ϰ� ����� ��
 -�θ��� �޼ҵ尡 ����Ǵ°� �ƴ϶� �ڽ��� �޼ҵ尡 ���� �Ǵ� ��
 -����
   - �θ� �޼ҵ�� ������ ���ƾ� �Ѵ�.
 */
class Ferrai{
	private int ye;
	public Ferrai(int ye) {this.ye = ye;}
	public int getYe() {return ye;}
	protected void speed() {
		System.out.println(ye+"��� ��� �ӵ� 300km");
	}
}
class NewFerrai extends Ferrai{
	public NewFerrai(int y) {super(y);}
	public void autoSystem() {
		System.out.println("�ڵ� ���� ��� �����մϴ�");
	}
	public void speed() {
		System.out.println(super.getYe()+"��� ��� 400km"); //super�� ����ϸ� �θ��� ���� ����Ѵٴ� ���� �� ������ �ְ� Ȯ�� �� �� �ִ�
	}
}
public class Ex01 {
	public static void main(String[] args) {
		NewFerrai f = new NewFerrai(2023);
		f.speed();
		f.autoSystem();
	}
}
