package day07;

import java.util.ArrayList;
import java.util.Scanner;

public class TA1 {
	public static void main(String[] args) {
		   ArrayList nameArr = new ArrayList();
		   ArrayList numArr = new ArrayList();
		   int num, temp=0;
		   Scanner input = new Scanner(System.in);
		   String name=null, phNum=null;
		   while(true) {
		      System.out.println("1.����ó ���");
		      System.out.println("2.����ó ����");
		      System.out.println("3.����ó ����");
		      System.out.println("4.��� ����ó ����");
		      System.out.println("5.����");
		      System.out.print(">>> : ");
		      num = input.nextInt();
		      switch(num) {
		      case 1: 
		         while(true) {
		            System.out.println("�̸� �Է�");
		            name = input.next();
		            if(nameArr.indexOf(name) == -1) {
		               break;
		            }
		            System.out.println("�����ϴ� �̸�. �ٽ�.");
		         }
		         System.out.println("��ȭ��ȣ �Է�");
		         phNum = input.next();
		         nameArr.add(name);
		         numArr.add(phNum);
		         System.out.println("���� �Ϸ�");
		         break;
		      case 2: 
		         System.out.println("�̸� �Է�");
		         name = input.next();
		         temp = nameArr.indexOf(name);
		         if( temp == -1) {
		            System.out.println("�������� �ʴ� ���� �Դϴ�.");
		         }else {
		            System.out.println("�̸� : "+name);
		            System.out.println("��ȭ��ȣ : "+
		                        numArr.get(temp) );
		         }
		            
		         break;
		      case 3: 
		         System.out.println("�̸� �Է�");
		         name = input.next();
		         temp = nameArr.indexOf(name);
		         if( temp == -1) {
		            System.out.println("�������� �ʴ� ���� �Դϴ�.");
		         }else {
		            //nameArr.remove(temp);
		            nameArr.remove(name);
		            //numArr.remove(temp);
		            numArr.remove( numArr.get(temp) );
		            System.out.println("���� �Ϸ�");
		         }
		         break;
		      case 4: 
		         System.out.println("�̸�\t��ȭ��ȣ");
		         System.out.println("=============");
		         for(int i=0; i < numArr.size(); i++) {
		            System.out.print(nameArr.get(i)+"\t");
		            System.out.println(numArr.get(i));
		            System.out.println("------------------");
		         }
		         break;
		      case 5: break;
		      }
		   }
		}
}
