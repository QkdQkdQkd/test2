package chapter17.Stack_Queu;

import java.util.ArrayList;

class MyQueue{
	
	private ArrayList<String> arrayQueue=new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len=arrayQueue.size();
		
		//����ó��
		if(len==0) {
			System.out.println("ť�� ����ֽ��ϴ�");
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
		
		System.out.println("�Է� ���� : "+queue.toString());
		System.out.print("��� ���� :");
		System.out.print(queue.deQueue() + ", ");
		System.out.print(queue.deQueue()+ ", ");
		System.out.println(queue.deQueue());
		
		System.out.println(queue.toString());

	}

}
