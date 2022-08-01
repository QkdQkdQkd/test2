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
			//List구조의 데이터를 반복자로 변경
			Iterator<Integer> it=list.iterator();
			//반복자를 반복문에 적용하여 수행이 가능
			while(it.hasNext()) {
				int v=it.next(); //언박싱
				System.out.println(v);
			}

	}

}
