package chapter17.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

          List<String> list1=new ArrayList<String>();   
          List<String> list2=new LinkedList<String>(); //�˻� ���α׷�
          
          long startTime;
          long endTime;
          
          startTime=System.nanoTime();
          
          for(int i=0;i<10000;i++) {
        	  list1.add(0, String.valueOf(i));
        	  
          }
          endTime=System.nanoTime();
          System.out.println("ArrayList �ɸ��ð� : "+ (endTime-startTime) +" ns");
          
          startTime=System.nanoTime();
          
          for(int i=0;i<10000;i++) {
        	  list2.add(0, String.valueOf(i));
        	  
          }
          endTime=System.nanoTime();
          System.out.println("LinkedList �ɸ��ð� : "+ (endTime-startTime) +" ns");
	}

}

   //String.valueOf(i) : null�� ��� ToString�� ����ϸ� NullPointException(NPE)
   //                    null�� ��� valueOf�� ����ϸ� Null

