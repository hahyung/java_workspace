package day06;

public class T1 {
	public static void main(String[] args) {
		int su1, su2;
		
		for(su1=2;su1<=9;su1++) {
			for(su2=1;su2<=9;su2++) {
				System.out.println(
						su1+"*"+su2+"="+su1*su2);
			}
		}
	}
}
