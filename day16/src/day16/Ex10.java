package day16;

import java.util.Scanner;
interface Test01{
	public static final String NAME="ȫ�浿"; //������ ���� �ʱ�ȭ
	public String N = "aaa";
}
public class Ex10 {
	public static void main(String[] args) {
		System.out.println(Test01.NAME);
		//AA���� ���� = new AA����();
		//BB���� ���� = new BB����();
		���� u;
		System.out.println("���� ó��� �Խ��ϴ�");
		System.out.println("1.���� 2.����");
		int choice = 0, num;
		
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		if(num==1) {
			u = new AA����();
			System.out.println("���� ���� �ϼ̽��ϴ�");
		}else {
			u = new BB����();
			System.out.println("���� ���� �ϼ̽��ϴ�");
		}
		System.out.println("1.���� 2.���");
		choice = input.nextInt();
		if(choice==1) u.attack();
		else if(choice==2) u.defense();
		
	}
}
