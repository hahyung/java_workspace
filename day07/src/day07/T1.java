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
			System.out.println("1.����ó ���");
			System.out.println("2.����ó ����");
			System.out.println("3.����ó ����");
			System.out.println("4.��� ����ó ����");
			System.out.println("5.����");
			System.out.println(">>>");
			num = input.nextInt();
		switch(num) {
		case 1:
			while(true) {
	            System.out.println("��ȣ �Է�");
	            pnum = input.nextInt();
	            if(arrpnum.indexOf(pnum) == -1) {
	               break;
	            }
	            System.out.println("�����ϴ� ��ȣ�Դϴ�.");
	         }
			System.out.println("�̸� :");
			name = input.next();
			System.out.println("��ȭ��ȣ :");
			pnum = input.nextInt();
			arrname.add(name);
			arrpnum.add(pnum);break;
		
		case 2:
			System.out.println("�̸����� �˻� :");
			name = input.next();
			boolean bool1 = arrname.contains(name);
			int i = arrname.indexOf(name);
			if(bool1 == true) {
					System.out.println(name+"���� ��ȭ��ȣ : "+arrpnum.get(i));
			}else {
				System.out.println("��Ͽ� �����ϴ�.");
			}
			/*pnum = input.nextInt();
			boolean bool2 = arrpnum.contains(pnum);
			int p = arrpnum.indexOf(pnum);
			if(bool2 == true) {
				System.out.println(arrname.get(p)+"���� ��ȭ��ȣ : "+pnum);
			}else {
				System.out.println("��Ͽ� �����ϴ�.");
			}*/break;
		case 3:
			System.out.println("������ �̸� :");
			name = input.next();
			boolean bool3 = arrname.contains(name);
			int d = arrname.indexOf(name);
			if(bool3 == true) {
				System.out.println(name+"���� ��ȭ��ȣ : "+arrpnum.get(d) +"����");
				arrname.remove(name);
				arrpnum.remove(d);
			}else {
				System.out.println("��Ͽ� �����ϴ�.");
			}/*
			pnum = input.nextInt();
			boolean bool4 = arrpnum.contains(pnum);
			int b = arrpnum.indexOf(pnum);
			if(bool4 == true) {
				System.out.println(arrname.get(b)+"���� ��ȭ��ȣ : "+pnum+"����");
				arrname.remove(b);
				arrpnum.remove(pnum);
			}else {
				System.out.println("��Ͽ� �����ϴ�.");
			}*/break;
		case 4:
			for(int a = 0; a < arrname.size(); a++ ) {
				System.out.println(arrname.get(a)+"���� ��ȭ��ȣ : "+arrpnum.get(a));
			}break;
			
		case 5:
			System.exit(1); //���α׷� ��������
		}
		
		}

		
		
	}
}
