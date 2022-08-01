package frame;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class FrameMovieReview extends JPanel{
	
	public FrameMovieReview() {
		// JPanel 기본 구조
		setBackground(new Color(0xFFD700));
		setLayout(null);
		setSize(600, 800);
		
		// 상단부 이미지
		ImageIcon popcon = new ImageIcon("popcon2.png");
		JLabel lblPopcon = new JLabel(popcon);
		lblPopcon.setSize(600, 280);
		lblPopcon.setLocation(0, 0);
		add(lblPopcon);
		
		// 후기 남길 영화 선택(라디오버튼)
		JPanel dis2 = new JPanel(); // 평점 패널 생성
		dis2.setLayout(new GridLayout(3, 3));
		dis2.setBounds(0, 280, 600, 220);
		
		dis2.setBorder(new TitledBorder(null,//테두리없음
				"평점 영화 선택",//내용
				TitledBorder.LEADING,//양쪽정렬
				TitledBorder.TOP,// 내용이 표시될 위치
				null,//폰트설정
				new Color(255,122,144) )); //색상
		
		JRadioButton movio1=new JRadioButton("라라랜드");
		JRadioButton movie2 = new JRadioButton("말할수없는비밀");
		JRadioButton movie3 = new JRadioButton("인사이드아웃");
		JRadioButton movie4 = new JRadioButton("겨울왕국");
		JRadioButton movie5 = new JRadioButton("당신거기있어줄래요");
		JRadioButton movie6 = new JRadioButton("스파이더맨");
		JRadioButton movie7 = new JRadioButton("어벤져스");
		JRadioButton movie8 = new JRadioButton("부산행");
		
		add(dis2);
		
		//평점 점수 받기
		JPanel dis1 = new JPanel(); //라디오 버튼 한줄평 받을 패널 생성
		dis1.setBorder(new TitledBorder(null,//테두리없음
				"리뷰남기기",//내용
				TitledBorder.LEADING,//양쪽정렬
				TitledBorder.TOP,// 내용이 표시될 위치
				null,//폰트설정
				new )); //색상
		
		dis1.add(new JLabel("평점"));
		JRadioButton point1 = new JRadioButton("1점");
		JRadioButton point2 = new JRadioButton("2점");
		JRadioButton point3 = new JRadioButton("3점");
		JRadioButton point4 = new JRadioButton("4점");
		JRadioButton point5 = new JRadioButton("5점");
		
		dis1.add(point1);
		dis1.add(point2);
		dis1.add(point3);
		dis1.add(point4);
		dis1.add(point5);
		
		ButtonGroup group2=new ButtonGroup();
		group2.add(point1);
		group2.add(point2);
		group2.add(point3);
		group2.add(point4);
		group2.add(point5);
		
		dis1.setSize(600,120);
		dis1.setLocation(0,500);
		
		//작성자 이름
		TextFiel reviewName=new TextField("작성자 이름",40);
		reviewName.setBounds(0,430,50,100);
		dis1.add(reviewName);
		
		// 한줄 평 입력받기
		TextField review = new TextField("한줄평을 입력해주세요.(30 글자 미만)", 50);
		review.setBounds(0, 430, 400, 100);
		dis1.add(review);
		
		JButton btn = new JButton("완료");
		btn.setBounds(400, 430, 200, 100);
		dis1.add(btn);
		btn.setEnabled(false);
		
		add(dis1);
		dis1.setVisible(false);
		
		//영화 라디오버튼 정보
		String nName[]={ "라라랜드", "말할수없는비밀", "인사이드아웃", 
			"겨울왕국", "당신거기있어줄래요", "스파이더맨", 
			"어벤져스", "부산행" };
		
		ButtonGroup group1=new ButtonGroup();
		JRadioButton movie[]=new JRadioButton
	}
	

}
