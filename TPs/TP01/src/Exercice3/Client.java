package Exercice3;

import java.io.IOException;
import java.net.InetAddress;

/**
 * @author damien toulouse
 * @author alexandre houplon
 *
 */
public class Client {

	public Client() {
		
	}
	
	public static void main(String[] args) throws IOException {
		int clientport=7654;
		InetAddress dst = InetAddress.getByName("224.0.0.1");
		
		mySender s = new mySender(clientport,dst);
		s.start();
		myReceiver r = new myReceiver(clientport,dst);
		r.start();
		
		
	}
	
	

}
