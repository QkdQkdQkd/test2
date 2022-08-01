package chapter17.ArrayList;

import java.util.Comparator;

public class Member implements Comparable<Member>,Comparator<Member>{
	
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId=memberId;
		this.memberName=memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	
	@Override
	public String toString() {
		
		return memberName+"회원님의 아이디는 "+memberId;
	}
	 
	@Override
	public int hashCode() {
		return memberId;
	}

	//값을 논리적으로 비교
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member=(Member)obj;//다운캐스팅
			if(this.memberId==member.memberId)
				return true;
			else 
				return false;
	      }
		 return false;
	}

	@Override
	public int compareTo(Member member) {
		
		return (this.memberId-member.memberId); //오름차순
		//return (this.memberId-member.memberId)*(-1); 내림차순
	}

	@Override
	public int compare(Member m1, Member m2) {
		// TODO Auto-generated method stub
		return m1.getMemberId()-m2.getMemberId();
		//return m1.getMemberId()-m2.getMemberId()*(-1);
	}


}
