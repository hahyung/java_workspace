package day05;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 �ݺ���
		 -��Ģ������ ���� ���Ѵٸ� �ݺ����� ����� �� �ִ�.
		*/
		int sum =0, i=0;
		// �ʱⰪ ; ���ǽ� ; ������
		for( i=1 ; i <= 10 ; i++) {
			System.out.println(i);
			sum = sum +i;
		}
		System.out.println("i : "+i);
		System.out.println("sum : "+sum);
		System.out.println("=================");
		/*
		i++; sum = sum + i; //sum(1) = sum(0) +(1)i;
		i++; sum = sum + i; //sum(3) = sum(1) +(2)i;
		i++; sum = sum + i;
		i++; sum = sum + i;
		i++; sum = sum + i;
		i++; sum = sum + i;
		i++; sum = sum + i;
		i++; sum = sum + i;
		i++; sum = sum + i;
		i++; sum = sum + i;
		System.out.println("sum : "+sum);
		*/
		for (int k =1; k <= 10; k+=2) {
			System.out.println("k : "+k);
		}
		System.out.println("=================");
		
		for (int k=1; k<=10; k++) {
			if(k%2==1) {
				System.out.println("k : "+k);
			}
		}
		//����ڷ� ���� �Է¹��� �� ������ ¦����, Ȧ����, ������ ���Ͻÿ�.
		
		Scanner input = new Scanner(System.in);
		int num, snum, total=0, oddsum=0, evensum=0;
		
		System.out.print("�� �Է� : ");
		snum = input.nextInt();
		
		for(num=0; num <= snum; num+=1 ) {
			if(num%2==0) {
				evensum += num;
			}else {
				oddsum += num;
			}
			total +=num;
		}
		System.out.println("¦�� �� : " +evensum);
		System.out.println("Ȧ�� �� : " +oddsum);
		System.out.println("���� : " +total);
		System.out.println("======================");
		// ��� ���� �Է����� ������ �������� �ݺ��Ѵ�.
		i = 0; //�ʱⰪ�� �ۿ� ������ �� �ִ�.
		for( ; i< 3 ; ) {
			System.out.println("test");
			i++; //�������� �ȿ��� ����� ���� �ִ�
		}
		
		
	}
}
