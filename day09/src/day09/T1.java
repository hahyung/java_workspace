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
			System.out.println("1.메뉴 등록");
			System.out.println("2.메뉴별 가격 보기");
			System.out.println("3.종료");
			System.out.print(">>>");
			num = input.nextInt();
		switch(num) {
		case 1 :  
			System.out.print("메뉴 이름 : ");
			m = input.next();
			System.out.print("가격 : ");
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
				System.out.print("1.수정");
				System.out.print("2.삭제");
				System.out.println("3.나가기");
				System.out.print(">>>");
				num2 = input.nextInt();
				if(num2==3) {
					
				}
			switch(num2) {
			case 1:
				System.out.print("가격 수정할 메뉴 선택: ");
				m = input.next();
				if(map.get(m)==null) {
					System.out.println("해당 메뉴가 없습니다");
				}else {
				System.out.print("수정할 가격 : ");
				v = input.nextInt();
				map.put(m, v);
				}
				break;
			case 2:
				System.out.print("지우고 싶은 메뉴 : ");
				m = input.next();
				if(map.get(m)==null) {
					System.out.println("해당 메뉴가 없습니다");
				}else {
				map.remove(m);
				}
				break;
			case 3: 
				System.out.println("이전으로 돌아가기");
			}break;
			}
		break;
		case 3: 
			System.out.println("종료합니다.");
		default:
			run = false;
			
		}
		}
		
	}
}
