package day16;
class Parents{
	public void familyName() {
		System.out.print("��");
	}
	public void name() {
		familyName();
		System.out.println(" ����");
	}
}
class Daughter extends Parents{
	public void name() {
		familyName();
		System.out.println(" ����");
	}
}
class Son extends Parents{
	public void name() {
		familyName();
		System.out.println(" �Ɽ");
	}
}
public class Ex05 {
	public static void main(String[] args) {
		Parents p = new Parents(); p.name();
		
		//Daughter d = new Daughter(); d.name();
		//Son s = new Son(); s.name();
		
		
	}
}