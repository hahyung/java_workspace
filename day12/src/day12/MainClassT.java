package day12;

import java.util.Scanner;

public class MainClassT {
	public static void main(String[] args) {
		FuncClassT f = new FuncClassT();
		
		Scanner input = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			
			System.out.println("1. ȸ������");
			System.out.println("2. �α���");
			System.out.println("3. ��й�ȣ ã��");
			System.out.println("4. ��й�ȣ ����");
			System.out.println("5. �� �ۼ�");
			System.out.println("6. �۸�� Ȯ��");
			System.out.println("7. �α׾ƿ�");
			System.out.println(">>>>");
			int num = input.nextInt();
			switch(num) {
			case 1:
				System.out.println("===ȸ������===");
				f.create();
				break;
			case 2:
				f.login();
				break;
			case 3:
				f.searchpw();
				break;
			case 4:
				f.changepw();
				break;
			case 5:
				f.write();
				break;
			case 6:
				f.list();
				break;
			case 7:
				f.logout();break;
				
			}
		}
	}
}
