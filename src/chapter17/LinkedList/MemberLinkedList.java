package chapter17.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

import chapter17.ArrayList.Member;

public class MemberLinkedList {
	
	private LinkedList<Member> linkedList;
	
	public MemberLinkedList() {
		linkedList=new LinkedList<Member>();
	}

	public void addMember(Member member) {
		linkedList.add(member);
		
	}
	
	public boolean removeMember(int memberId) {
		/*
		for(int i=0;i<linkedList.size();i++) {
			Member member=linkedList.get(i);
			int tempId=member.getMemberId(); //데이터베이스의 데이터
			if(tempId==memberId) {
				linkedList.remove(member);
				return true;
			}
			
		}
		*/
		
		Iterator<Member> ir=linkedList.iterator();
		
		while(ir.hasNext()) {
			Member member=ir.next();
			int tempId=member.getMemberId(); //데이터베이스의 데이터
			if(tempId==memberId) {
				linkedList.remove(member);
				return true;
			}
		}
		
		
		System.out.println(memberId+"아이디가 존재하지 않습니다");
		return false;
	}//remove
	
	public void showAllMember() {
		for(Member member:linkedList) {
			System.out.println(member);
		}
		System.out.println();
	}//showAllMember
	
}//class
