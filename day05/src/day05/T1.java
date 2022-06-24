package day05;

public class T1 {
	public static void main(String[] args) {
		
		int num;
		for(num=1; num<=4; num++) {
			System.out.println(num+". hello");
		}
		System.out.println("=====================");
		int sum=0;
		for(int i=1;i<100;i++) {
			sum = sum+ i;
			if(sum==528) {
				System.out.println("합이 528일때 i 값:" +i);
			}
		}
		System.out.println("=====================");
		
		int num3;
		for(num3=1; num3<=25;num3++) {
			if(num3<=5) {
				System.out.print(num3+"\t");
				if(num3==5) {
					System.out.println("");
				}
			}else if(num3<=10) {
				System.out.print(num3+"\t");
				if(num3==10) {
					System.out.println("");
				}
			}else if(num3<=15) {
				System.out.print(num3+"\t");
				if(num3==15) {
					System.out.println("");
				}
			}else if(num3<=20) {
				System.out.print(num3+"\t");
				if(num3==20) {
					System.out.println("");
				}
			}else if(num3<=25){
				System.out.print(num3+"\t");
			}
		}
		/*
		   for(int i=1; i<=25;i++) {
			      System.out.print(i+"\t");
			      if(i%5 == 0) {
			         System.out.println();
			      }
			   }
		*/
			}
	}

