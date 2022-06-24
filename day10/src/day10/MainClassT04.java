package day10;

import java.util.ArrayList;

public class MainClassT04 {
	public static void main(String[] args) {
		TestClassT04 t4 = new TestClassT04();
		
		ArrayList arr = t4.inputFunc();
		int sum = t4.sumFunc(arr);
		t4.outputFunc(arr, sum);
		
	}
}
