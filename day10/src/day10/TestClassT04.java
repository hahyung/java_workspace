package day10;

import java.util.ArrayList;
import java.util.Scanner;
// T03을 ArrayList로 변환
public class TestClassT04 {
	public ArrayList inputFunc() {
		Scanner input = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		
		int value;
		System.out.println("수를 입력하세요");
		arr.add(input.nextInt());
		System.out.println("수를 입력하세요");
		arr.add(input.nextInt());
		
		return arr;
	}
	public int sumFunc(ArrayList arr) {

		//int sum = (int)arr.get(0) + (int)arr.get(1);
		//return sum;
		
		return (int)arr.get(0) + (int)arr.get(1);
	}
	public void outputFunc(ArrayList arr, int s) {

		System.out.println("두 수의 합: "+arr.get(0)+"+"+arr.get(1)+"="+s);
		//System.out.println("두 수의 합 : "+sum);

	}
}
