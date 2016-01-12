/**
 * 
 */


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.plaf.basic.BasicCheckBoxMenuItemUI;
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
		s = new DatagramSocket(Integer.parseInt(args[0])); 
		p = new DatagramPacket(b, 1024);
		s.receive(p);
		byte array[] = p.getData(); 
		System.out.println(new String(array));
		s.close(); 
	}

}
