import java.io.*;
import java.net.*;

public class DnsRequest {
	String ip;
	byte [] message;
	
	public DnsRequest(String ip, byte[] message) {
		this.ip=ip;
		this.message=message;
	}
	
	public void sendDNS() throws IOException {
		InetAddress destination;		
		destination = InetAddress.getByName(ip);
		DatagramPacket dp = new DatagramPacket(message,message.length,destination,53);
		DatagramSocket ds ;
		ds = new DatagramSocket() ;
		ds.send(dp);
		dp = new DatagramPacket(new byte[512],512);
		ds.receive(dp);
		byte[] rep = dp.getData();
		System.out.println(dp.getLength());
		for(int i = 0; i < dp.getLength(); i++) {
		    System.out.print(","+Integer.toHexString((rep[i])&0xff));
		    if ((i+1)%16 == 0)
			System.out.println("");
		}
		ds.close();
	}
	
	
}
