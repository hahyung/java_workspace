package day07;

import java.util.ArrayList;
import java.util.Scanner;

public class T1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList arrname = new ArrayList();
		ArrayList arrpnum = new ArrayList();
		
		String name;
		int pnum, num;
		
		while(true) {
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			System.out.println(">>>");
			num = input.nextInt();
		switch(num) {
		case 1:
			while(true) {
	            System.out.println("번호 입력");
	            pnum = input.nextInt();
	            if(arrpnum.indexOf(pnum) == -1) {
	               break;
	            }
	            System.out.println("존재하는 번호입니다.");
	         }
			System.out.println("이름 :");
			name = input.next();
			System.out.println("전화번호 :");
			pnum = input.nextInt();
			arrname.add(name);
			arrpnum.add(pnum);break;
		
		case 2:
			System.out.println("이름으로 검색 :");
			name = input.next();
			boolean bool1 = arrname.contains(name);
			int i = arrname.indexOf(name);
			if(bool1 == true) {
					System.out.println(name+"님의 전화번호 : "+arrpnum.get(i));
			}else {
				System.out.println("목록에 없습니다.");
			}
			/*pnum = input.nextInt();
			boolean bool2 = arrpnum.contains(pnum);
			int p = arrpnum.indexOf(pnum);
			if(bool2 == true) {
				System.out.println(arrname.get(p)+"님의 전화번호 : "+pnum);
			}else {
				System.out.println("목록에 없습니다.");
			}*/break;
		case 3:
			System.out.println("삭제할 이름 :");
			name = input.next();
			boolean bool3 = arrname.contains(name);
			int d = arrname.indexOf(name);
			if(bool3 == true) {
				System.out.println(name+"님의 전화번호 : "+arrpnum.get(d) +"삭제");
				arrname.remove(name);
				arrpnum.remove(d);
			}else {
				System.out.println("목록에 없습니다.");
			}/*
			pnum = input.nextInt();
			boolean bool4 = arrpnum.contains(pnum);
			int b = arrpnum.indexOf(pnum);
			if(bool4 == true) {
				System.out.println(arrname.get(b)+"님의 전화번호 : "+pnum+"삭제");
				arrname.remove(b);
				arrpnum.remove(pnum);
			}else {
				System.out.println("목록에 없습니다.");
			}*/break;
		case 4:
			for(int a = 0; a < arrname.size(); a++ ) {
				System.out.println(arrname.get(a)+"님의 전화번호 : "+arrpnum.get(a));
			}break;
			
		case 5:
			System.exit(1); //프로그램 강제종료
		}
		
		}

		
		
	}
}
