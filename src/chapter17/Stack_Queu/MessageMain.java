package chapter17.Stack_Queu;

import java.util.LinkedList;
import java.util.Queue;

public class MessageMain {

	public static void main(String[] args) {

		Queue<Message> messageQueue=new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail", "김지원"));  
		messageQueue.offer(new Message("sendSNS", "김지영"));
		messageQueue.offer(new Message("sendkakaotalk", "이대원"));
		
		while(!messageQueue.isEmpty()) {
			Message message=messageQueue.poll();
			
			switch(message.command) {
			case "sendMail" :
				System.out.println(message.to+ "님에게 메일을 보냈습니다");
				break;
				
			case "sendSNS" :
				System.out.println(message.to+ "님에게 SnS을 보냈습니다");
				break;
				
			case "sendkakaotalk" :
				System.out.println(message.to+ "님에게 카카오톡을 보냈습니다");
				break;
			}
		}//while

	}//main

}//class
