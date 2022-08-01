package chapter18.hashMap.TreeMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest01 {

	public static void main(String[] args) {
		
		
		//Map �÷���
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		//��ü ����
		map.put("�迹��", 185);
		map.put("�̻���", 182);
		map.put("���ο�", 190);
		map.put("�̼�â", 192);
		map.put("�̻���", 188);
		System.out.println("�� Entry �� :" + map.size());
		
		//��ü�� �ϳ��� ó��(���1) : key�� �ߺ��Ǹ� �������� ����� ������ ��ü��
		System.out.println("\t�̻��� : "+ map.get("�̻���"));
		System.out.println();
		
		//key�� ���� (�� �ߺ����� �ʰ� ����)
		Set<String> keySet=map.keySet();
		Iterator<String> keyIterator=keySet.iterator();//�ݺ��� ������ ��ȯ
		
		while(keyIterator.hasNext()) {
			String key=keyIterator.next();
			Integer value=map.get(key);
			System.out.println("\t"+key + " : "+value);
		}
		System.out.println();
		
		map.remove("�̻���");
		System.out.println("�� Entry �� : "+map.size());
		
		//��ü�� �ϴϾ� ó�� (���2)
		Set<Map.Entry<String, Integer>> entrySet=map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator=entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry=entryIterator.next();
			String key=entry.getKey();
			Integer value=entry.getValue();
			System.out.println("\t" + key + " : "+value);
		}
		
		System.out.println();
		//��ü ����
		map.clear(); //��� map.Entry
		System.out.println("�� Entry �� : "+map.size());
		
		

	}

}
