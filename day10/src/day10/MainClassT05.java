package day10;
/*
 로또 프로그램 만들어 보세요
 - 랜덤한 숫자 1~45까지의 숫자중 중복되지 않는 6개의 숫자
 */
public class MainClassT05 {
	public static void main(String[] args) {
		TestClassT05 t05 = new TestClassT05();
		
		int[] n = t05.lotto();
		t05.printLotto(n);
	}
}
