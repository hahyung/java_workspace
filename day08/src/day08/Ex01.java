package day08;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = new String("abcdefg");   //==String str;
		//String str = "abcdefg";
		/*
		System.out.println("���ڿ� �Է�");
		str = input.next();
		System.out.println(str);
		
		System.out.println(str.toUpperCase()); //�빮�ڷ� ��ȯ toLowerCase�� �ҹ��ڷ� ��ȯ
		*/
		System.out.println(str.charAt(0)); //abcdefg �� 0��° �ִ� �� �ϳ��� �ҷ���
		System.out.println(str.charAt(0)=='a'); //���� �ϳ��� ó���� ���� ''���
		System.out.println(str.charAt(1)=='a');
		
		System.out.println(str.charAt(0)-32);
		System.out.println((char)(str.charAt(0)-32));
		
		str+=" ";
		str+="z";
		System.out.println(str);
			
		str = "	aaaa aaa aaa  ";
		System.out.println(str);
		
		String re = str.trim(); //trim() ���� ����
		System.out.println(re);
		
		String name="ȫ�浿   ";
		System.out.println("name: "+name);
		
		if (name.trim().equals("ȫ�浿")) { //name�� ������ ���� ������ �񱳸� �ϰڴ�
			System.out.println("����~");
		}else {
			System.out.println("�ٸ���!");
		}
		
		String addr;
		addr="047869 /����� ���α� ����3�� /3��";
		String[] ad = addr.split("/"); // /�� �������� �߸�
		System.out.println(ad[0]);
		System.out.println(ad[1]);
		System.out.println(ad[2]);
		
		String replace = addr.replace("/", ",");
		System.out.println(replace);
	}
}
