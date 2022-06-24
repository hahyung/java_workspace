package day14;

class Calc{
	public void display() {
		System.out.println("나는 계산기야");
	}
}
class Computer extends Calc{
	public void print() {
		System.out.println("나는 컴퓨터야~");
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Computer calc = new Computer();
		calc.print();
		calc.display();
	}
}
