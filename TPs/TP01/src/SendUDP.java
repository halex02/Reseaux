/**
 * 
 */


import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.DatagramPacket;
import java.io.IOException;
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
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		DatagramPacket p; DatagramSocket s; 
		InetAddress dst = InetAddress.getLocalHost();
		int port = Integer.parseInt(args[1]) ; 
		byte[] sendData = new byte[1024];
		sendData = args[2].getBytes();
		p = new DatagramPacket(sendData, sendData.length, dst, port); 
		s = new DatagramSocket(); 
		s.send(p); 
		s.close(); 

	}

}
