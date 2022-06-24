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
		Socket sock = new Socket("192.168.7.137",12345); //(통신할 ip와 포트를 적어줘야한다)
		OutputStream os = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os); //데이터를 보낼 수 있는 자료형으로 변환
		
		Scanner input = new Scanner(System.in);
		/*
		int sendData;
		System.out.println("숫자 입력");
		sendData = input.nextInt();
		os.write(sendData);
		*/
		System.out.println("데이터 입력");
		String sendData = input.next();
		dos.writeUTF(sendData);
		
		System.out.println("데이터를 전송하였습니다.");
		
		InputStream in = sock.getInputStream(); //InputStream 데이터를 받아오겠다, 입력받기 위한 통로다라고 생각하면 됨
		DataInputStream dis = new DataInputStream(in);
		
		System.out.println("수신 데이터 : "+dis.readUTF());
		System.out.println("클라이언트 종료");
	}
}
