package chapter17.HashSet;

import java.util.HashSet;
import java.util.Set;

import chapter17.ArrayList.Member;

public class HashSetTest {

	public static void main(String[] args) {
		
		
		Set<Member> set=new HashSet<>();
		
		
		set.add(new Member(30, "È«±æµ¿"));
		set.add(new Member(30, "È«±æµ¿"));

		
		System.out.println("ÃÑ µ¥ÀÌÅÍ ¼ö: "+ set.size());
		System.out.println("µ¥ÀÌÅÍ: "+ set);
	}

}
