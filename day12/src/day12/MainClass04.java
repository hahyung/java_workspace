package day12;

import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) {
		TestClass04 t = new TestClass04();
		int k,e,m;
		//국,영,수,합,평균
		//각 셋, 게터, 연산하는 기능 만들기
		Scanner input = new Scanner(System.in);
		System.out.println("국어 점수");
		k = input.nextInt();
		System.out.println("영어 점수");
		e = input.nextInt();
		System.out.println("수학 점수");
		m = input.nextInt();
		t.setNum(k, e, m);
		t.op();
		System.out.println("국 "+t.getKor()+" 수 "+t.getMath()+" 영 "+t.getEng());
		System.out.println("점수 합 : "+t.getSum());
		System.out.println("점수 평균 : "+t.getAvg());
	}
}
