package chapter17.Stack_Queu;

import java.util.ArrayList;

class MyStack{
	
	private ArrayList<String> arrayStack=new ArrayList<>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		
		int len=arrayStack.size();
		if(len==0) {
			System.out.println("������ ��� �ֽ��ϴ�");
			return null;
		}
		return(arrayStack.remove(len-1)); 
	}

	@Override
	public String toString() {
		return arrayStack.toString();
	}
}

public class StackTest01 {

	public static void main(String[] args) {
             
		MyStack stack=new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		
		System.out.println("�Է� : "+stack.toString());
		System.out.print("��� : ");
		System.out.print(stack.pop()+", ");
		System.out.print(stack.pop()+", ");
		System.out.print(stack.pop()+", ");
		System.out.println(stack.pop());
		
		System.out.println("��� : "+stack.toString()); 

	}

}
