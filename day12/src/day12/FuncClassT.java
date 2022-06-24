package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FuncClassT {
	private String id, name, logid,  email, logpw, pw, head, content;
	private int wnum, mnum,  birth;
	private boolean success=false;
	ArrayList arrwnum = new ArrayList();
	ArrayList whead = new ArrayList();
	ArrayList wcontent = new ArrayList();
	

	//HashMap map = new HashMap();
	Scanner input = new Scanner(System.in);
	public void create() { //로그인 기능
		
		System.out.print("이름 입력 : ");
		name = input.next();
		
		System.out.print("생년월일 입력(ex.980101) : ");
		birth = input.nextInt();
		
		System.out.print("아이디 입력 : ");
		id = input.next();
		
		System.out.print("비밀번호 입력 : ");
		pw = input.next();
		
		System.out.print("email 입력 : ");
		email = input.next();
		
		
		
		
	}
	public void login() {
		System.out.print("아이디 입력 : ");
		logid = input.next();
		System.out.print("비밀번호 입력 : ");
		logpw = input.next();
		
	
		if(logid.equals(id) && logpw.equals(pw)) {
			System.out.println("로그인 성공");
			success = true;
		}else {
			System.out.println("로그인 실패");
		}
	}
	public void searchpw() {
		success = false;
		System.out.print("아이디 입력 : ");
		String sid = input.next();
		System.out.print("이메일 입력 : ");
		String semail = input.next();
		
		if(sid.equals(id) && semail.equals(email)) {
			System.out.println(pw);
		}else {
			System.out.println("일지하지 않습니다.");
		}
	}
	public void changepw() {
		System.out.print("아이디 입력 : ");
		String chid = input.next();
		System.out.print("비밀번호 입력 : ");
		String chpw = input.next();
		
		if(chid.equals(id) && chpw.equals(pw)) {
			System.out.println("변경할 비밀번호 : ");
			pw = input.next();
			
			System.out.println("변경되었습니다. 다시 로그인 해주세요");
			success = false;
		}else {
			System.out.println("일치하지 않습니다.");
		}
	}
	public void write() {
		if(success == true) {
			wnum = wnum+1;
			arrwnum.add(wnum);
			System.out.println("제목 : ");
			head = input.next();
			System.out.println("내용 : ");
			content = input.next();
			
			whead.add(head);
			wcontent.add(content);
		
		}else {
			System.out.println("로그인 먼저 해주세요!");
		}
	}
	public void list() {
		for(int a = 0; a < arrwnum.size(); a++ ) {
			System.out.println("게시글 번호 : "+arrwnum.get(a)+" 글 제목 : "+whead.get(a)+" 내용 : "+wcontent.get(a));
		}
	}
	public void logout() {
		System.out.println("로그아웃합니다");
		success = false;
	}
}
