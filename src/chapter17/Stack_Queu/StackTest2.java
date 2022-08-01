package chapter17.Stack_Queu;

import java.util.Stack;

public class StackTest2 {

	public static void main(String[] args) {
		
		Stack<Object> st=new Stack<>();
		
		if(st.empty()) { //메모리에 아무것도 없다면
			for(int i=0;i<3;i++) {
				st.push(new String("Hi"+i));
				System.out.println("입력 "+i+"번째 : "+st.peek());
			}
		}
		
		st.pop();
		System.out.println("현재 Top의 위치(peek) : "+st.peek());
		st.pop();
		System.out.println("현재 Top의 위치(peek) : "+st.peek());
		st.push(new String("everybody"));
		System.out.println("현재 Top의 위치(peek) : "+st.peek());
		st.push(new String("Happy Day"));
		System.out.println("현재 Top의 위치(peek) : "+st.peek());
		st.push(new Integer(30));
		System.out.println("현재 Top의 위치(peek) : "+st.peek());
		st.push(40);
		System.out.println("현재 Top의 위치(peek) : "+st.peek());
		st.push(new Double(3.14));
		System.out.println("현재 Top의 위치(peek) : "+st.peek());


	}

}
