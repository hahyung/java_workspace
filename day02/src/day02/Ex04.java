package day02;

public class Ex04 {
	public static void main(String[] args) {
		int num = 1;
		if(num%2 == 0) {
			System.out.println("짝수");
		}
		if(num%2 != 0) {
			System.out.println("홀수");
		}
		
		
		
		
		if(num < 10) {
			System.out.println("1.num 10보다 작다"); //if 다음에 오는 문장은 if문에 대한 종속 문장이다. 
			System.out.println("2.num 10보다 작다"); //조건이 참이여만 실행 거짓인 경우 종속문장은 실행되지 않고 다음 문자으로 실행
			System.out.println("3.num 10보다 작다"); //{}로 묶는다면 그 안의 문장들은 모두 종속 문장
		}
		System.out.println("다음 문장들 실행");
	}
}
