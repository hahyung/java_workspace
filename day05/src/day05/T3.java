package day05;

import java.util.Scanner;

public class T3 {
	public static void main(String[] args) {
		//�� ���� �Է� �޾� �Է¹��� �� ������ ���� ���ϼ���
		//�Է� �� : 1,10 ->55. 10,1
		Scanner input = new Scanner(System.in);
		
		int num1, num2, sum=0;
		System.out.println("�� ���� �Է� ���ּ���: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if(num1<num2) {
			for(int i=num1; i<=num2; i++) {
				sum = sum+ i;
			}
		}else if(num1>=num2) {
			for(int i = num2; i<=num1; i++) {
				sum = sum +i;
			}
		}
		System.out.println("�Է¹��� �� ���� �� : "+sum);
	/* 
	�ٸ� ���1
	    Scanner input = new Scanner(System.in);
   		int num1, num2, sum=0;
   		System.out.println("�� �� �Է�");
   		num1 = input.nextInt();
   		num2 = input.nextInt();
   		int n1 = num1;
   		while(n1 <= num2) {
      		sum+=n1;
      		n1++;
   		}
   		while(num2 <= num1) {
      	sum+=num2;
      	num2++;
   		}
   		System.out.println(sum);

	�ٸ� ���2
	 	int max=0, min=0;
	 	if(num1>num2){
	 		max = num1; min = num2;
	 	}else {
	 		max = num2; min = num1;
	 	}
	 	while(min <=max){
	 		sum+=min;
	 		min++;
	 	}
	 	System.out.println(sum);
	 */
	}
}
