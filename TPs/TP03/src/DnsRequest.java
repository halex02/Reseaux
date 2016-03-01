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
		ds.close();
	}
	
	public void receiveDNS() throws IOException {
		InetAddress provenance ;		
		DatagramSocket ds ;
		DatagramPacket dp ;
		dp = new DatagramPacket(new byte[512],512) ;
		ds = new DatagramSocket ();
		ds.receive(dp);
		byte[] rep = dp.getData();
		System.out.println(rep); 
		
	}
	
	
}
