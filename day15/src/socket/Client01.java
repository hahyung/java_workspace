package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client01 {
	public static void main(String[] args) throws Exception{
		Socket sock = new Socket("192.168.7.137",12345); //(����� ip�� ��Ʈ�� ��������Ѵ�)
		OutputStream os = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os); //�����͸� ���� �� �ִ� �ڷ������� ��ȯ
		
		Scanner input = new Scanner(System.in);
		/*
		int sendData;
		System.out.println("���� �Է�");
		sendData = input.nextInt();
		os.write(sendData);
		*/
		System.out.println("������ �Է�");
		String sendData = input.next();
		dos.writeUTF(sendData);
		
		System.out.println("�����͸� �����Ͽ����ϴ�.");
		
		InputStream in = sock.getInputStream(); //InputStream �����͸� �޾ƿ��ڴ�, �Է¹ޱ� ���� ��δٶ�� �����ϸ� ��
		DataInputStream dis = new DataInputStream(in);
		
		System.out.println("���� ������ : "+dis.readUTF());
		System.out.println("Ŭ���̾�Ʈ ����");
	}
}
