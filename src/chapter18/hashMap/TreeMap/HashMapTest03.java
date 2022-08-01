package chapter18.hashMap.TreeMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest03 {

	public static void main(String[] args) {
		
		
		Map<String, Integer> map=new HashMap<>();
		
		//팀원 데이터(성함, 학번) 저장
		map.put("이승준", 111);
		map.put("이은석", 222);
		map.put("이세창", 333);
		map.put("서경신", 444);
		map.put("최윤이", 555);
		map.put("제민규", 666);
		
		//팀원의 인원
		System.out.println("총 Entry 수 :" +map.size());
		//팀장의 학번을 출력
		System.out.println("팀장 : "+map.get("이세창"));
		Set<String> keySet=map.keySet();
		Iterator<String> keyiIterator=keySet.iterator();
		
		while(keyiIterator.hasNext()) {
		String key=keyiIterator.next();
		Integer value=map.get(key);
		System.out.println("\t"+key + " : "+value);
		}
		System.out.println();
		//팀원의 학번을 모두 출력

	}

}
