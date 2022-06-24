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
			System.out.println("1.사원 등록");
			System.out.println("2.모든 사원 출력");
			System.out.println("3.사원 수정");
			System.out.println("4.사원 검색");
			System.out.println("5.종료");
			num = input.nextInt();
			
			switch(num) {
			case 1: 
				//특정 사원 등록
				CompanyDTO dto = new CompanyDTO();
				System.out.println("사원을 등록합니다.");
				System.out.print("이름 입력 : ");
				name = input.next();
				dto.setName(name);
				System.out.print("직급 입력(인턴, 선임, 책임) : ");
				grade = input.next();
				dto.setGrade(grade);
				impl.saveWorker(dto);
				impl.modify(dto);
				break;
			case 2:
				//모든 사원 출력
				impl.output();
				break;
			case 3:
				//특정 사원 수정
				System.out.println("특정 사원을 수정합니다.");
				break;
			case 4:
				//특정 사원 검색
				System.out.print("검색할 사원이름 입력 : ");
				name = input.next();
				impl.search(name);
				break;
			case 5:
				//종료
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			}
		}
	}
}
