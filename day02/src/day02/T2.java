package day02;

import java.util.Scanner;

public class T2 {
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int num;
	System.out.print("�� �Է� : ");
	num = input.nextInt();
	String s = (num%2==0)?"¦��":"Ȧ��";
	String mul = (num%3==0)?"3�� ��� �̴�":"3�� ����� �ƴϴ�";
	System.out.println(num +" = "+ s);
	System.out.println(num +" = " + mul);
	
	int num1, num2;
	System.out.print("�� �� �Է� : ");
	num1 = input.nextInt();
	num2 = input.nextInt();
	String com = (num2>num1)?"ũ��":"�۴�";
	System.out.println("num1 : "+num1+" ,num2 : "+num2);
	System.out.println( "num2�� num1���� "+ com);

}
}
