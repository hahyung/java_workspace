package day11;

import java.util.Scanner;

public class TestClassT03 {
	public int ranNum, ansNum, highScore, inputNum,i;
	public void random() {
		ranNum = (int)(Math.random()*50)+1;
	}
	public void answer() {
		random();
		Scanner input = new Scanner(System.in);
		System.out.println("컴퓨터 숫자: "+ranNum);
		System.out.println("=== START ===");
		
		for(i=0;ranNum != inputNum;i++) {
			
			if(ranNum != inputNum) {
				System.out.println("Input Number --> ");
				inputNum = input.nextInt();
				
				if(inputNum>ranNum) {
					System.out.println("Down");
				}else if(inputNum<ranNum) {
					System.out.println("Up");
				}
			}
		}System.out.println(i+"회 만에 맞췄습니다!");
		highScore = i;
		
	}
	public int highScore() {
		if(highScore < i) {
			highScore = i;
		}else if(highScore >= i){
			highScore= highScore;
		}
		return highScore;
	}
	public void hsCheck(int hs) {
		if (hs == 0) {
			System.out.println("게임을 시작하지 않았습니다.");
		}else {
			System.out.println("최고점수 : "+hs+"회");
		}
	}
}
