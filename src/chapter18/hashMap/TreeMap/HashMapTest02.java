package chapter18.hashMap.TreeMap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashMapTest02 {

	public static void main(String[] args) {
		
		
		Map<String, String> map=new Hashtable<>();

		map.put("Spring", "123");
		map.put("Summer", "1234");
		map.put("Fall", "12345");
		map.put("Winter", "123456");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호을 입력하세요");
			System.out.print("아이디 : ");
			String id=scan.next();
			System.out.println();
			
			if(map.containsKey(id)) {
				System.out.println("비밀번호 : ");
				String pw=scan.next();
				if(map.get(id).equals(pw)) {
					System.out.println("로그인에 성공하셨습니다");
					break;
				}//inner if
			}else {
				System.out.println("입력하신 아이디는 존재하지 않습니다");
				continue;
			}//out if
		}//while
	}
	}

