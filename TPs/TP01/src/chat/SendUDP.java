/**
 * 
 */
package chat;

import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.lang.String;
//import java.net.MulticastSocket;

/**
 * @author halex02
 *
 */
public class SendUDP {

	public SendUDP() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DatagramPacket p; DatagramSocket s; 
		InetAddress dst = InetAddress.getByName("brigant"); 
		int port = 1024 ; 
		byte array[] = new byte[2]; 
		Array[0] = 1; 
		Array[1] = 2; 
		p = new DatagramPacket p(array, 2, dst, port); 
		s = new DatagramSocket(); 
		s.send(p); 
		s.close(); 

	}

}
