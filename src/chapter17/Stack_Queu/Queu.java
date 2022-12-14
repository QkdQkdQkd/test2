package chapter17.Stack_Queu;

import java.util.ArrayList;

class MyQueue{
	
	private ArrayList<String> arrayQueue=new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len=arrayQueue.size();
		
		//예외처리
		if(len==0) {
			System.out.println("큐가 비어있습니다");
			return null;
		}
		return (arrayQueue.remove(0));
	}

	@Override
	public String toString() {
		
		return arrayQueue.toString();
	}
	
}


public class Queu {

	public static void main(String[] args) {
		
		MyQueue queue=new MyQueue();
		
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println("입력 순서 : "+queue.toString());
		System.out.print("출력 순서 :");
		System.out.print(queue.deQueue() + ", ");
		System.out.print(queue.deQueue()+ ", ");
		System.out.println(queue.deQueue());
		
		System.out.println(queue.toString());

	}

}
