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
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���");
			System.out.print("���̵� : ");
			String id=scan.next();
			System.out.println();
			
			if(map.containsKey(id)) {
				System.out.println("��й�ȣ : ");
				String pw=scan.next();
				if(map.get(id).equals(pw)) {
					System.out.println("�α��ο� �����ϼ̽��ϴ�");
					break;
				}//inner if
			}else {
				System.out.println("�Է��Ͻ� ���̵�� �������� �ʽ��ϴ�");
				continue;
			}//out if
		}//while
	}
	}

