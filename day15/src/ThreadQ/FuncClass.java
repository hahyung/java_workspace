package ThreadQ;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FuncClass {
	public void login() {
			Scanner input = new Scanner(System.in);
			//로그인
			int num;
			String id=null, pw=null, sid=null, spw=null;
			boolean flag = true;
			
			
			while(flag) {
				System.out.println("1.로그인");
				System.out.println("2.회원가입");
				System.out.println("3.나가기");
				System.out.println(">>> ");
				num = input.nextInt();
			
				if(num==3) {
					System.out.println("프로그램을 종료합니다.");break;
				}else if(num == 2) {
					System.out.print("저장할 아이디 입력 : ");
					sid = input.next();
					System.out.print("저장할 비밀번호 입력 : ");
					spw = input.next();
					System.out.println("가입 완료!!!");
				}else if(num==1) {
						System.out.print("아이디 입력 : ");
						id = input.next();
						System.out.print("비밀번호 입력 : ");
						pw = input.next();
						if(id.equals(sid) && pw.equals(spw)) {
							System.out.println("인증성공 !!!!");
						}else {
						System.out.println("인증실패 !!!");
						}
				}
			}
		}
	public Date date;
	public SimpleDateFormat simpl;
	/*
	public void time() {
		
		simpl = new SimpleDateFormat(" a hh시 mm분 ss초 ");
	}
	*/
	public void frame() {
		JFrame frame = new JFrame("시간"); //생성자에게 값을 넘겨줌
		Container c = frame.getContentPane();
		JLabel label = new JLabel();
		//label.setText("test");
		
		Font font = new Font(null, Font.ITALIC, 32); // (글씨체, 글씨스타일(굵기,기울기...),글씨크기)
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER); //글씨 위치(가운데 정렬)
		
		c.add(label);
		
		frame.setLocation(1000, 200);//창 위치
		frame.setPreferredSize(new Dimension(500,200)); //창 크기
		frame.pack();
		
		frame.setVisible(true); //화면 띄움
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x 를 누를시 프로그램 종료
		
		simpl = new SimpleDateFormat(" a hh시 mm분 ss초 ");
		String result = null;
		for(int i =0 ; i<10; i++) {
			date = new Date();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			result = simpl.format(date);
			label.setText(result);
		}
	}
	
}
