package day05;

import java.util.Scanner;

public class T4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//로그인
		int num;
		String id=null, pw=null, sid=null, spw=null;
		boolean flag = true;
		
		
		while(flag) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.나가기");
			System.out.println(">>> ");
			num = input.nextInt();
			/*
			if(num==3) {
				System.out.println("프로그램을 종료합니다.");break;
			}
			switch(num) {
			case 1: 
				System.out.print("아이디 입력 : ");
				id = input.next();
				System.out.print("비밀번호 입력 : ");
				pw = input.next();
				if(id.equals(sid) && pw.equals(spw)) {
					System.out.println("인증성공 !!!!");
				}else {
				System.out.println("인증실패 !!!");
				}break;
			case 2:
				System.out.print("저장할 아이디 입력 : ");
				sid = input.next();
				System.out.print("저장할 비밀번호 입력 : ");
				spw = input.next();
				System.out.println("가입 완료!!!");
			}
			*/
			if(num==3) {
				System.out.println("프로그램을 종료합니다.");break;
			}else if(num == 2) {
				System.out.print("저장할 아이디 입력 : ");
				sid = input.next();
				System.out.print("저장할 비밀번호 입력 : ");
				spw = input.next();
				System.out.println("가입 완료!!!");
			}else if(num==1) {
					System.out.print("아이디 입력 : ");
					id = input.next();
					System.out.print("비밀번호 입력 : ");
					pw = input.next();
					if(id.equals(sid) && pw.equals(spw)) {
						System.out.println("인증성공 !!!!");
					}else {
					System.out.println("인증실패 !!!");
					}
			}
		}
	}
}
		
		

