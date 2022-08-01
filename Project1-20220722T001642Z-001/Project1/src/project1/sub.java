package project1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class sub extends JFrame {
	Label lbl;
	public sub() {
		super("메인메뉴");
		setSize(850, 850);
		setLocationRelativeTo(null);
		setLayout(null);
		setVisible(true);
		setResizable(false);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBounds(0, 0, 850, 850);
		getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		mainPanel.setVisible(false);
		

		ImagePanel Main1Panel = new ImagePanel(new ImageIcon("image/menu3.png").getImage());
		Main1Panel.setBounds(0, 0, 850, 850);
		Main1Panel.setBackground(Color.ORANGE);
		setSize(Main1Panel.getWidth(),Main1Panel.getHeight()); // 그림크기에 맞춰 프레임 가로 세로 조정
		getContentPane().add(Main1Panel);

		
		
		JButton bt1 = new JButton("팀별 현황");
		bt1.setBounds(265, 700, 150, 50);
		bt1.setBackground(new Color(225, 225, 225));
		bt1.setFont(new Font("휴먼모음T", Font.PLAIN, 17));
		
		
		JButton bt3 = new JButton("랜덤 박스");
		bt3.setBounds(455, 700, 150, 50);
		bt3.setBackground(new Color(225, 225, 225));
		bt3.setFont(new Font("휴먼모음T", Font.PLAIN, 17));
		
		JButton bt4 = new JButton("개발자");
		bt4.setBounds(645, 700, 150, 50);
		bt4.setBackground(new Color(225, 225, 225));
		bt4.setFont(new Font("휴먼모음T", Font.PLAIN, 17));

		JButton bt5 =new JButton("귤나무");
		bt5.setBounds(30, 55, 150, 50);
		bt5.setBackground(new Color(225,225,225));
		bt5.setFont(new Font("굴림체", Font.BOLD,30));
		
		

		Main1Panel.add(bt1);
		Main1Panel.add(bt3);
		Main1Panel.add(bt4);
		Main1Panel.add(bt5);
		
	

		
		setVisible(true);
		
		addWindowListener(new WindowAdapter(){

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new teamTotal1();

			}
		});
		
		
		bt3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new random();

			}
		});
		
		bt4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new developers();

			}
		});
		
		bt5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new gultree();
				
			}
		});
	}
	
	class ImagePanel extends JPanel{
		private Image img;

		public ImagePanel(Image img) {
			this.img = img;
			setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
			setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
			setLayout(null);
		}
		public int getWidth() {
			
			return img.getWidth(null); //이미지 가로 넓이
		}

		public int getHeight() {

			return img.getHeight(null);
		}

		public void paintComponent(Graphics g) {
			g.drawImage(img, 0, 0, null);
		}
		

	}		
}
