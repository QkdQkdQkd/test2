package chapter17.TreeSet;

import chapter17.ArrayList.Member;
import chapter17.ArrayList.MemberArrayList;

public class MemberTreeSetMain {

	public static void main(String[] args) {
		//Member클래스 전용 가방 생성
		MemberTreeSet memberTreeSet=new MemberTreeSet();
		
		//가방에 넣을 Member 데이터 생성
		Member memberLee=new Member(1003, "이지원");
		Member memberSon=new Member(1005, "손민국");
		Member memberPark=new Member(1004, "박서연");
		Member memberHong=new Member(1002, "홍길동");
		
		//가방에 넣기
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.addMember(memberHong);
		memberTreeSet.addMember(new Member(1001,"이민정"));
		System.out.println();
		memberTreeSet.showAllMember();

		
		memberTreeSet.showAllMember();
		//가방에서 제거하기
		memberTreeSet.removeMember(memberSon.getMemberId());
	    System.out.println("----------삭제 후----------");
	    memberTreeSet.showAllMember();
	}

}
