package day17;

import java.util.ArrayList;
import java.util.Scanner;

class StInfo{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class Ex04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<StInfo> arr = new ArrayList<StInfo>();
		
		String name;
		int age;
		while(true) {
			System.out.println("1.등록 2.출력 3.검색");
			int num = input.nextInt();
			switch(num) {
			case 1:
				StInfo s = new StInfo();
				
				System.out.println("이름");
				name = input.next();
				System.out.println("나이 입력");
				age = input.nextInt();
				
				s.setName(name); s.setAge(age);
				
				arr.add(s);
				
				break;
			case 2:
				for(int i=0;i<arr.size();i++) {
					StInfo ss = arr.get(i);
					System.out.println("이름 : "+ss.getName());
					System.out.println("나이 : "+ss.getAge());
					System.out.println("------------------");
				}
				
				/*
				StInfo ss = arr.get(0);
				System.out.println("이름 : "+ss.getName());
				System.out.println("나이 : "+ss.getAge());
				
				ss = arr.get(1);
				System.out.println("이름 : "+ss.getName());
				System.out.println("나이 : "+ss.getAge());
				*/
				break;
			case 3:
				//이제 객체로 저장되어있기 때문에 contains 로 비교할 수는 없다
				System.out.println("찾을 이름 입력");
				name = input.next();
				int i =0;
				for(; i<arr.size(); i++) {
					StInfo st = arr.get(i);
					if(st.getName().equals(name)) {
						System.out.println(st.getName());
						System.out.println(st.getAge());
						break;
					}
				}
				if(i == arr.size()) {
					System.out.println("찾는 정보가 없다");
				}
				
				/* 위랑 같은 의미
				for(StInfo st : arr) {
					if(st.getName().equals(name)) {
						System.out.println(st.getName());
						System.out.println(st.getAge());
						
					}
				}
				*/
				break;
			}
		}
	}
}
