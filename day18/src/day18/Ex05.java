package day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex05 {
public static void main(String[] args) throws Exception {
	File path = 
			new File("C:/0.�����ڷ�/1.����_�����/aaa.txt");
	FileOutputStream fos = new FileOutputStream(path);
	BufferedOutputStream bos = 
						new BufferedOutputStream(fos);
	DataOutputStream dos = 
						new DataOutputStream(bos);
	String s = "�ȳ��ϼ���";
	dos.writeUTF(s);
	
	dos.close();
	bos.close();
	fos.close();
	
	FileInputStream fis = new FileInputStream(path);
	BufferedInputStream bis = 
						new BufferedInputStream(fis);
	DataInputStream dis = new DataInputStream(bis);
	String str = dis.readUTF();
	System.out.println("������ ���� : "+str);
	
	dis.close();
	bis.close();
	fis.close();
}
}














