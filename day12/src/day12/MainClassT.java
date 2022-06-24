package day12;

import java.util.Scanner;

public class MainClassT {
	public static void main(String[] args) {
		FuncClassT f = new FuncClassT();
		
		Scanner input = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 비밀번호 찾기");
			System.out.println("4. 비밀번호 변경");
			System.out.println("5. 글 작성");
			System.out.println("6. 글목록 확인");
			System.out.println("7. 로그아웃");
			System.out.println(">>>>");
			int num = input.nextInt();
			switch(num) {
			case 1:
				System.out.println("===회원가입===");
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
