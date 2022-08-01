package project1;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.management.remote.JMXAddressable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JWindow;



public class random extends JFrame {

	JTextField name, age;// 클래스 변수로 선언.
	JLabel lbtitle;
	Font font = new Font("휴먼모음T", Font.PLAIN, 17);
	static int total2;
	


	public random() {
		// new JFrame();생략됨 나자신이니까 쓸수 없음
		
		setTitle("렌덤박스!");
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBounds(500, 500, 850, 850);
		getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		mainPanel.setVisible(false);
		setSize(850, 850);

		JButton btn1 = new JButton("팀별 현황");
		btn1.setBounds(35, 40, 150, 50);
		btn1.setBackground(new Color(225, 225, 225));
		btn1.setFont(font);

		JButton btn3 = new JButton("랜덤박스");
		btn3.setBounds(35, 160, 150, 50);
		btn3.setBackground(new Color(225, 225, 225));
		btn3.setFont(font);

		JButton btn4 = new JButton("개발자");
		btn4.setBounds(35, 280, 150, 50);
		btn4.setBackground(new Color(225, 225, 225));
		btn4.setFont(font);

		JButton btn5 = new JButton("메인");
		btn5.setBounds(35, 400, 150, 50);
		btn5.setBackground(new Color(225, 225, 225));
		btn5.setFont(font);

		Color col = new Color(255, 255, 255);
		lbtitle = new JLabel("RANDOM BOX !");
		lbtitle.setBounds(300, 70, 500, 50);
		lbtitle.setFont(new Font("휴먼모음T", Font.BOLD, 60));
		lbtitle.setForeground(col);

		getContentPane().add(lbtitle);
		getContentPane().add(btn1);
		getContentPane().add(btn3);
		getContentPane().add(btn4);
		getContentPane().add(btn5);

		ImagePanel Main1Panel = new ImagePanel(new ImageIcon("image/random.jpg").getImage());
		Main1Panel.setBounds(0, 0, 1099, 615);
		Main1Panel.setBackground(Color.ORANGE);
		setSize(Main1Panel.getWidth(), Main1Panel.getHeight()); // 그림크기에 맞춰 프레임 가로 세로 조정
		getContentPane().add(Main1Panel);

		Button btrandom = new Button("?");
		btrandom.setFont(new Font("", Font.HANGING_BASELINE, 100));
		btrandom.setBackground(Color.pink);
		btrandom.setBounds(400, 160, 200, 100);
		Main1Panel.add(btrandom);

		Button bt1 = new Button("이태주");
		bt1.setBackground(new Color(178, 235, 244));
		bt1.setFont(new Font("", Font.CENTER_BASELINE, 0));
		bt1.setBounds(260, 310, 70, 30);
		Main1Panel.add(bt1);

		Button bt2 = new Button("김희선");
		bt2.setBackground(new Color(178, 235, 244));
		bt2.setFont(new Font("", Font.CENTER_BASELINE, 0));
		bt2.setBounds(370, 310, 70, 30);
		Main1Panel.add(bt2);

		Button bt3 = new Button("강아름");
		bt3.setBackground(new Color(178, 235, 244));
		bt3.setFont(new Font("", Font.CENTER_BASELINE, 0));
		bt3.setBounds(480, 310, 70, 30);
		Main1Panel.add(bt3);

		Button bt4 = new Button("최만민");
		bt4.setBackground(new Color(178, 235, 244));
		bt4.setFont(new Font("", Font.CENTER_BASELINE, 0));
		bt4.setBounds(590, 310, 70, 30);
		Main1Panel.add(bt4);

		Button bt5 = new Button("육근우");
		bt5.setBackground(new Color(178, 235, 244));
		bt5.setFont(new Font("", Font.CENTER_BASELINE, 0));
		bt5.setBounds(710, 310, 70, 30);
		Main1Panel.add(bt5);
		// ===========================================
		Button bt6 = new Button("이해민");
		bt6.setBackground(new Color(178, 235, 244));
		bt6.setFont(new Font("", Font.CENTER_BASELINE, 0));
		bt6.setBounds(260, 390, 70, 30);
		Main1Panel.add(bt6);

		Button bt7 = new Button("윤근혁");
		bt7.setBackground(new Color(178, 235, 244));
		bt7.setFont(new Font("", Font.CENTER_BASELINE, 0));
		bt7.setBounds(370, 390, 70, 30);
		Main1Panel.add(bt7);

		Button bt8 = new Button("강승재");
		bt8.setBackground(new Color(178, 235, 244));
		bt8.setFont(new Font("", Font.CENTER_BASELINE, 0));
		bt8.setBounds(480, 390, 70, 30);
		Main1Panel.add(bt8);

		Button bt9 = new Button("최창현");
		bt9.setBackground(new Color(178, 235, 244));
		bt9.setFont(new Font("", Font.CENTER_BASELINE, 0));
		bt9.setBounds(590, 390, 70, 30);
		Main1Panel.add(bt9);

		Button bt10 = new Button("박소현");
		bt10.setBackground(new Color(178, 235, 244));
		bt10.setFont(new Font("", Font.CENTER_BASELINE, 0));
		bt10.setBounds(710, 390, 70, 30);
		Main1Panel.add(bt10);
		// =============================================

		Button bt11 = new Button("김유관");
		bt11.setBackground(new Color(178, 235, 244));
		bt11.setFont(new Font("", Font.CENTER_BASELINE, 0));
		bt11.setBounds(260, 460, 70, 30);
		Main1Panel.add(bt11);

		Button bt12 = new Button("한승수");
		bt12.setBackground(new Color(178, 235, 244));
		bt12.setFont(new Font("", Font.CENTER_BASELINE, 0));
		bt12.setBounds(370, 460, 70, 30);
		Main1Panel.add(bt12);

		Button bt13 = new Button("정광용");
		bt13.setBackground(new Color(178, 235, 244));
		bt13.setFont(new Font("", Font.CENTER_BASELINE, 0));
		bt13.setBounds(480, 460, 70, 30);
		Main1Panel.add(bt13);

		Button bt14 = new Button("이수진");
		bt14.setBackground(new Color(178, 235, 244));
		bt14.setFont(new Font("", Font.CENTER_BASELINE, 0));
		bt14.setBounds(590, 460, 70, 30);
		Main1Panel.add(bt14);

		Button bt15 = new Button("도상원");
		bt15.setBackground(new Color(178, 235, 244));
		bt15.setFont(new Font("", Font.CENTER_BASELINE, 0));
		bt15.setBounds(710, 460, 70, 30);
		Main1Panel.add(bt15);
		// ===============================================
		Button bt16 = new Button("장동훤");
		bt16.setBackground(new Color(178, 235, 244));
		bt16.setFont(new Font("", Font.CENTER_BASELINE, 0));
		bt16.setBounds(260, 540, 70, 30);
		Main1Panel.add(bt16);

		Button bt17 = new Button("심왕원");
		bt17.setBackground(new Color(178, 235, 244));
		bt17.setFont(new Font("", Font.CENTER_BASELINE, 0));
		bt17.setBounds(370, 540, 70, 30);
		Main1Panel.add(bt17);

		Button bt18 = new Button("정현우");
		bt18.setBackground(new Color(178, 235, 244));
		bt18.setFont(new Font("", Font.CENTER_BASELINE, 0));
		bt18.setBounds(480, 540, 70, 30);
		Main1Panel.add(bt18);

		Button bt19 = new Button("남석현");
		bt19.setBackground(new Color(178, 235, 244));
		bt19.setFont(new Font("", Font.CENTER_BASELINE, 0));
		bt19.setBounds(590, 540, 70, 30);
		Main1Panel.add(bt19);

		Button bt20 = new Button("정민아");
		bt20.setBackground(new Color(178, 235, 244));
		bt20.setFont(new Font("", Font.CENTER_BASELINE, 0));
		bt20.setBounds(710, 540, 70, 30);
		Main1Panel.add(bt20);
		setLocationRelativeTo(null);
		setVisible(true);
		// 버튼 리스너 연결
		btrandom.addActionListener(new Listener(this));

		bt1.addActionListener(new ActionListener() {
			// 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
			@Override
			public void actionPerformed(ActionEvent e) {
				new Main5_1(0);
				total2 = 0;
			}
		});

		bt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Main5_1(1);
				total2 = 1;
			}
		});

		bt3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Main5_1(2);
				total2 = 2;
			}
		});

		bt4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Main5_1(3);
				total2 = 3;
			}
		});

		bt5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Main5_1(4);
				total2 = 4;
			}
		});

		bt6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Main5_1(5);
				total2 = 5;
			}
		});

		bt7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Main5_1(6);
				total2 = 6;
			}
		});

		bt8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Main5_1(7);
				total2 = 7;
			}
		});

		bt9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Main5_1(8);
				total2 = 8;
			}
		});

		bt10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Main5_1(9);
				total2 = 9;
			}
		});

		bt11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Main5_1(10);
				total2 = 10;
			}
		});

		bt12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Main5_1(11);
				total2 = 11;
			}
		});

		bt13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Main5_1(12);
				total2 = 12;
			}
		});

		bt14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Main5_1(13);
				total2 = 13;
			}
		});

		bt15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Main5_1(14);
				total2 = 14;
			}
		});

		bt16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Main5_1(15);
				total2 = 15;
			}
		});

		bt17.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Main5_1(16);
				total2 = 16;
			}
		});

		bt18.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Main5_1(17);
				total2 = 17;
			}
		});

		bt19.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Main5_1(18);
				total2 = 18;
			}
		});

		bt20.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Main5_1(19);
				total2 = 19;
			}
		});

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		// 각 현황 이동 버튼
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new teamTotal1();

			}
		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(true);

			}
		});

		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new developers();

			}
		});

		btn5.addActionListener(new ActionListener() {

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

	static class Main5_1 extends JFrame {
		static int[] total = new int[20];
		static int total3;//1조 총점
		static int total4;//2조 총점
		static int total5;//3조 총점
		static int total6;//4조 총점

		// 버튼이 눌러지면 만들어지는 새 창을 정의한 클래스
		public Main5_1(int a) {
			// 주의, 여기서 setDefaultCloseOperation() 정의를 하지 말아야 한다
			// 정의하게 되면 새 창을 닫으면 모든 창과 프로그램이 동시에 꺼진다
			JFrame p1 = new JFrame();
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 서브 프레임 종료버튼 생성
			p1.setTitle("귤");
			p1.setBounds(100, 100, 427, 195);
			p1.setLayout(new FlowLayout());
			p1.setLocationRelativeTo(null);
			JButton btn1 = new JButton(new ImageIcon("image/mandarin++.jpg"));
			JButton btn2 = new JButton(new ImageIcon("image/mandarin--.jpg"));
			btn1.setPreferredSize(new Dimension(200, 150));
			btn2.setPreferredSize(new Dimension(200, 150));
			p1.add(btn1);
			p1.add(btn2);
			p1.setVisible(true);

			btn1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int point = Integer.parseInt(JOptionPane.showInputDialog(null, "몇개 줄까요?"));

					Connection con = null;
					PreparedStatement update = null;
					PreparedStatement select= null;
					ResultSet rs = null;
					
					if (random.total2 == 0 || random.total2 == 1 || random.total2 == 2 || random.total2 == 3
							|| random.total2 == 4) {
							
							try {
								con = getConnection();
								String sql = "update team1 set StudentPoint=? where StudentNo=?";
								update = con.prepareStatement(sql);
								
								String sql1 = "select StudentPoint from team1 where StudentNo=?";
								select = con.prepareStatement(sql1);
								select.setString(1,String.valueOf(total2));
								rs = select.executeQuery();
								
								while(rs.next()) {
									String str1 = rs.getString(1);
									total[a]=Integer.parseInt(str1);
								}
								update.setString(1, String.valueOf(total[a]+=point));
								update.setInt(2,random.total2);
								update.executeUpdate();
								
								System.out.println("데이터 업데이트 완료");
								
							}catch (Exception e1) {
								System.out.println(e1.getMessage() + "업데이트 실패");
							}finally {
								try {if(rs != null)rs.close();} catch (Exception e2) {}
								try {if(update != null)con.close();} catch (Exception e2) {}
								try {if(con != null)update.close();} catch (Exception e2) {}
							}
							
							try {
								con = getConnection();
								String sql = "update total set team1= ?";
								update = con.prepareStatement(sql);
								
								String sql1 = "select team1 from total";
								select = con.prepareStatement(sql1);
								rs = select.executeQuery();
								while(rs.next()) {
									String str1 = rs.getString(1);
									total3 = Integer.parseInt(str1);
								}
								update.setString(1, String.valueOf(total3+point));
								update.executeUpdate();
								System.out.println("데이터 업데이트 완료");
							} catch (Exception e1) {
								System.out.println(e1.getMessage() + "업데이트 실패");
							}finally {
								try {if(rs != null)rs.close();} catch (Exception e2) {}
								try {if(update != null)con.close();} catch (Exception e2) {}
								try {if(con != null)update.close();} catch (Exception e2) {}
							}
						}

						else if (random.total2 == 5 || random.total2 == 6 || random.total2 == 7 || random.total2 == 8
								|| random.total2 == 9) {
						
							try {
								con = getConnection();
								String sql = "update team2 set StudentPoint=? where StudentNo=?";
								update = con.prepareStatement(sql);
								
								String sql1 = "select StudentPoint from team2 where StudentNo=?";
								select = con.prepareStatement(sql1);
								select.setString(1,String.valueOf(total2));
								rs = select.executeQuery();
								
								while(rs.next()) {
									String str1 = rs.getString(1);
									total[a]=Integer.parseInt(str1);
								}
								update.setString(1, String.valueOf(total[a]+=point));
								update.setInt(2,random.total2);
								update.executeUpdate();
								System.out.println("데이터 업데이트 완료");
								
							}catch (Exception e1) {
								System.out.println(e1.getMessage() + "업데이트 실패");
							}finally {
								try {if(rs != null)rs.close();} catch (Exception e2) {}
								try {if(update != null)con.close();} catch (Exception e2) {}
								try {if(con != null)update.close();} catch (Exception e2) {}
							}
							
							try {
								con = getConnection();
								String sql = "update total set team2= ?";
								update = con.prepareStatement(sql);
								String sql1 = "select team2 from total";
								select = con.prepareStatement(sql1);
								rs = select.executeQuery();
								while(rs.next()) {
									String str1 = rs.getString(1);
									total4 = Integer.parseInt(str1);
								}
								update.setString(1, String.valueOf(total4+point));
								update.executeUpdate();
								System.out.println("데이터 업데이트 완료");
							} catch (Exception e1) {
								System.out.println(e1.getMessage() + "업데이트 실패");
							}finally {
								try {if(rs != null)rs.close();} catch (Exception e2) {}
								try {if(update != null)con.close();} catch (Exception e2) {}
								try {if(con != null)update.close();} catch (Exception e2) {}
							}
						}

						else if (random.total2 == 10 || random.total2 == 11 || random.total2 == 12 || random.total2 == 13
								|| random.total2 == 14) {
						
							try {
								con = getConnection();
								String sql = "update team3 set StudentPoint=? where StudentNo=?";
								update = con.prepareStatement(sql);
								
								String sql1 = "select StudentPoint from team3 where StudentNo=?";
								select = con.prepareStatement(sql1);
								select.setString(1,String.valueOf(total2));
								rs = select.executeQuery();
								
								while(rs.next()) {
									String str1 = rs.getString(1);
									total[a]=Integer.parseInt(str1);
								}
								update.setString(1, String.valueOf(total[a]+=point));
								update.setInt(2,random.total2);
								update.executeUpdate();
								System.out.println("데이터 업데이트 완료");
								
							}catch (Exception e1) {
								System.out.println(e1.getMessage() + "업데이트 실패");
							}finally {
								try {if(rs != null)rs.close();} catch (Exception e2) {}
								try {if(update != null)con.close();} catch (Exception e2) {}
								try {if(con != null)update.close();} catch (Exception e2) {}
							}
							
							try {
								con = getConnection();
								String sql = "update total set team3= ?";
								update = con.prepareStatement(sql);
								String sql1 = "select team3 from total";
								select = con.prepareStatement(sql1);
								rs = select.executeQuery();
								while(rs.next()) {
									String str1 = rs.getString(1);
									total5 = Integer.parseInt(str1);
								}
								update.setString(1, String.valueOf(total5+point));
								update.executeUpdate();
								System.out.println("데이터 업데이트 완료");
							} catch (Exception e1) {
								System.out.println(e1.getMessage() + "업데이트 실패");
							}finally {
								try {if(rs != null)rs.close();} catch (Exception e2) {}
								try {if(update != null)con.close();} catch (Exception e2) {}
								try {if(con != null)update.close();} catch (Exception e2) {}
							}
						

						} else if (random.total2 == 15 || random.total2 == 16 || random.total2 == 17 || random.total2 == 18
								|| random.total2 == 19) {

							try {
								con = getConnection();
								String sql = "update team4 set StudentPoint=? where StudentNo=?";
								update = con.prepareStatement(sql);
								
								String sql1 = "select StudentPoint from team4 where StudentNo=?";
								select = con.prepareStatement(sql1);
								select.setString(1,String.valueOf(total2));
								rs = select.executeQuery();
								
								while(rs.next()) {
									String str1 = rs.getString(1);
									total[a]=Integer.parseInt(str1);
								}
								update.setString(1, String.valueOf(total[a]+=point));
								update.setInt(2,random.total2);
								update.executeUpdate();
								System.out.println("데이터 업데이트 완료");
								
							}catch (Exception e1) {
								System.out.println(e1.getMessage() + "업데이트 실패");
							}finally {
								try {if(rs != null)rs.close();} catch (Exception e2) {}
								try {if(update != null)con.close();} catch (Exception e2) {}
								try {if(con != null)update.close();} catch (Exception e2) {}
							}
							
							try {
								con = getConnection();
								String sql = "update total set team4= ?";
								update = con.prepareStatement(sql);
								String sql1 = "select team4 from total";
								select = con.prepareStatement(sql1);
								rs = select.executeQuery();
								while(rs.next()) {
									String str1 = rs.getString(1);
									total6 = Integer.parseInt(str1);
								}
								update.setString(1, String.valueOf(total6+point));
								update.executeUpdate();
								System.out.println("데이터 업데이트 완료");
							} catch (Exception e1) {
								System.out.println(e1.getMessage() + "업데이트 실패");
							}finally {
								try {if(rs != null)rs.close();} catch (Exception e2) {}
								try {if(update != null)con.close();} catch (Exception e2) {}
								try {if(con != null)update.close();} catch (Exception e2) {}
							}
						}
					}
			});

			btn2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int mpoint = Integer.parseInt(JOptionPane.showInputDialog(null, "몇개 뺏을까요?"));
					Connection con = null;
					PreparedStatement update = null;
					PreparedStatement select= null;
					ResultSet rs = null;
					
					if (random.total2 == 0 || random.total2 == 1 || random.total2 == 2 || random.total2 == 3
							|| random.total2 == 4) {

						try {
							con = getConnection();
							String sql = "update team1 set StudentPoint=? where StudentNo=?";
							update = con.prepareStatement(sql);
							
							String sql1 = "select StudentPoint from team1 where StudentNo=?";
							select = con.prepareStatement(sql1);
							select.setString(1,String.valueOf(total2));
							rs = select.executeQuery();
							
							while(rs.next()) {
								String str1 = rs.getString(1);
								total[a]=Integer.parseInt(str1);
							}
							update.setString(1, String.valueOf(total[a]-=mpoint));
							update.setInt(2,random.total2);
							update.executeUpdate();
							System.out.println("데이터 업데이트 완료");
							
						}catch (Exception e1) {
							System.out.println(e1.getMessage() + "업데이트 실패");
						}finally {
							try {if(rs != null)rs.close();} catch (Exception e2) {}
							try {if(update != null)con.close();} catch (Exception e2) {}
							try {if(con != null)update.close();} catch (Exception e2) {}
						}
						
						try {
							con = getConnection();
							String sql = "update total set team1= ?";
							update = con.prepareStatement(sql);
							String sql1 = "select team1 from total";
							select = con.prepareStatement(sql1);
							rs = select.executeQuery();
							while(rs.next()) {
								String str1 = rs.getString(1);
								total3 = Integer.parseInt(str1);
							}
							update.setString(1, String.valueOf(total3-mpoint));
							update.executeUpdate();
							System.out.println("데이터 업데이트 완료");
						} catch (Exception e1) {
							System.out.println(e1.getMessage() + "업데이트 실패");
						}finally {
							try {if(rs != null)rs.close();} catch (Exception e2) {}
							try {if(update != null)con.close();} catch (Exception e2) {}
							try {if(con != null)update.close();} catch (Exception e2) {}
						}
					}

					else if (random.total2 == 5 || random.total2 == 6 || random.total2 == 7 || random.total2 == 8
							|| random.total2 == 9) {
						
						try {
							con = getConnection();
							String sql = "update team2 set StudentPoint=? where StudentNo=?";
							update = con.prepareStatement(sql);
							
							String sql1 = "select StudentPoint from team2 where StudentNo=?";
							select = con.prepareStatement(sql1);
							select.setString(1,String.valueOf(total2));
							rs = select.executeQuery();
							
							while(rs.next()) {
								String str1 = rs.getString(1);
								total[a]=Integer.parseInt(str1);
							}
							update.setString(1, String.valueOf(total[a]-=mpoint));
							update.setInt(2,random.total2);
							update.executeUpdate();
							System.out.println("데이터 업데이트 완료");
							
						}catch (Exception e1) {
							System.out.println(e1.getMessage() + "업데이트 실패");
						}finally {
							try {if(rs != null)rs.close();} catch (Exception e2) {}
							try {if(update != null)con.close();} catch (Exception e2) {}
							try {if(con != null)update.close();} catch (Exception e2) {}
						}
						
						try {
							con = getConnection();
							String sql = "update total set team2= ?";
							update = con.prepareStatement(sql);
							String sql1 = "select team2 from total";
							select = con.prepareStatement(sql1);
							rs = select.executeQuery();
							while(rs.next()) {
								String str1 = rs.getString(1);
								total4 = Integer.parseInt(str1);
							}
							update.setString(1, String.valueOf(total4-mpoint));
							update.executeUpdate();
							System.out.println("데이터 업데이트 완료");
						} catch (Exception e1) {
							System.out.println(e1.getMessage() + "업데이트 실패");
						}finally {
							try {if(rs != null)rs.close();} catch (Exception e2) {}
							try {if(update != null)con.close();} catch (Exception e2) {}
							try {if(con != null)update.close();} catch (Exception e2) {}
						}
					}

					else if (random.total2 == 10 || random.total2 == 11 || random.total2 == 12 || random.total2 == 13
							|| random.total2 == 14) {

						try {
							con = getConnection();
							String sql = "update team3 set StudentPoint=? where StudentNo=?";
							update = con.prepareStatement(sql);
							
							String sql1 = "select StudentPoint from team3 where StudentNo=?";
							select = con.prepareStatement(sql1);
							select.setString(1,String.valueOf(total2));
							rs = select.executeQuery();
							
							while(rs.next()) {
								String str1 = rs.getString(1);
								total[a]=Integer.parseInt(str1);
							}
							update.setString(1, String.valueOf(total[a]-=mpoint));
							update.setInt(2,random.total2);
							update.executeUpdate();
							System.out.println("데이터 업데이트 완료");
							
						}catch (Exception e1) {
							System.out.println(e1.getMessage() + "업데이트 실패");
						}finally {
							try {if(rs != null)rs.close();} catch (Exception e2) {}
							try {if(update != null)con.close();} catch (Exception e2) {}
							try {if(con != null)update.close();} catch (Exception e2) {}
						}
						try {
							con = getConnection();
							String sql = "update total set team3= ?";
							update = con.prepareStatement(sql);
							String sql1 = "select team3 from total";
							select = con.prepareStatement(sql1);
							rs = select.executeQuery();
							while(rs.next()) {
								String str1 = rs.getString(1);
								total5 = Integer.parseInt(str1);
							}
							update.setString(1, String.valueOf(total5-mpoint));
							update.executeUpdate();
							System.out.println("데이터 업데이트 완료");
						} catch (Exception e1) {
							System.out.println(e1.getMessage() + "업데이트 실패");
						}finally {
							try {if(rs != null)rs.close();} catch (Exception e2) {}
							try {if(update != null)con.close();} catch (Exception e2) {}
							try {if(con != null)update.close();} catch (Exception e2) {}
						}
					}
					else if (random.total2 == 15 || random.total2 == 16 || random.total2 == 17 || random.total2 == 18
							|| random.total2 == 19) {

						try {
							con = getConnection();
							String sql = "update team4 set StudentPoint=? where StudentNo=?";
							update = con.prepareStatement(sql);
							
							String sql1 = "select StudentPoint from team4 where StudentNo=?";
							select = con.prepareStatement(sql1);
							select.setString(1,String.valueOf(total2));
							rs = select.executeQuery();
							
							while(rs.next()) {
								String str1 = rs.getString(1);
								total[a]=Integer.parseInt(str1);
							}
							update.setString(1, String.valueOf(total[a]-=mpoint));
							update.setInt(2,random.total2);
							update.executeUpdate();
							System.out.println("데이터 업데이트 완료");
							
						}catch (Exception e1) {
							System.out.println(e1.getMessage() + "업데이트 실패");
						}finally {
							try {if(rs != null)rs.close();} catch (Exception e2) {}
							try {if(update != null)con.close();} catch (Exception e2) {}
							try {if(con != null)update.close();} catch (Exception e2) {}
						}
						
						try {
							con = getConnection();
							String sql = "update total set team4= ?";
							update = con.prepareStatement(sql);
							String sql1 = "select team4 from total";
							select = con.prepareStatement(sql1);
							rs = select.executeQuery();
							while(rs.next()) {
								String str1 = rs.getString(1);
								total6 = Integer.parseInt(str1);
							}
							update.setString(1, String.valueOf(total6-mpoint));
							update.executeUpdate();
							System.out.println("데이터 업데이트 완료");
						} catch (Exception e1) {
							System.out.println(e1.getMessage() + "업데이트 실패");
						}finally {
							try {if(rs != null)rs.close();} catch (Exception e2) {}
							try {if(update != null)con.close();} catch (Exception e2) {}
							try {if(con != null)update.close();} catch (Exception e2) {}
						}
					}

				}
			});
		}
	}
	class Listener implements ActionListener {
		JFrame frame;

		public Listener(JFrame f) {
			frame = f;
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			int random;
			random = (int) (Math.random() * 20);
			if (random == 0) {
				JOptionPane.showMessageDialog(frame, "이태주 당첨!");
			} else if (random == 1) {
				JOptionPane.showMessageDialog(frame, "김희선 당첨!");
			} else if (random == 2) {
				JOptionPane.showMessageDialog(frame, "강아름 당첨!");
			} else if (random == 3) {
				JOptionPane.showMessageDialog(frame, "최만민 당첨!");
			} else if (random == 4) {
				JOptionPane.showMessageDialog(frame, "육근우 당첨!");
			} else if (random == 5) {
				JOptionPane.showMessageDialog(frame, "이해민 당첨!");
			} else if (random == 6) {
				JOptionPane.showMessageDialog(frame, "윤근혁 당첨!");
			} else if (random == 7) {
				JOptionPane.showMessageDialog(frame, "강승재 당첨!");
			} else if (random == 8) {
				JOptionPane.showMessageDialog(frame, "최창현 당첨!");
			} else if (random == 9) {
				JOptionPane.showMessageDialog(frame, "박소현 당첨!");
			} else if (random == 10) {
				JOptionPane.showMessageDialog(frame, "이태주 당첨!");
			} else if (random == 11) {
				JOptionPane.showMessageDialog(frame, "한승수 당첨!");
			} else if (random == 12) {
				JOptionPane.showMessageDialog(frame, "정광용 당첨!");
			} else if (random == 13) {
				JOptionPane.showMessageDialog(frame, "이수진 당첨!");
			} else if (random == 14) {
				JOptionPane.showMessageDialog(frame, "도상원 당첨!");
			} else if (random == 15) {
				JOptionPane.showMessageDialog(frame, "장동훤 당첨!");
			} else if (random == 16) {
				JOptionPane.showMessageDialog(frame, "심왕원 당첨!");
			} else if (random == 17) {
				JOptionPane.showMessageDialog(frame, "정현우 당첨!");
			} else if (random == 18) {
				JOptionPane.showMessageDialog(frame, "남석현 당첨!");
			} else if (random == 19) {
				JOptionPane.showMessageDialog(frame, "정민아 당첨!");
			}
		}
	}

	class ImagePanel extends JPanel {
		private Image img;

		public ImagePanel(Image img) {
			this.img = img;
			setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
			setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
			setLayout(null);
		}

		public int getWidth() {

			return img.getWidth(null); // 이미지 가로 넓이
		}

		public int getHeight() {

			return img.getHeight(null);
		}

		public void paintComponent(Graphics g) {
			g.drawImage(img, 0, 0, null);
		}
	}

}