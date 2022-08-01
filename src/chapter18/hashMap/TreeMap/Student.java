package chapter18.hashMap.TreeMap;

public class Student {
	
	public int sno;
	public String name;
	
	public Student(int sno , String name) {
		this.sno=sno;
		this.name=name;
		
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student=(Student)obj;
			return (sno==student.sno) && (name.equals(student.name));
		}else {
		return false;
	}

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return sno+name.hashCode();
	}

	@Override
	public String toString() {
		
		return "�й�"+sno+", �̸� "+name+"���� ����";
	}
	
	
	
	
}
