package chapter17.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEx {

	public static void main(String[] args) {

			ArrayList<Integer> list=new ArrayList<Integer>();
			System.out.println("list.size() : "+list.size());
			
			list.add(100);
			list.add(20);
			
			
			System.out.println("list.size() : "+list.size());
			
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
			System.out.println();
			//List������ �����͸� �ݺ��ڷ� ����
			Iterator<Integer> it=list.iterator();
			//�ݺ��ڸ� �ݺ����� �����Ͽ� ������ ����
			while(it.hasNext()) {
				int v=it.next(); //��ڽ�
				System.out.println(v);
			}

	}

}
