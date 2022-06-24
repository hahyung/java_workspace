package day07;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 컬렉션 프레임 워크
		 컬렉션
		 - 다수의 데이터, 데이터 그룹
		 - 무한한 데이터의 집합 
		 - 자바의 자료구조
		 프레임워크
		 - 하나의 틀
		 - 표준화된 프로그래밍 방식
		 List, Set, Map
		 
		 List
		 - ArrayList
		 - LinkedList
		 - Stack
		 
		 ArrayList
		 - 순서를 유지한다.
		 - 데이터의 중복을 허용한다.
		 */
		ArrayList arr = new ArrayList(); //첫 번째 글자가 대문자인것을 우리는 클래스라고 한다. 자료형의 변수는 기능을 가지고 있다.
		arr.add("123");
		arr.add("456");
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		
		int s = arr.size();
		System.out.println( s );
		
		int[] a= new int[3];
		System.out.println(a.length);
		
		boolean bool = arr.contains("123");
		if(bool == true) {
			System.out.println("123은 존재합니다");
		}
		
		System.out.println(arr.contains("123"));
		System.out.println(arr.contains("12311"));
		
		System.out.println(arr.remove("123")); //삭제
		System.out.println(arr.get(0));
		System.out.println(arr.size());
		
		arr.clear(); //전체 삭제
		System.out.println(arr.size());
		
		arr.add("라면"); arr.add("소금"); //추가 add를 하면 순차적으로 추가 됨. 만약 특정 순서의 내용을 바꾸고 싶다면 set을 사용하면 됨
		arr.add("순대");
		String index = "순대";
		int i = arr.indexOf(index);
		System.out.println(i+"번째 존재함");
		
		System.out.println("변경 전 "+arr.get(1));
		arr.set(i, "금금");
		System.out.println("변경 후 "+arr.get(1));
	}
}
