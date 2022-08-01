package chapter17.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList=new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		/*
		//���1
		for(int i=0;i<arrayList.size();i++) {
			Member member=arrayList.get(i);
			int tempId=member.getMemberId();
			if(tempId==memberId) {
				arrayList.remove(member);
				return true;
			  }//if
			}//for
		System.out.println(memberId+"�� �������� �ʽ��ϴ�");
		return false;
		*/
		
		//���2
		Iterator<Member> ir=arrayList.iterator();
		while(ir.hasNext()) {
			Member member=ir.next();
			int tempId=member.getMemberId();
			if(tempId==memberId) {
				arrayList.remove(member);
				return true;
			  }//if
		 }//while
		System.out.println(memberId+"�� �������� �ʽ��ϴ�");
		return false;
	}//removeMember method
	
	public void showAllMember() {
		for(Member member:arrayList) {
			System.out.println(member);
		}
		System.out.println();
		
	}
}

	
	
	