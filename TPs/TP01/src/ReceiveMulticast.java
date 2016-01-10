import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ReceiveMulticast {

	public ReceiveMulticast() {
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		MulticastSocket s; 
		DatagramPacket p; 
		byte[] b = new byte[1024];
		s = new MulticastSocket(Integer.parseInt(args[1])); 
		s.joinGroup(InetAddress.getByName(args[0]));
		p = new DatagramPacket(b, 1024);
		s.receive(p);
		byte array[] = p.getData(); 
		System.out.println(new String(array));
		s.leaveGroup(InetAddress.getByName(args[0]));
		s.close(); 
	}

}
