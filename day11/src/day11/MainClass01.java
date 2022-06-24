package day11;

public class MainClass01 
{
	public static void main(String[] args) 
	{	
		/*
		int num = 100;
		if(true) {
			
			System.out.println("if : "+num);
			num = 200;
		}
		System.out.println("main : "+num);
		*/
		TestClass01 t01 = new TestClass01();
		
		int n = t01.test01();
		t01.test02(n);
	}
}
