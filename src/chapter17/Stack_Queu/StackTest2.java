package chapter17.Stack_Queu;

import java.util.Stack;

public class StackTest2 {

	public static void main(String[] args) {
		
		Stack<Object> st=new Stack<>();
		
		if(st.empty()) { //�޸𸮿� �ƹ��͵� ���ٸ�
			for(int i=0;i<3;i++) {
				st.push(new String("Hi"+i));
				System.out.println("�Է� "+i+"��° : "+st.peek());
			}
		}
		
		st.pop();
		System.out.println("���� Top�� ��ġ(peek) : "+st.peek());
		st.pop();
		System.out.println("���� Top�� ��ġ(peek) : "+st.peek());
		st.push(new String("everybody"));
		System.out.println("���� Top�� ��ġ(peek) : "+st.peek());
		st.push(new String("Happy Day"));
		System.out.println("���� Top�� ��ġ(peek) : "+st.peek());
		st.push(new Integer(30));
		System.out.println("���� Top�� ��ġ(peek) : "+st.peek());
		st.push(40);
		System.out.println("���� Top�� ��ġ(peek) : "+st.peek());
		st.push(new Double(3.14));
		System.out.println("���� Top�� ��ġ(peek) : "+st.peek());


	}

}
