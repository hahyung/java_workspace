package day15;

import java.util.Scanner;

class A02 extends Thread{
	public void run() {
		for(;;) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("A02 : ");
		}
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String msg;
		A02 a = new A02();
		a.setDaemon(true);
		a.start();
		while(true) {
			System.out.println("�Է�");
			msg = input.next();
			System.out.println("���: "+msg);
			//a.run();
			
		}
	}
}
