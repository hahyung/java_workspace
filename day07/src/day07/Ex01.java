package day07;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 �÷��� ������ ��ũ
		 �÷���
		 - �ټ��� ������, ������ �׷�
		 - ������ �������� ���� 
		 - �ڹ��� �ڷᱸ��
		 �����ӿ�ũ
		 - �ϳ��� Ʋ
		 - ǥ��ȭ�� ���α׷��� ���
		 List, Set, Map
		 
		 List
		 - ArrayList
		 - LinkedList
		 - Stack
		 
		 ArrayList
		 - ������ �����Ѵ�.
		 - �������� �ߺ��� ����Ѵ�.
		 */
		ArrayList arr = new ArrayList(); //ù ��° ���ڰ� �빮���ΰ��� �츮�� Ŭ������� �Ѵ�. �ڷ����� ������ ����� ������ �ִ�.
		arr.add("123");
		arr.add("456");
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		
		int s = arr.size();
		System.out.println( s );
		
		int[] a= new int[3];
		System.out.println(a.length);
		
		boolean bool = arr.contains("123");
		if(bool == true) {
			System.out.println("123�� �����մϴ�");
		}
		
		System.out.println(arr.contains("123"));
		System.out.println(arr.contains("12311"));
		
		System.out.println(arr.remove("123")); //����
		System.out.println(arr.get(0));
		System.out.println(arr.size());
		
		arr.clear(); //��ü ����
		System.out.println(arr.size());
		
		arr.add("���"); arr.add("�ұ�"); //�߰� add�� �ϸ� ���������� �߰� ��. ���� Ư�� ������ ������ �ٲٰ� �ʹٸ� set�� ����ϸ� ��
		arr.add("����");
		String index = "����";
		int i = arr.indexOf(index);
		System.out.println(i+"��° ������");
		
		System.out.println("���� �� "+arr.get(1));
		arr.set(i, "�ݱ�");
		System.out.println("���� �� "+arr.get(1));
	}
}
