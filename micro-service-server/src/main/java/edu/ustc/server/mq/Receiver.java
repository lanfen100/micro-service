package edu.ustc.server.mq;

public class Receiver {
	
	public void receiveMessage(String message) {
		System.out.println("收到 message is : " + message);
	}
}