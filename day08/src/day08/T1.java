package day08;

public class T1 {
	public static void main(String[] args) {
		String str1 = new String("Have a nice day Have a nice day Have a nice day");
		int i = 0;
		System.out.print("��� : [");
		for(i=0;i<=46;i++) {
		if (str1.charAt(i)=='a') {
			System.out.print(i+",");
		}
		}
		System.out.println("]");
		/////////////////////////////////////
		String str2 = new String("It is a fun java programming");
		int a=0,g=0;
		for(i=0;i<28;i++) {
			if (str2.charAt(i)=='a') {
				a+=1;
			}else if (str2.charAt(i)=='g') {
				g+=1;
			}
		}
		System.out.println("�� ���� : "+i);
		System.out.println("a ���� : "+a);
		System.out.println("g ���� : "+g);
		/////////////////////////////////////////
		
		String str = new String("tESt  sTring  change   first");
		String changeStr = new String();
		int f=0;

		str = str.toLowerCase();
		if(str.charAt(0) >='a' && str.charAt(0) <='z') {
			changeStr+=(char)(str.charAt(f)-32);
			f++;
		}
		while(f<str.length()) {
			if(str.charAt(f) != ' ') {
				changeStr+=str.charAt(f);
				f++;
				continue;
			}
			while(str.charAt(f) == ' ') {
				changeStr+=str.charAt(f);
				f++;
			}
			if(str.charAt(f) >= 'a' && str.charAt(f) <='z')
				changeStr+=(char)(str.charAt(f)-32);
			f++;
		}
		System.out.println("���� �� :"+str);
		System.out.println("���� �� :"+changeStr);
		System.out.println("����");
		

		////////////////////////////////////////////////
		String str3;
		str3="�谳�� -2017��\nȫ�浿���� -2015��\n���켱�� -2018��";;
		String[] ad = str3.split("\n");
		System.out.println("===���� �� str===");
		System.out.println(ad[0]);
		System.out.println(ad[1]);
		System.out.println(ad[2]);
		
		System.out.println("===���� �� str===");
		String replace = str3.replace("-2017", ":1999") .replace("-2015", ":1999") .replace("-2018", ":1999");
		System.out.println(replace);
	}
}
