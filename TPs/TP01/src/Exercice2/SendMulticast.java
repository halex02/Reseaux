import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * @author damien toulouse
 * @author alexandre houplon
 *
 */
public class SendMulticast {

	/**
	 * 
	 */
	public SendMulticast() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
//		DatagramPacket p; 
//		DatagramSocket s; 
//		InetAddress dst = InetAddress.getByName(args[0]);
//		int port = Integer.parseInt(args[1]) ; 
//		byte[] sendData = new byte[1024];
//		sendData = args[2].getBytes();
//		p = new DatagramPacket(sendData, sendData.length, dst, port); 
//		s = new DatagramSocket(); 
//		s.send(p); 
//		s.close(); 

		
		MulticastSocket s;
		DatagramPacket p ;
		InetAddress dst = InetAddress.getByName(args[0]);
		int port = Integer.parseInt(args[1]);
		byte[] sendData = new byte[1024];
		sendData = args[2].getBytes();
		p = new DatagramPacket(sendData, sendData.length, dst, port);
		s= new MulticastSocket();
		s.send(p);
		s.close();
		
	}

}
