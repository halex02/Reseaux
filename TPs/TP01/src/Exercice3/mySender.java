import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * @author damien toulouse
 * @author alexandre houplon
 *
 */
public class mySender extends Thread {

	private InetAddress serverAdd;
	private int serverport;
	private boolean actif=true;
	
	public mySender(int port, InetAddress dst) throws IOException {
		serverAdd=dst;
		serverport=port;
		
	}
	
	public void halt(){
		actif=false;
	}
	
	@Override
	public void run() {
		BufferedReader read= new BufferedReader(new InputStreamReader(System.in));
		try{
			while(actif){
				String msg = read.readLine();
				MulticastSocket s;
				DatagramPacket p ;
				byte[] sendData = new byte[1024];
				sendData = msg.getBytes();
				p = new DatagramPacket(sendData, sendData.length, serverAdd, serverport);
				s= new MulticastSocket();
				s.send(p);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	

}
