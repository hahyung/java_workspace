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
	public void create() { //�α��� ���
		
		System.out.print("�̸� �Է� : ");
		name = input.next();
		
		System.out.print("������� �Է�(ex.980101) : ");
		birth = input.nextInt();
		
		System.out.print("���̵� �Է� : ");
		id = input.next();
		
		System.out.print("��й�ȣ �Է� : ");
		pw = input.next();
		
		System.out.print("email �Է� : ");
		email = input.next();
		
		
		
		
	}
	public void login() {
		System.out.print("���̵� �Է� : ");
		logid = input.next();
		System.out.print("��й�ȣ �Է� : ");
		logpw = input.next();
		
	
		if(logid.equals(id) && logpw.equals(pw)) {
			System.out.println("�α��� ����");
			success = true;
		}else {
			System.out.println("�α��� ����");
		}
	}
	public void searchpw() {
		success = false;
		System.out.print("���̵� �Է� : ");
		String sid = input.next();
		System.out.print("�̸��� �Է� : ");
		String semail = input.next();
		
		if(sid.equals(id) && semail.equals(email)) {
			System.out.println(pw);
		}else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
	}
	public void changepw() {
		System.out.print("���̵� �Է� : ");
		String chid = input.next();
		System.out.print("��й�ȣ �Է� : ");
		String chpw = input.next();
		
		if(chid.equals(id) && chpw.equals(pw)) {
			System.out.println("������ ��й�ȣ : ");
			pw = input.next();
			
			System.out.println("����Ǿ����ϴ�. �ٽ� �α��� ���ּ���");
			success = false;
		}else {
			System.out.println("��ġ���� �ʽ��ϴ�.");
		}
	}
	public void write() {
		if(success == true) {
			wnum = wnum+1;
			arrwnum.add(wnum);
			System.out.println("���� : ");
			head = input.next();
			System.out.println("���� : ");
			content = input.next();
			
			whead.add(head);
			wcontent.add(content);
		
		}else {
			System.out.println("�α��� ���� ���ּ���!");
		}
	}
	public void list() {
		for(int a = 0; a < arrwnum.size(); a++ ) {
			System.out.println("�Խñ� ��ȣ : "+arrwnum.get(a)+" �� ���� : "+whead.get(a)+" ���� : "+wcontent.get(a));
		}
	}
	public void logout() {
		System.out.println("�α׾ƿ��մϴ�");
		success = false;
	}
}
