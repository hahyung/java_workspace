package day15;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex03 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("연습"); //생성자에게 값을 넘겨줌
		Container c = frame.getContentPane();
		JLabel label = new JLabel();
		label.setText("test");
		
		Font font = new Font(null, Font.ITALIC, 32); // (글씨체, 글씨스타일(굵기,기울기...),글씨크기)
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER); //글씨 위치(가운데 정렬)
		
		c.add(label);
		
		frame.setLocation(1000, 200);//창 위치
		frame.setPreferredSize(new Dimension(500,200)); //창 크기
		frame.pack();
		
		frame.setVisible(true); //화면 띄움
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x 를 누를시 프로그램 종료
		
		for(int i = 0; ; i++)
			label.setText(i+"다른 내용");
	}
}
