package chapter17.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// ����Ʈ������ ���� ArrayListŬ����
		
		List<String> ls=new ArrayList<String>();
		
		ls.add("Hi! "); //0 new String("Hi!")
		ls.add("Have "); //1
		ls.add("a Nice Day!"); //2
		
		for(int i=0;i<ls.size();i++) {
			System.out.println(i+":"+ls.get(i).toString());
		}
		System.out.println();
		
		System.out.println("----������ �߰�----");
		ls.add(3, " Everybody~~");{
		for(int i=0;i<ls.size();i++)
			System.out.println(i+":"+ls.get(i).toString());
		}
		System.out.println();
		
		System.out.println("----������ ����----");
		ls.remove(0);
		for(int i=0;i<ls.size();i++) {
			System.out.println(i+":"+ls.get(i).toString());
		}
		System.out.println();
	}

}
