package studentcare;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StudentServiceImpl impl = new StudentServiceImpl();
		int num, age;
		String name, phNum, addr;
		boolean run = true;
		
		while(run) {
			System.out.println("1.�л� ���");
			System.out.println("2.��� �л� ���");
			System.out.println("3.�л� ����");
			System.out.println("4.�л� �˻�");
			System.out.println("5.����");
			num = input.nextInt();
		
			switch(num) {
			case 1: 
				StudentDTO dto = new StudentDTO();
				
				System.out.println("�л��� ����մϴ�");
				System.out.print("�̸� �Է� : ");
				name = input.next();
				dto.setName(name);
				System.out.print("���� �Է� : ");
				age = input.nextInt();
				dto.setAge(age);
				System.out.print("��ȭ��ȣ �Է� : ");
				phNum = input.next();
				dto.setPhNum(phNum);
				impl.saveWorker(dto);
				
				break;
			case 2: 
				impl.output();
				break;
			case 3: 
				//Ư�� �л� ����
				System.out.println("Ư�� �л��� �����մϴ�.");
				System.out.println("������ �л� ��ȭ��ȣ �Է�: ");
				phNum = input.next();
				impl.delete(phNum);
				break;
			case 4: 
				//Ư�� �л� �˻�
				System.out.print("�˻��� �л� �̸� �Է�: ");
				name = input.next();
				impl.search(name);
				break;
			case 5: 
				//����
				System.out.println("���α׷��� �����մϴ�.");
				run = false;
				break;
			}
		}	
	}
}