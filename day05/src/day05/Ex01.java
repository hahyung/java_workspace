package day05;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 반복문
		 -규칙적으로 값이 변한다면 반복문을 사용할 수 있다.
		*/
		int sum =0, i=0;
		// 초기값 ; 조건식 ; 증감식
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
		//사용자로 부터 입력받은 수 까지의 짝수합, 홀수합, 총합을 구하시오.
		
		Scanner input = new Scanner(System.in);
		int num, snum, total=0, oddsum=0, evensum=0;
		
		System.out.print("수 입력 : ");
		snum = input.nextInt();
		
		for(num=0; num <= snum; num+=1 ) {
			if(num%2==0) {
				evensum += num;
			}else {
				oddsum += num;
			}
			total +=num;
		}
		System.out.println("짝수 합 : " +evensum);
		System.out.println("홀수 합 : " +oddsum);
		System.out.println("총합 : " +total);
		System.out.println("======================");
		// 모든 값을 입력하지 않으면 무한으로 반복한다.
		i = 0; //초기값을 밖에 설정할 수 있다.
		for( ; i< 3 ; ) {
			System.out.println("test");
			i++; //증감식을 안에다 사용할 수도 있다
		}
		
		
	}
}
