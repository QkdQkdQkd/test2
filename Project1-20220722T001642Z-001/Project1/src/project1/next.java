package project1;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class next extends JFrame{
	
	private static JLabel label;
	
	public next() {
		
		setTitle("Random");
		JFrame frame = new JFrame(); 
		frame.setBackground(Color.WHITE); 
		frame.setBounds(500, 500, 850, 850);
		frame.setVisible(true);
		setSize(850, 850); 
		
		JPanel panel=new JPanel(); 
		frame.add(panel); 
		
		ImagePanel IP=new ImagePanel(new ImageIcon("image/ORG.jpg").getImage());
		IP.setBounds(0, 0, 850, 850);
		IP.setBackground(Color.WHITE);
		frame.setSize(IP.getWidth(), IP.getHeight());
		getContentPane().add(IP);		
		
		label=new JLabel();
		panel.add(label);
		
		String[] names= {"김예중", "김현재", "박성민", "김하영", "김민경",
				"한송의", "이병훈", "장인욱", "이우철", "최진혁",
				"한희원", "임혁재", "이지예", "이상주", "장다빈",
				"조현지", "정단비", "전선민", "이도일", "이세창",
				"서경신", "최윤이", "이은석", "이승준", "제민규"};
		
		int random = (int)(Math.random()*names.length);
		
		label.setText(names[random]);
		
	}
	
}
