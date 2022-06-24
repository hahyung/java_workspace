package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		DBClass db = new DBClass();
		Scanner input = new Scanner(System.in);
		Info info = new Info();
		String id, name;
		int age, num, result=0;
		while(true) {
			System.out.println("1.���");
			System.out.println("2.��ȸ");
			System.out.println("3.��� ���");
			System.out.println("4.����");
			num = input.nextInt();
			switch(num) {
			case 1: 
				System.out.println("ID �Է�");
				id = input.next();
				System.out.println("�̸� �Է�");
				name = input.next();
				System.out.println("���� �Է�");
				age = input.nextInt();
				
				info.setId(id);
				info.setName(name);
				info.setAge(age);
				
				result = db.insert(info);
				if(result ==1) {
					System.out.println("���� ����");
				}else {
					System.out.println("���� ����!!");
				}
				break;
			case 2:
				System.out.println("�˻� ���̵� �Է�");
				id = input.next();
				info = db.selectOne(id);
				if(info==null) {
					System.out.println("�ش� ���̵�� ����!!");
				}else {
					System.out.println("id : "+info.getId());
					System.out.println("�̸� : "+info.getName());
					System.out.println("���� : "+info.getAge());
				}
				
				break;
			case 3: 
				ArrayList<Info> list = db.select();
				if(list.size()==0) {
					System.out.println("���� ���� ����");
				}else {
					/*
					for(int i=0; i<list.size();i++) {
						info = list.get(i);
						//list.get(i).getId()
						System.out.println("id : "+info.getId());
						System.out.println("name : "+info.getName());
						System.out.println("age : "+info.getAge());
						System.out.println("------------------");
					}*/
					for(Info in : list) {
						System.out.println("id : "+in.getId());
						System.out.println("name : "+in.getName());
						System.out.println("age : "+in.getAge());
						System.out.println("------------------");
					}
				}
				break;
			case 4: break;
			}
		}
	}
}
