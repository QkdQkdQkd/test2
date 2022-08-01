package chapter18.hashMap.TreeMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest01 {

	public static void main(String[] args) {
		
		
		//Map 컬렉션
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		//객체 저장
		map.put("김예중", 185);
		map.put("이상주", 182);
		map.put("장인우", 190);
		map.put("이세창", 192);
		map.put("이상주", 188);
		System.out.println("총 Entry 수 :" + map.size());
		
		//객체를 하나씩 처리(방법1) : key가 중복되면 마지막에 저장된 값으로 대체됨
		System.out.println("\t이상주 : "+ map.get("이상주"));
		System.out.println();
		
		//key를 저장 (단 중복되지 않게 저장)
		Set<String> keySet=map.keySet();
		Iterator<String> keyIterator=keySet.iterator();//반복자 구조로 변환
		
		while(keyIterator.hasNext()) {
			String key=keyIterator.next();
			Integer value=map.get(key);
			System.out.println("\t"+key + " : "+value);
		}
		System.out.println();
		
		map.remove("이상주");
		System.out.println("총 Entry 수 : "+map.size());
		
		//객체를 하니씩 처리 (방법2)
		Set<Map.Entry<String, Integer>> entrySet=map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator=entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry=entryIterator.next();
			String key=entry.getKey();
			Integer value=entry.getValue();
			System.out.println("\t" + key + " : "+value);
		}
		
		System.out.println();
		//전체 삭제
		map.clear(); //모든 map.Entry
		System.out.println("총 Entry 수 : "+map.size());
		
		

	}

}
