package frame;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class FrameMovieReview extends JPanel{
	
	public FrameMovieReview() {
		// JPanel �⺻ ����
		setBackground(new Color(0xFFD700));
		setLayout(null);
		setSize(600, 800);
		
		// ��ܺ� �̹���
		ImageIcon popcon = new ImageIcon("popcon2.png");
		JLabel lblPopcon = new JLabel(popcon);
		lblPopcon.setSize(600, 280);
		lblPopcon.setLocation(0, 0);
		add(lblPopcon);
		
		// �ı� ���� ��ȭ ����(������ư)
		JPanel dis2 = new JPanel(); // ���� �г� ����
		dis2.setLayout(new GridLayout(3, 3));
		dis2.setBounds(0, 280, 600, 220);
		
		dis2.setBorder(new TitledBorder(null,//�׵θ�����
				"���� ��ȭ ����",//����
				TitledBorder.LEADING,//��������
				TitledBorder.TOP,// ������ ǥ�õ� ��ġ
				null,//��Ʈ����
				new Color(255,122,144) )); //����
		
		JRadioButton movio1=new JRadioButton("��󷣵�");
		JRadioButton movie2 = new JRadioButton("���Ҽ����º��");
		JRadioButton movie3 = new JRadioButton("�λ��̵�ƿ�");
		JRadioButton movie4 = new JRadioButton("�ܿ�ձ�");
		JRadioButton movie5 = new JRadioButton("��Űű��־��ٷ���");
		JRadioButton movie6 = new JRadioButton("�����̴���");
		JRadioButton movie7 = new JRadioButton("�����");
		JRadioButton movie8 = new JRadioButton("�λ���");
		
		add(dis2);
		
		//���� ���� �ޱ�
		JPanel dis1 = new JPanel(); //���� ��ư ������ ���� �г� ����
		dis1.setBorder(new TitledBorder(null,//�׵θ�����
				"���䳲���",//����
				TitledBorder.LEADING,//��������
				TitledBorder.TOP,// ������ ǥ�õ� ��ġ
				null,//��Ʈ����
				new )); //����
		
		dis1.add(new JLabel("����"));
		JRadioButton point1 = new JRadioButton("1��");
		JRadioButton point2 = new JRadioButton("2��");
		JRadioButton point3 = new JRadioButton("3��");
		JRadioButton point4 = new JRadioButton("4��");
		JRadioButton point5 = new JRadioButton("5��");
		
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
		
		//�ۼ��� �̸�
		TextFiel reviewName=new TextField("�ۼ��� �̸�",40);
		reviewName.setBounds(0,430,50,100);
		dis1.add(reviewName);
		
		// ���� �� �Է¹ޱ�
		TextField review = new TextField("�������� �Է����ּ���.(30 ���� �̸�)", 50);
		review.setBounds(0, 430, 400, 100);
		dis1.add(review);
		
		JButton btn = new JButton("�Ϸ�");
		btn.setBounds(400, 430, 200, 100);
		dis1.add(btn);
		btn.setEnabled(false);
		
		add(dis1);
		dis1.setVisible(false);
		
		//��ȭ ������ư ����
		String nName[]={ "��󷣵�", "���Ҽ����º��", "�λ��̵�ƿ�", 
			"�ܿ�ձ�", "��Űű��־��ٷ���", "�����̴���", 
			"�����", "�λ���" };
		
		ButtonGroup group1=new ButtonGroup();
		JRadioButton movie[]=new JRadioButton
	}
	

}
