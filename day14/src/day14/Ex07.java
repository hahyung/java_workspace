package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 예외처리 : 프로그램에서 예외적인 상황을 처리하는 것.
 		  -단점) 프로그램을 종료시키지 않는다
 강제예외 : throw
 예외전가 : throws
 예외처리 : try, catch
 */
public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y, result=0;
		System.out.println("수 입력");
		
		try {
			x = input.nextInt();
			y = input.nextInt();
			result = x/y;
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println("0을 입력하면 안돼요");
			e.printStackTrace(); //보통 이걸 무조건 넣어야함 , 어떤 문제가 발생했는지 기록을 남겨줌
		} 
		System.out.println(result);
	}
}
