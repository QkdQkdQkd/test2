package chapter17.ArrayList_stack_qeue;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEx2 {

	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList<String>();
		
		//ÆÀ¿øÃß°¡
		list.add("±è¿¹Áß");
		list.add("±è¹Î°æ");
		list.add("ÀÌº´ÈÆ");
		list.add("±èÇöÀç");
		list.add("±èÇÏ¿µ");
		list.add("¹Ú¼º¹Î");
		
		//Ãâ·Â
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		System.out.println(list);
		System.out.println("----------Iterator----------");
		//¹İº¹ÀÚ
		Iterator<String> it=list.iterator();
		
		//¹İº¹ÀÚ¸¦ È°¿ëÇÏ¿© while»ç¿ë
		while(it.hasNext()) {
			String v=it.next();
			System.out.println(v);
		}
		
		System.out.println("ÆÀÀå : "+list.get(0));
		System.out.println("ºÎÆÀÀå : " +list.get(3));
		
	}

}
