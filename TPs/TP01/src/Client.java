import java.io.IOException;
import java.net.InetAddress;

public class Client {

	public Client() {
		
	}
	
	public static void main(String[] args) throws IOException {
		int clientport=1500;
		InetAddress dst = InetAddress.getByName("224.0.0.1");
		
		mySender s = new mySender(clientport,dst);
		
		myReceiver r = new myReceiver(clientport,dst);
		r.start();
		
		
	}
	
	

}
