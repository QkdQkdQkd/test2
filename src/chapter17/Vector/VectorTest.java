package chapter17.Vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		Object obj;
		
		Vector<Object> vec=new Vector<>(1);
		obj="Hi";
		vec.addElement(obj);
		System.out.println("용량은#1 : "+vec.capacity());
		System.out.println("크기는#1 : "+vec.size());
		System.out.println();
		
		obj="some people";
		vec.addElement(obj);
		System.out.println("용량은#2 : "+vec.capacity());
		System.out.println("크기는#2 : "+vec.size());
		System.out.println();
		
		obj="dream of success";
		vec.addElement(obj);
		System.out.println("용량은#3 : "+vec.capacity());
		System.out.println("크기는#3 : "+vec.size());
		System.out.println();
		
		obj="while";
		vec.addElement(obj);
		System.out.println("용량은#4 : "+vec.capacity());
		System.out.println("크기는#4 : "+vec.size());
		System.out.println();
		
		obj="other people";
		vec.addElement(obj);
		System.out.println("용량은#5 : "+vec.capacity());
		System.out.println("크기는#5 : "+vec.size());
		System.out.println();
		
		obj="get up";
		vec.addElement(obj);
		System.out.println("용량은#6 : "+vec.capacity());
		System.out.println("크기는#6 : "+vec.size());
		System.out.println();
		
		obj="and make";
		vec.addElement(obj);
		System.out.println("용량은#7 : "+vec.capacity());
		System.out.println("크기는#7 : "+vec.size());
		System.out.println();
		
		obj="it";
		vec.addElement(obj);
		System.out.println("용량은#8 : "+vec.capacity());
		System.out.println("크기는#8 : "+vec.size());
		System.out.println();
		
		obj="happen";
		vec.addElement(obj);
		System.out.println("용량은#9 : "+vec.capacity());
		System.out.println("크기는#9 : "+vec.size());
		System.out.println();
		
		System.out.println(vec);
		

	}

}
