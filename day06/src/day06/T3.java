package day06;

public class T3 {
	public static void main(String[] args) {
		   int su=1,num=1;
		   for(int i=1;i<=5;i++){
		      num = i*5;
		      for(int j=su;j<=num;j++){
		         System.out.print(j+"\t"); 
		      }
		      System.out.println();
		      su=num+1;
		   }
		   System.out.println("2번째");
		   for(int i=0;i<5;i++) {
		      for(int j=1;j<6;j++) {
		         System.out.print(j+(5*i)+"\t");
		      }
		      System.out.println();
		   }
		   System.out.println("3번째");
		   for(int i=1;i<22;i+=5) {
		      System.out.print(i+" ");
		      for(int j=1;j<5;j++) {
		         System.out.print(j+i+" ");
		      }
		      System.out.println();
		   }
	}
}

