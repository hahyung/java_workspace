package day10;

import java.util.HashSet;

public class TestClassT05 {
	public int[] lotto(){
		int lotto[] = new int[6];
		System.out.println("6���� ���ڴ�??");
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45)+1;
		}
		return lotto;
	}
	public void printLotto(int lotto[]) {
		for(int i=0; i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println("�Դϴ�");
	
	}
}
