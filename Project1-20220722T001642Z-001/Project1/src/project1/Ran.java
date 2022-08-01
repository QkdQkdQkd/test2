package project1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import oracle.jdbc.AdditionalDatabaseMetaData;

public class Ran extends JFrame{
	

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("test");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(850, 850);
		
		JPanel panel=new JPanel();
		frame.add(panel);
		
		JButton button=new JButton();
		panel.add(button);
		
		ImagePanel IP=new ImagePanel(new ImageIcon("image/ORG.jpg").getImage());
		IP.setBounds(0, 0, 850, 850);
		IP.setBackground(Color.WHITE);
		frame.setSize(IP.getWidth(), IP.getHeight());
		IP.setVisible(true);		
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new next();
				
			}
		});
		
	}

}
