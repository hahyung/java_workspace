package day06;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
	/*
	 배열
	 - 같은 자료형으로 연속된 공간을 만드는 것.
	 - 배열에 접근시 index를 사용하여 접근한다.
	 - index(첨자)는 0부터 시작한다.
	 - 자료형[] 배열명 또는 자료형 배열명[] 생성한다.
	 */
		int[] arr = new int[5];
		//int num=1;
		//arr[num] = 500;
		/*
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		System.out.println("arr[0] :"+arr[0]);
		System.out.println("arr[1] :"+arr[1]);
		System.out.println("arr[2] :"+arr[2]);
		System.out.println("arr[3] :"+arr[3]);
		System.out.println("arr[4] :"+arr[4]);
		*/
		System.out.println(arr.length);
		//int i;
		for(int i=0;i<arr.length;i++) {
			arr[i] = 100*(i+1);
			System.out.println(arr[i]);
			}
		//int [] str = new int[] {10,20,30,40}; 
		int [] str =  {10,20,30,40}; //new int[] 생략 가능하다
		for(int s : str) {
			System.out.println(s);
		}
		/////////////////////////////////////////
		String[] names = new String[3];
		Scanner input = new Scanner(System.in);
		for(int i=0; i<names.length; i++) {
			System.out.println(i+".이름 입력");
			names[i] = input.next();
		}
		for(int i=0; i<names.length; i++) { //둘중에 아무거나 사용
			System.out.println(names[i]);
		}
		
		for(String n : names) {				//둘중에 아무거나 사용
			System.out.println("이름 : "+n);
		}
	}
}
