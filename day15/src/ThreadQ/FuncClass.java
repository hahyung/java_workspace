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
			//�α���
			int num;
			String id=null, pw=null, sid=null, spw=null;
			boolean flag = true;
			
			
			while(flag) {
				System.out.println("1.�α���");
				System.out.println("2.ȸ������");
				System.out.println("3.������");
				System.out.println(">>> ");
				num = input.nextInt();
			
				if(num==3) {
					System.out.println("���α׷��� �����մϴ�.");break;
				}else if(num == 2) {
					System.out.print("������ ���̵� �Է� : ");
					sid = input.next();
					System.out.print("������ ��й�ȣ �Է� : ");
					spw = input.next();
					System.out.println("���� �Ϸ�!!!");
				}else if(num==1) {
						System.out.print("���̵� �Է� : ");
						id = input.next();
						System.out.print("��й�ȣ �Է� : ");
						pw = input.next();
						if(id.equals(sid) && pw.equals(spw)) {
							System.out.println("�������� !!!!");
						}else {
						System.out.println("�������� !!!");
						}
				}
			}
		}
	public Date date;
	public SimpleDateFormat simpl;
	/*
	public void time() {
		
		simpl = new SimpleDateFormat(" a hh�� mm�� ss�� ");
	}
	*/
	public void frame() {
		JFrame frame = new JFrame("�ð�"); //�����ڿ��� ���� �Ѱ���
		Container c = frame.getContentPane();
		JLabel label = new JLabel();
		//label.setText("test");
		
		Font font = new Font(null, Font.ITALIC, 32); // (�۾�ü, �۾���Ÿ��(����,����...),�۾�ũ��)
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER); //�۾� ��ġ(��� ����)
		
		c.add(label);
		
		frame.setLocation(1000, 200);//â ��ġ
		frame.setPreferredSize(new Dimension(500,200)); //â ũ��
		frame.pack();
		
		frame.setVisible(true); //ȭ�� ���
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x �� ������ ���α׷� ����
		
		simpl = new SimpleDateFormat(" a hh�� mm�� ss�� ");
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
