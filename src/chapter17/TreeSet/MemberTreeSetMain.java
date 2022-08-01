package chapter17.TreeSet;

import chapter17.ArrayList.Member;
import chapter17.ArrayList.MemberArrayList;

public class MemberTreeSetMain {

	public static void main(String[] args) {
		//MemberŬ���� ���� ���� ����
		MemberTreeSet memberTreeSet=new MemberTreeSet();
		
		//���濡 ���� Member ������ ����
		Member memberLee=new Member(1003, "������");
		Member memberSon=new Member(1005, "�չα�");
		Member memberPark=new Member(1004, "�ڼ���");
		Member memberHong=new Member(1002, "ȫ�浿");
		
		//���濡 �ֱ�
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.addMember(memberHong);
		memberTreeSet.addMember(new Member(1001,"�̹���"));
		System.out.println();
		memberTreeSet.showAllMember();

		
		memberTreeSet.showAllMember();
		//���濡�� �����ϱ�
		memberTreeSet.removeMember(memberSon.getMemberId());
	    System.out.println("----------���� ��----------");
	    memberTreeSet.showAllMember();
	}

}
