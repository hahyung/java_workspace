package day02;

public class Ex02 {
	public static void main(String[] args) {
		int num1 = 9, num2 =2;
		System.out.println(num1 / num2 );
		System.out.println(num1 / (double)num2 );
		System.out.println(num1 / 2.0 );
		System.out.println(num1 % num2 );
		
		/*
		 복합대입연산자
		 a = 10, b = 5;
		 a = a + b; => a+=b;
		 a = a * b; => a*=b;
		*/
		System.out.println("=======복합대입연산자=======");
		int a = 10, b = 5;
		a += b;
		System.out.println(a);
		
		int su1, su2;
		su1 = su2 =5;
		System.out.println(su1+=1); //su1 = su1 + 1
		System.out.println(su1-=1); //su1 = su1 - 1
		System.out.println(su1*=su2); //su1 = su1 * su2
		System.out.println(su1/=su2); //su1 = su1 / su2
		System.out.println(su1%=su2); //su1 = su1 % su2
		
		/*
		관계연산자
		a=10, b=5;
		a > b : true
		a <= b : false
		a == b : false
		a != b : true
		10 > 5 > 2 : 사용 못 함
		관계연산자는 이항연산자이며 연산자 사이 피 연산자가 2개 온다
		*/
		
		System.out.println("==========관계연산자==========");
		double do1 = 3.1, do2 = 3.0;
		System.out.println(do1 <= do2 );
		System.out.println(do1 >= do2 );
		System.out.println(do1 == do2 );
		System.out.println(do1 != do2 );
	
		/*
		논리연산자 : 참 또는 거짓 결과
		&&(and) : 모두가 참 일때 참
		||(or) : 하나라도 참이면 참
		!(not) : 반전시켜준다.
		*/
		System.out.println("=========논리연산자========");
		int su3;
		su1=10; su2=20; su3=30;
		System.out.println(su1>su2 && su1>su3);
		System.out.println("=== and ===");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("=== or ===");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println("=== not ===");
		System.out.println( !true);
		System.out.println( !false);
		
		/*
		증감연산자 : 결과적으로 자기자신을 1증가 또는 감소
		a=10;
		++a : 전치 또는 전위
		a++ : 후치 또는 후위
		a++, ++a => a = a+1;
		a--, --a => a = a-1;
		*/
		System.out.println("======증감연산자======");
		su1 = 10;
		su1++;
		System.out.println(su1);
		
		su1 = 10;
		++su1;
		System.out.println(su1);
		
		su1 = 10;
		su2 = su1++; //부호가 뒷쪽에 있으면 모든 연산이 끝난 후 증가
		System.out.println("su1 : " +su1);
		System.out.println("su2 : " +su2);
		
		su1 = 10;
		su2 = ++su1; //부호가 앞쪽에 있으면 어떤 연산자보다도 먼저 자신을 증가한다
		System.out.println("su1 : " +su1);
		System.out.println("su2 : " +su2);
		
		
		/*
		삼항연산자(조건연산자)
		변수 = 식 ? 참(값) : 거짓(값); 
		식의 값이 참이면 : 전의 값을 저장 값이 거짓이면 : 다음의 값을 저장
		 */
		System.out.println("======삼항연산자======");
		su1 = 11;
		String s = (su1%2==0)?"짝수":"홀수";
		System.out.println( su1 + s );
		
	}
}
