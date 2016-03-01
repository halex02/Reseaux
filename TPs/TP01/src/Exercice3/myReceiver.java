package Exercice3;

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
public class myReceiver extends Thread {

	private InetAddress serverAdd;
	private int serverport;
	private boolean actif=true;
	private MulticastSocket s;
	
	public myReceiver(int port, InetAddress dst) throws IOException {
		serverAdd=dst;
		serverport=port;
	}
	
	

	public void halt(){
		actif=false;
	}
	
	@Override
	public void run() {
		
		try{
			while(actif){
				byte[] b = new byte[1024];			
				MulticastSocket s; 
				DatagramPacket p; 				
				s = new MulticastSocket(serverport); 
				s.joinGroup(serverAdd);
				p = new DatagramPacket(b, 1024);
				s.receive(p);
				byte array[] = p.getData(); 
				String msg = new String(array);
				System.out.println("packet recu de "+p.getAddress().getHostName()+" : "+msg);
			}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
