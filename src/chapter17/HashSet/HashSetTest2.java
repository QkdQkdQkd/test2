package chapter17.HashSet;

import java.util.HashSet;

public class HashSetTest2 {

	public static void main(String[] args) {
		
		
		HashSet<String> hashSet=new HashSet<String>();
		
		hashSet.add(new String("������"));
		hashSet.add("�ڼ�");
		hashSet.add(new String("�����"));

		System.out.println(hashSet);
		boolean yn=hashSet.add(new String("�����"));
		System.out.println(yn);
		System.out.println(hashSet);
	}

}
