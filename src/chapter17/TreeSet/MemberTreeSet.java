package chapter17.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

import chapter17.ArrayList.Member;

public class MemberTreeSet {
	
	private TreeSet<Member>arrayTreeSet;
	

	public MemberTreeSet() {
		arrayTreeSet=new TreeSet<Member>();
	}
	
	public void addMember(Member member) {
		arrayTreeSet.add(member);
	}
	
public boolean removeMember(int memberId) {
	
		Iterator<Member> ir=arrayTreeSet.iterator();
		while(ir.hasNext()) {
			Member member=ir.next();
			int tempId=member.getMemberId();
			if(tempId==memberId) {
				arrayTreeSet.remove(member);
				return true;
			  }//if
		 }//while
		System.out.println(memberId+"가 존재하지 않습니다");
		return false;
	}//removeMember method
	
	public void showAllMember() {
		for(Member member:arrayTreeSet) {
			System.out.println(member);
		}
		System.out.println();
		
	}
	
	

}
