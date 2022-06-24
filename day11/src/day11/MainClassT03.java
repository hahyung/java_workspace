package day11;

import java.util.Scanner;

/*
 updown 게임을 만드시오
 메인에서 기본 보여지는 화면을 만들고, 기능은 메소드로 구현하시오
 기능 : 랜덤값을 뽑는 기능, 최고기록 체크, 정답기능, 최고 기록 확인 기능
 */
public class MainClassT03 {
	public static void main(String[] args) {
		TestClassT03 t03 = new TestClassT03();
		Scanner input = new Scanner(System.in);
		int num;
		boolean run = true;
		while(run) {
			System.out.println("===UP & Down Game ===");
			System.out.println("1. 게임 시작");
			System.out.println("2. 게임 전적");
			System.out.println("3. 게임 종료");
			num = input.nextInt();
		switch(num) {
		case 1:
			t03.answer(); break;
		case 2:
			int hs = t03.highScore();
			t03.hsCheck(hs);
			break;
		case 3:
			System.out.println("게임 종료");
		default:
			run = false;
		}
		}
	}
}
