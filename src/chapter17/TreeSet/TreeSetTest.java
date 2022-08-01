package chapter17.TreeSet;

import java.util.TreeSet;



public class TreeSetTest {

	public static void main(String[] args) {
		
		
	TreeSet<String> treeSet=new TreeSet<String>();
		
	treeSet.add("ÀÓÁ¤Èñ");
	treeSet.add("±è¹ÎÁ¤");
	treeSet.add("ÀÌ¼öÁ¤");
		
		System.out.println(treeSet);
		
		for(String m:treeSet) {
			System.out.println(m);
		}
		
	}

}
