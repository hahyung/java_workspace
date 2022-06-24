package day10;

import java.util.Scanner;

public class TestClassT02 {
	public String[] inputFunc() {
		Scanner input = new Scanner(System.in);
		String[] nameArr = new String[3];
		for(int i=0;i<nameArr.length;i++) {
			System.out.println(i+". 이름 입력");
			nameArr[i] = input.next();
		
		}
		return nameArr;
	}
	public void outputFunc(String[] nameArr) {
		System.out.println("====이름 출력===");
		for(int i=0;i<nameArr.length;i++) {
			System.out.println(i+"."+ nameArr[i]);
			
		}
	}
}
