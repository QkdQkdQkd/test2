package chapter17.HashSet;

import java.util.HashSet;
import java.util.Set;

import chapter17.ArrayList.Member;

public class HashSetTest {

	public static void main(String[] args) {
		
		
		Set<Member> set=new HashSet<>();
		
		
		set.add(new Member(30, "ȫ�浿"));
		set.add(new Member(30, "ȫ�浿"));

		
		System.out.println("�� ������ ��: "+ set.size());
		System.out.println("������: "+ set);
	}

}
