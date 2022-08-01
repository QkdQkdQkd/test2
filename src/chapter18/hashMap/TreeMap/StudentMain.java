package chapter18.hashMap.TreeMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentMain {

	public static void main(String[] args) {
		
		Map<Student, Integer> map=new HashMap<>();
		
		map.put(new Student(1,"ȫ�浿"), 95);
		map.put(new Student(2,"������"), 85);

		
		System.out.println("�� Entry �� : " + map.size());
		
		Set<Student> keySet=map.keySet();
		Iterator<Student> keyIterator=keySet.iterator();//�ݺ��� ������ ��ȯ
		
		while(keyIterator.hasNext()) {
			Student key=keyIterator.next();
			Integer value=map.get(key);
			System.out.println("\t"+key + " : "+value);
		}
		System.out.println();
		
	}

}
