package day06;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] coin = {500, 100, 50, 10};
		int num, money=0;
		boolean flag = true;
		System.out.print("����� ���� �ϼ��� >>> ");
		money = input.nextInt();
		while(flag) {
			System.out.println("==========Ŀ�� ���Ǳ�=========");
			System.out.println("1. Ŀ�� 200\t2. ���ھ� 250\t3. ��ȯ\t4. ����");
			System.out.print("�޴��� �����ϼ��� >>> ");
			num = input.nextInt();
			if(num==1) {
				if(money>=0) {
					System.out.println("���ְԵ弼��^^");
				}else {
					System.out.println("�ܵ��� �����մϴ�");
				}
				money = money - 200;
			}else if (num==2) {
				if(money>=0) {
					System.out.println("���ְԵ弼��^^");
				}else {
					System.out.println("�ܵ��� �����մϴ�");
				}
				money = money - 250;
			}else if(num==3) {
				if(money>0) {
					System.out.println("��ȯ �ݾ� "+money+"�� �Դϴ�");
					for(int i = 0; i < coin.length; i++){
						System.out.println(coin[i] + "�� : " + money/coin[i] + "��");
					    	money = money % coin[i];
					}
				}else {
					System.out.println("��ȯ�� �ݾ��� �����ϴ�.");
				}
			}else if(num==4) {
				System.out.println("�����մϴ�");break;
			}
		}
	}
}
