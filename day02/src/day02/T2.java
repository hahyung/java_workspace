package day02;

import java.util.Scanner;

public class T2 {
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int num;
	System.out.print("수 입력 : ");
	num = input.nextInt();
	String s = (num%2==0)?"짝수":"홀수";
	String mul = (num%3==0)?"3의 배수 이다":"3의 배수가 아니다";
	System.out.println(num +" = "+ s);
	System.out.println(num +" = " + mul);
	
	int num1, num2;
	System.out.print("두 수 입력 : ");
	num1 = input.nextInt();
	num2 = input.nextInt();
	String com = (num2>num1)?"크다":"작다";
	System.out.println("num1 : "+num1+" ,num2 : "+num2);
	System.out.println( "num2가 num1보다 "+ com);

}
}
