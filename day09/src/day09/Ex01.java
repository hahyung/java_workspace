package day09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*
 set
 - ������ �������� �ʴ´�
 - �ߺ��� ���� ������� ����
 */
public class Ex01 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList(); // �ߺ��� ���
		arr.add("ȫ�浿"); arr.add("ȫ�浿");
		System.out.println("arr : "+arr);
		
		HashSet hs = new HashSet(); // �ߺ����� ������� ����
		hs.add("ȫ�浿"); hs.add("�谳��");
		hs.add("ȫ�浿");
		System.out.println(hs.remove("ȫ�浿")); //������ �Ǹ� true���� ����
		System.out.println("hs : "+hs);
		
		hs.add("ȫ�浿");
		System.out.println(arr.get(0));
		//System.out.println(hs.get(0)); ������ ���� ������ get�� ����� �� ����
		
		//it = [bof,'ȫ�浿','ȫ�浿',eof] iterator ����� �� �Ǿտ��� ������ bof �������� eof���� ����
		//      it
		//            it
		//bof �� ���⼭���� �����Ѵ� eof�� ���Ⱑ �������̴� ������ �ǹ�
		Iterator it = arr.iterator();
		while(it.hasNext()==true) {
			System.out.println(it.next());
		}
		/*
		System.out.println(it.hasNext()); //hasNext()�� ���� ��ġ���� �������� �����ϴ��� ���θ� Ȯ���Ѵ�
		System.out.println(it.next()); // next�� ������ ���� ������ġ�� ���� ��ġ�� �̵��ϰ� �� ��ġ�� �ִ� ���� ���´�
		
		System.out.println(it.hasNext()); 
		System.out.println(it.next());
		
		System.out.println(it.hasNext()); 
		*/
		
		it = hs.iterator();
		while(it.hasNext()==true) {
			Object s = it.next();
			String st = (String)s ;
			System.out.println(st);
		}
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		System.out.println(s1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
