package day15;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex03 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("����"); //�����ڿ��� ���� �Ѱ���
		Container c = frame.getContentPane();
		JLabel label = new JLabel();
		label.setText("test");
		
		Font font = new Font(null, Font.ITALIC, 32); // (�۾�ü, �۾���Ÿ��(����,����...),�۾�ũ��)
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER); //�۾� ��ġ(��� ����)
		
		c.add(label);
		
		frame.setLocation(1000, 200);//â ��ġ
		frame.setPreferredSize(new Dimension(500,200)); //â ũ��
		frame.pack();
		
		frame.setVisible(true); //ȭ�� ���
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x �� ������ ���α׷� ����
		
		for(int i = 0; ; i++)
			label.setText(i+"�ٸ� ����");
	}
}
