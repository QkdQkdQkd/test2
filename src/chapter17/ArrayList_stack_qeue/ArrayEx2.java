package chapter17.ArrayList_stack_qeue;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEx2 {

	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList<String>();
		
		//�����߰�
		list.add("�迹��");
		list.add("��ΰ�");
		list.add("�̺���");
		list.add("������");
		list.add("���Ͽ�");
		list.add("�ڼ���");
		
		//���
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		System.out.println(list);
		System.out.println("----------Iterator----------");
		//�ݺ���
		Iterator<String> it=list.iterator();
		
		//�ݺ��ڸ� Ȱ���Ͽ� while���
		while(it.hasNext()) {
			String v=it.next();
			System.out.println(v);
		}
		
		System.out.println("���� : "+list.get(0));
		System.out.println("������ : " +list.get(3));
		
	}

}
