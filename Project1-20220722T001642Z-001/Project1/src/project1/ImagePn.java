package project1;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class ImagePn extends JPanel{
	private Image img;

	public ImagePn (Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));  //�⺻ ������
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null))); // �� ���� ������? �Ѵ� �ؾ��� ����� ����ȴ��
		setLayout(null); // �ʿ��� ���۳�Ʈ�� ���밪���� ���� �� �ְ� ����
		
}
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
		
	}
}