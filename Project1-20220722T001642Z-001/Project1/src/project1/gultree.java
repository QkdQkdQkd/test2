package project1;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class gultree extends JFrame {

	JLabel lbtitle;
	Font font =new Font("굴림체", Font.BOLD,30);
	
	public gultree() {
		setTitle("귤나무");
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 850, 850);//위치조정하기
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(850, 850);
		frame.setVisible(true);
		
		ImagePn Mainmenu = new ImagePn(new ImageIcon("image/gultree.jpg").getImage());
		frame.getContentPane().add(Mainmenu, BorderLayout.CENTER);
		Mainmenu.setLayout(null);
	
		
		//sort, for 진행
		
	
		
				
	}
}
