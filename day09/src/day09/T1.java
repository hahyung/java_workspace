package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class T1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();
		int num, num2, v;
		String m , delm;
		

		
		boolean run = true;
		while(run) {
			System.out.println("1.�޴� ���");
			System.out.println("2.�޴��� ���� ����");
			System.out.println("3.����");
			System.out.print(">>>");
			num = input.nextInt();
		switch(num) {
		case 1 :  
			System.out.print("�޴� �̸� : ");
			m = input.next();
			System.out.print("���� : ");
			v = input.nextInt();
			map.put(m, v);
			break;
		
		case 2:  
			while(run) {
				Iterator menu = map.keySet().iterator();
				while(menu.hasNext()) {
					String am = (String)menu.next();
					System.out.println(am+" : "+map.get(am));
				}
				System.out.print("1.����");
				System.out.print("2.����");
				System.out.println("3.������");
				System.out.print(">>>");
				num2 = input.nextInt();
				if(num2==3) {
					
				}
			switch(num2) {
			case 1:
				System.out.print("���� ������ �޴� ����: ");
				m = input.next();
				if(map.get(m)==null) {
					System.out.println("�ش� �޴��� �����ϴ�");
				}else {
				System.out.print("������ ���� : ");
				v = input.nextInt();
				map.put(m, v);
				}
				break;
			case 2:
				System.out.print("����� ���� �޴� : ");
				m = input.next();
				if(map.get(m)==null) {
					System.out.println("�ش� �޴��� �����ϴ�");
				}else {
				map.remove(m);
				}
				break;
			case 3: 
				System.out.println("�������� ���ư���");
			}break;
			}
		break;
		case 3: 
			System.out.println("�����մϴ�.");
		default:
			run = false;
			
		}
		}
		
	}
}
