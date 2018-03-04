package day14.CollectionFramework;
import java.util.*;


public class QueueExample {
	public static void main(String ar[]){
		Queue<Message> messageQueue =new LinkedList<Message>();
		
		messageQueue.offer(new Message("SendMail","Ana"));
		messageQueue.offer(new Message("SendMsg","Jane"));
		messageQueue.offer(new Message("SendText","Joy"));
		messageQueue.offer(new Message("SendTalk","Kal"));
		
		while(!messageQueue.isEmpty()){
			Message message=messageQueue.poll();
			switch(message.command){
			case "SendMail":System.out.println(message.to+" to SendMail"); break;
			case "SendMsg":System.out.println(message.to+" to SendMsg"); break;
			case "SendText":System.out.println(message.to+" to SendText"); break;
			case "SendTalk":System.out.println(message.to+" to SendTalk"); break;
			}
		}
		
	}
}

class Message{
	public String command;
	public String to;
	
	public Message(String c, String t){
		this.command=c;
		this.to=t;
	}
}