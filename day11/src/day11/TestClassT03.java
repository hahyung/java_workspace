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
		System.out.println("��ǻ�� ����: "+ranNum);
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
		}System.out.println(i+"ȸ ���� ������ϴ�!");
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
			System.out.println("������ �������� �ʾҽ��ϴ�.");
		}else {
			System.out.println("�ְ����� : "+hs+"ȸ");
		}
	}
}
