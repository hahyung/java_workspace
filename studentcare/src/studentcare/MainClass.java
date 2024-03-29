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
			System.out.println("1.학생 등록");
			System.out.println("2.모든 학생 출력");
			System.out.println("3.학생 삭제");
			System.out.println("4.학생 검색");
			System.out.println("5.종료");
			num = input.nextInt();
		
			switch(num) {
			case 1: 
				StudentDTO dto = new StudentDTO();
				
				System.out.println("학생을 등록합니다");
				System.out.print("이름 입력 : ");
				name = input.next();
				dto.setName(name);
				System.out.print("나이 입력 : ");
				age = input.nextInt();
				dto.setAge(age);
				System.out.print("전화번호 입력 : ");
				phNum = input.next();
				dto.setPhNum(phNum);
				impl.saveWorker(dto);
				
				break;
			case 2: 
				impl.output();
				break;
			case 3: 
				//특정 학생 삭제
				System.out.println("특정 학생을 삭제합니다.");
				System.out.println("삭제할 학생 전화번호 입력: ");
				phNum = input.next();
				impl.delete(phNum);
				break;
			case 4: 
				//특정 학생 검색
				System.out.print("검색할 학생 이름 입력: ");
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
