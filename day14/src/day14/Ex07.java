package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 ����ó�� : ���α׷����� �������� ��Ȳ�� ó���ϴ� ��.
 		  -����) ���α׷��� �����Ű�� �ʴ´�
 �������� : throw
 �������� : throws
 ����ó�� : try, catch
 */
public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y, result=0;
		System.out.println("�� �Է�");
		
		try {
			x = input.nextInt();
			y = input.nextInt();
			result = x/y;
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println("0�� �Է��ϸ� �ȵſ�");
			e.printStackTrace(); //���� �̰� ������ �־���� , � ������ �߻��ߴ��� ����� ������
		} 
		System.out.println(result);
	}
}
