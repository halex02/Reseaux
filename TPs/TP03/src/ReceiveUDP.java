/**
 * 
 */


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
/**
 * @author damien toulouse
 * @author alexandre houplon
 *
 */
public class ReceiveUDP {

	
	public ReceiveUDP() {
		
	}
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		DatagramSocket s; 
		DatagramPacket p; 
		byte[] b = new byte[1024];
		s = new DatagramSocket(5001); 
		p = new DatagramPacket(b, 1024);
		s.receive(p);
		byte array[] = p.getData(); 
		System.out.println(new String(array));
		s.close(); 
	}

}
