package day16;

import java.util.Scanner;
interface Test01{
	public static final String NAME="홍길동"; //무조건 값을 초기화
	public String N = "aaa";
}
public class Ex10 {
	public static void main(String[] args) {
		System.out.println(Test01.NAME);
		//AA지상군 지상군 = new AA지상군();
		//BB공군 공군 = new BB공군();
		공방 u;
		System.out.println("적이 처들어 왔습니다");
		System.out.println("1.지상군 2.공군");
		int choice = 0, num;
		
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		if(num==1) {
			u = new AA지상군();
			System.out.println("지상군 선택 하셨습니다");
		}else {
			u = new BB공군();
			System.out.println("공군 선택 하셨습니다");
		}
		System.out.println("1.공격 2.방어");
		choice = input.nextInt();
		if(choice==1) u.attack();
		else if(choice==2) u.defense();
		
	}
}
