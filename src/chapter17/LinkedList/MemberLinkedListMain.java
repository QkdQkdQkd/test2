package chapter17.LinkedList;

import chapter17.ArrayList.Member;

public class MemberLinkedListMain {

	public static void main(String[] args) {
		
		//memberLinkedList�� ��ü���� + LinkedList ���� ����
		MemberLinkedList memberLinkedList=new MemberLinkedList();
		
		Member memberKim=new Member(1000,"��ġ");
		
		memberLinkedList.addMember(memberKim);
		
		memberLinkedList.removeMember(1005);
		
				

	}

}
