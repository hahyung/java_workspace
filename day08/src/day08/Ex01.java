package day08;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = new String("abcdefg");   //==String str;
		//String str = "abcdefg";
		/*
		System.out.println("문자열 입력");
		str = input.next();
		System.out.println(str);
		
		System.out.println(str.toUpperCase()); //대문자로 변환 toLowerCase는 소문자로 변환
		*/
		System.out.println(str.charAt(0)); //abcdefg 중 0번째 있는 값 하나만 불러옴
		System.out.println(str.charAt(0)=='a'); //문자 하나만 처리할 때는 ''사용
		System.out.println(str.charAt(1)=='a');
		
		System.out.println(str.charAt(0)-32);
		System.out.println((char)(str.charAt(0)-32));
		
		str+=" ";
		str+="z";
		System.out.println(str);
			
		str = "	aaaa aaa aaa  ";
		System.out.println(str);
		
		String re = str.trim(); //trim() 공백 제거
		System.out.println(re);
		
		String name="홍길동   ";
		System.out.println("name: "+name);
		
		if (name.trim().equals("홍길동")) { //name의 공백을 없앤 다음에 비교를 하겠다
			System.out.println("같다~");
		}else {
			System.out.println("다르다!");
		}
		
		String addr;
		addr="047869 /서울시 종로구 종로3가 /3층";
		String[] ad = addr.split("/"); // /을 기준으로 잘름
		System.out.println(ad[0]);
		System.out.println(ad[1]);
		System.out.println(ad[2]);
		
		String replace = addr.replace("/", ",");
		System.out.println(replace);
	}
}
