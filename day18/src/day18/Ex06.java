package day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class AAA implements Serializable{
	String name;
	String addr;
	public String getName() { return name; }
	public void setName(String name) { this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
public class Ex06 {
public static void main(String[] args) throws Exception {
	Scanner input = new Scanner(System.in);
	String name, addr;
	
	System.out.println("1.����");
	System.out.println("2.��������");
	int num = input.nextInt();
	
	String path = "C:/0.�����ڷ�/1.����_�����/";
	
	AAA info = null;
	
	if(num==1) {
		System.out.println("�̸� �Է�");
		name = input.next();
		System.out.println("�ּ� �Է�");
		addr = input.next();
		
		info = new AAA();
		info.setName(name);
		info.setAddr(addr);
		//"C:/0.�����ڷ�/1.����_�����/"
		File path02 = new File(path+name+".txt");
		FileOutputStream fos = 
					new FileOutputStream(path02);
		BufferedOutputStream bos = 
					new BufferedOutputStream(fos);
		ObjectOutputStream oos = 
					new ObjectOutputStream(bos);
		oos.writeObject( info );
		
		oos.close(); bos.close(); fos.close();
		System.out.println("���� �Ǿ����ϴ�");
	}else {
		//"C:/0.�����ڷ�/1.����_�����/"
		File list = new File(path);
		
		String[] li = list.list();
		for(int i=0; i<li.length ; i++) {
			System.out.println( li[i] );
		}
		System.out.println("Ȯ���� �̸� �Է�");
		name = input.next();
		File p = new File(path+name+".txt");
		//p.delete();
		
		FileInputStream fis = new FileInputStream(p);
		BufferedInputStream bis =
						new BufferedInputStream(fis);
		ObjectInputStream ois =
						new ObjectInputStream(bis);
		info = (AAA)ois.readObject();
		System.out.println("�̸� : "+info.getName() );
		System.out.println("�ּ� : "+info.getAddr() );
		
	}
}
}











