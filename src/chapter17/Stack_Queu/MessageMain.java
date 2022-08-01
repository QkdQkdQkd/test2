package chapter17.Stack_Queu;

import java.util.LinkedList;
import java.util.Queue;

public class MessageMain {

	public static void main(String[] args) {

		Queue<Message> messageQueue=new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail", "������"));  
		messageQueue.offer(new Message("sendSNS", "������"));
		messageQueue.offer(new Message("sendkakaotalk", "�̴��"));
		
		while(!messageQueue.isEmpty()) {
			Message message=messageQueue.poll();
			
			switch(message.command) {
			case "sendMail" :
				System.out.println(message.to+ "�Կ��� ������ ���½��ϴ�");
				break;
				
			case "sendSNS" :
				System.out.println(message.to+ "�Կ��� SnS�� ���½��ϴ�");
				break;
				
			case "sendkakaotalk" :
				System.out.println(message.to+ "�Կ��� īī������ ���½��ϴ�");
				break;
			}
		}//while

	}//main

}//class
