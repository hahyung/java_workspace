package day01;
/*
 bit 	: 2진수의 한자리가 1bit
 1byte	: 8bit
 type	크기(byte)		범위
 ------------------------------------
 byte		1		-128 ~ 127
 short		2		-32768 ~ 32767
 char		2		0 ~ 65535	
 int		4
 float		4
 double		4
 void		값을 갖지 않는 특수한 데이터 형
*/
public class Test04 {
	public static void main(String[] args) {
		int age = 25; // int : 정수(음, 양수) 표현
		double weight = 55.0; // 실수 표현
		double height = 160.0; 
		System.out.println("나의 나이는 " +age+ "살");
		System.out.println("나의 키는 " +height+ "cm");
		System.out.println("나의 몸무게는 " +weight+ "kg");
		// char문자 하나 표현할 때 사용
		// 문자 하나는 작은 따옴표로 표현해야 한다.
		char ch = 'A';
		System.out.println("변경 전 : "+ch);
		ch = 'B';
		System.out.println("변경 후 : "+ch);
		
		System.out.println( "연산 : "+ (ch+32) ); 
		System.out.println( "연산 : "+ (char)(ch+32) ); //98이라는 숫자를 문자로 표현
		System.out.println( "연산 : "+ (double)(ch+32) );
		
		System.out.println( 1.111 );
		System.out.println( (int)12.111 );
		
		String n = "홍길동";
		System.out.println(n+"님 안녕하세요");
		n = "김개똥";
		System.out.println("이름 변경 : "+n);
		
	}
}
