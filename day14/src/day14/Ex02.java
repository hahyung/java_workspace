package day14;

class Calc{
	public void display() {
		System.out.println("���� �����");
	}
}
class Computer extends Calc{
	public void print() {
		System.out.println("���� ��ǻ�;�~");
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Computer calc = new Computer();
		calc.print();
		calc.display();
	}
}
