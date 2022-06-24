package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server01 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(12345); //(port번호) 포트번호는 2바이트 내의 값중 아무거나 설정 해도 됨
		System.out.println("접속을 기다립니다");
		Socket sock = server.accept();
		//System.out.println("접속 되었습니다");
		InputStream in = sock.getInputStream(); //InputStream 데이터를 받아오겠다, 입력받기 위한 통로다라고 생각하면 됨
		DataInputStream dis = new DataInputStream(in); //데이터를 보낼 수 있는 자료형으로 변환
		
		System.out.println("수신 대기...");
		String readData = dis.readUTF();
		System.out.println("수신 데이터 : "+readData);
		
		OutputStream os = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os); //데이터를 보낼 수 있는 자료형으로 변환
		
		Scanner input = new Scanner(System.in);
		
		String str;
		System.out.println("서버에서 입력");
		str = input.next();
		dos.writeUTF(str);
		System.out.println("서버 종료");
		
		//int readData = in.read();
		//System.out.println("수신 데이터 : "+readData);
		
	}
}
