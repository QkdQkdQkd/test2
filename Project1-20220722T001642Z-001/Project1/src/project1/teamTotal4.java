package project1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import project1.random.Main5_1;

public class teamTotal4 extends JFrame{

	JLabel lb1, lb2, lb3, lb4, lb5, lb1_1, lb2_1, lb3_1, lb4_1, lb5_1, lbtitle, lbsub;
	Font font = new Font("휴먼모음T", Font.PLAIN, 17);
	
	public teamTotal4() {
		setTitle("4조 현황");
		setSize(850, 850);
		setLayout(null);
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

		JButton bt1 = new JButton("1조 점수 현황");
		bt1.setBounds(35, 40, 150, 50);
		bt1.setBackground(new Color(225,225,225));
		bt1.setFont(font);
		
		JButton bt2 = new JButton("2조 점수 현황");
		bt2.setBounds(35, 130, 150, 50);
		bt2.setBackground(new Color(225,225,225));
		bt2.setFont(font);
		
		JButton bt3 = new JButton("3조 점수 현황");
		bt3.setBounds(35, 220, 150, 50);
		bt3.setBackground(new Color(225,225,225));
		bt3.setFont(font);
		
		JButton bt4 = new JButton("4조 점수 현황");
		bt4.setBounds(35, 310, 150, 50);
		bt4.setBackground(new Color(225,225,225));
		bt4.setFont(font);
		
		JButton bt5 = new JButton("메인으로");
		bt5.setBounds(35, 400, 150, 50);
		bt5.setBackground(new Color(225,225,225));
		bt5.setFont(font);
		
		TextArea txtResult = new TextArea("");
		txtResult.setBounds(320,600,360,300);
		txtResult.setText("\t 학생 번호\t학생 이름\t귤 포인트");
		txtResult.setFont(font);
		Main1Panel.add(txtResult);

		Main1Panel.add(bt1);
		Main1Panel.add(bt2);
		Main1Panel.add(bt3);
		Main1Panel.add(bt4);
		Main1Panel.add(bt5);
		
		//타이틀 라벨
		lbtitle = new JLabel("4조 귤 현황");
		lbtitle.setBounds(400, 50, 250, 50);
		lbtitle.setFont(new Font("휴먼모음T", Font.BOLD, 40));
		
		int z=Main5_1.total[15]+Main5_1.total[16]+Main5_1.total[17]+Main5_1.total[18]+Main5_1.total[19];
		lbsub = new JLabel("총점 : " + z);
		lbsub.setBounds(650,50,250,50);
		lbsub.setFont(new Font("휴먼모음T", Font.BOLD, 25));
		
		lb1 = new JLabel("장동훤");
		lb1.setBounds(370, 150, 500, 50);
		lb1.setFont(new Font("휴먼모음T", Font.BOLD, 20)); // 라벨 폰트

		lb1_1 = new JLabel(Main5_1.total[15] + " 회  누적");
		lb1_1.setBounds(570, 150, 500, 50);
		lb1_1.setFont(new Font("휴먼모음T", Font.BOLD, 20)); // 라벨 폰트

		lb2 = new JLabel("심왕원");
		lb2.setBounds(370, 250, 500, 50);
		lb2.setFont(new Font("휴먼모음T", Font.BOLD, 20)); // 라벨 폰트

		lb2_1 = new JLabel(Main5_1.total[16] + " 회  누적");
		lb2_1.setBounds(570, 250, 500, 50);
		lb2_1.setFont(new Font("휴먼모음T", Font.BOLD, 20)); // 라벨 폰트

		lb3 = new JLabel("정현우");
		lb3.setBounds(370, 350, 500, 50);
		lb3.setFont(new Font("휴먼모음T", Font.BOLD, 20)); // 라벨 폰트

		lb3_1 = new JLabel(Main5_1.total[17] + " 회  누적");
		lb3_1.setBounds(570, 350, 500, 50);
		lb3_1.setFont(new Font("휴먼모음T", Font.BOLD, 20)); // 라벨 폰트

		lb4 = new JLabel("남석현");
		lb4.setBounds(370, 450, 500, 50);
		lb4.setFont(new Font("휴먼모음T", Font.BOLD, 20)); // 라벨 폰트

		lb4_1 = new JLabel(Main5_1.total[18] + " 회  누적");
		lb4_1.setBounds(570, 450, 500, 50);
		lb4_1.setFont(new Font("휴먼모음T", Font.BOLD, 20)); // 라벨 폰트

		lb5 = new JLabel("정민아");
		lb5.setBounds(370, 550, 500, 50);
		lb5.setFont(new Font("휴먼모음T", Font.BOLD, 20)); // 라벨 폰트

		lb5_1 = new JLabel(Main5_1.total[19] + " 회  누적");
		lb5_1.setBounds(570, 550, 500, 50);
		lb5_1.setFont(new Font("휴먼모음T", Font.BOLD, 20)); // 라벨 폰트
		
		//타이틀 라벨
		Main1Panel.add(lbtitle);
		Main1Panel.add(lbsub);
		
		// 조원명 표시
		Main1Panel.add(lb1);
		Main1Panel.add(lb2);
		Main1Panel.add(lb3);
		Main1Panel.add(lb4);
		Main1Panel.add(lb5);

		// 포인트 라벨
		Main1Panel.add(lb1_1);
		Main1Panel.add(lb2_1);
		Main1Panel.add(lb3_1);
		Main1Panel.add(lb4_1);
		Main1Panel.add(lb5_1);


		setLocationRelativeTo(null);
		setVisible(true);

		addWindowListener(new WindowAdapter() {

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
		
		bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new teamTotal2();		
				}
		});
		
		bt3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new teamTotal3();
			}
		});
		
		bt4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(true);				
				Connection con = null;
				PreparedStatement select = null;
				ResultSet rs = null;
				
				try {
					con = getConnection();
					String sql = "select StudentNo,StudentName,StudentPoint from team4 ";
					select = con.prepareStatement(sql);
					rs = select.executeQuery();
					while(rs.next()) {
						String str1 = rs.getString(1);
						String str2 = rs.getString(2);
						String str3 = rs.getString(3);
						txtResult.append("\n"+ "\t\t"+ str1 +"\t  " + str2 + "\t  " + str3  + "\n");
					}
					System.out.println("데이터 표시 완료");
				} catch (Exception e1) {
					System.out.println(e1.getMessage() + "업데이트 실패");
				}finally {
					try {if(rs != null)rs.close();} catch (Exception e2) {}
					try {if(select != null)con.close();} catch (Exception e2) {}
					try {if(con != null)select.close();} catch (Exception e2) {}
				}
				
				try {
					con = getConnection();
					String sql = "select team4 from total";
					select = con.prepareStatement(sql);
					rs = select.executeQuery();
					while(rs.next()) {
						String str = rs.getString(1);
						txtResult.append("\n\t\t총   점  : " + str);
					}
					System.out.println("데이터 표시 완료");
				} catch (Exception e1) {
					System.out.println(e1.getMessage() + "불러오기 성공");
				}finally {
					try {if(rs != null)rs.close();} catch (Exception e2) {}
					try {if(select != null)con.close();} catch (Exception e2) {}
					try {if(con != null)select.close();} catch (Exception e2) {}
				}
				
			}
		});
		
		bt5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new sub();
			}
		});
	}
	
	public static Connection getConnection() {
		try {
			String user = "system";
			String pw = "12345";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, pw);
			System.out.println("연결성공");
			return con;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
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
