package chapter17.list;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		//Arrays : 컬렉션 초기화
		int iArray[]= {50,10,20,30,40};
		String sArray[]=new String[5];
		
		System.out.println(Arrays.toString(iArray));
		Arrays.sort(iArray);
		System.out.println(Arrays.toString(iArray));
		
		Arrays.fill(sArray, "Hi!");
		System.out.println(Arrays.toString(sArray));
		
		List<String> City=Arrays.asList("Seoul","Inchon","Busan","Deaeon","Jeju");
		for(int i=0;i<City.size();i++) {
			System.out.println(City.get(i).toString());
		}

	}

}
