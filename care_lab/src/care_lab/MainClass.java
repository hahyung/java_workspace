package care_lab;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CompanyServiceImpl impl = new CompanyServiceImpl();
		String name, grade;
		int salary, num; 
		double tariff;
		
		boolean run = true;
		
		while(run) {
			System.out.println("1.��� ���");
			System.out.println("2.��� ��� ���");
			System.out.println("3.��� ����");
			System.out.println("4.��� �˻�");
			System.out.println("5.����");
			num = input.nextInt();
			
			switch(num) {
			case 1: 
				//Ư�� ��� ���
				CompanyDTO dto = new CompanyDTO();
				System.out.println("����� ����մϴ�.");
				System.out.print("�̸� �Է� : ");
				name = input.next();
				dto.setName(name);
				System.out.print("���� �Է�(����, ����, å��) : ");
				grade = input.next();
				dto.setGrade(grade);
				impl.saveWorker(dto);
				impl.modify(dto);
				break;
			case 2:
				//��� ��� ���
				impl.output();
				break;
			case 3:
				//Ư�� ��� ����
				System.out.println("Ư�� ����� �����մϴ�.");
				break;
			case 4:
				//Ư�� ��� �˻�
				System.out.print("�˻��� ����̸� �Է� : ");
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
