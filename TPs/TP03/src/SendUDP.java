/**
 * 
 */


import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.DatagramPacket;
import java.io.IOException;
import java.lang.String;
//import java.net.MulticastSocket;

/**
 * @author damien toulouse
 * @author alexandre houplon
 *
 */
public class SendUDP {

	public SendUDP(String ip, int port, String msg) throws IOException {
		DatagramPacket p; DatagramSocket s; 
		InetAddress dst = InetAddress.getByName(ip);
		byte[] sendData = new byte[1024];
		sendData = msg.getBytes();
		p = new DatagramPacket(sendData, sendData.length, dst, port); 
		s = new DatagramSocket(); 
		s.send(p); 
		s.close(); 
	}
	
	public static void main(String[] args) throws IOException {
		DatagramPacket p; DatagramSocket s; 
		InetAddress dst = InetAddress.getByName(args[0]);
		int port = Integer.parseInt(args[1]) ; 
		byte[] sendData = new byte[1024];
		sendData = args[2].getBytes();
		p = new DatagramPacket(sendData, sendData.length, dst, port); 
		s = new DatagramSocket(); 
		s.send(p); 
		s.close(); 

	}

}
