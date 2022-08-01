package chapter18.hashMap.TreeMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest03 {

	public static void main(String[] args) {
		
		
		Map<String, Integer> map=new HashMap<>();
		
		//���� ������(����, �й�) ����
		map.put("�̽���", 111);
		map.put("������", 222);
		map.put("�̼�â", 333);
		map.put("�����", 444);
		map.put("������", 555);
		map.put("���α�", 666);
		
		//������ �ο�
		System.out.println("�� Entry �� :" +map.size());
		//������ �й��� ���
		System.out.println("���� : "+map.get("�̼�â"));
		Set<String> keySet=map.keySet();
		Iterator<String> keyiIterator=keySet.iterator();
		
		while(keyiIterator.hasNext()) {
		String key=keyiIterator.next();
		Integer value=map.get(key);
		System.out.println("\t"+key + " : "+value);
		}
		System.out.println();
		//������ �й��� ��� ���

	}

}
