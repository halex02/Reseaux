import java.io.IOException;


public class MainSend {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		byte[] message = {(byte) 0x08, (byte) 0xbb,  (byte) 0x01, (byte) 0x00,/* a) 12 octets d'entete : 1 Question et 0 Reponse/Auth/Add */
				  (byte) 0x00, (byte) 0x01,  (byte) 0x00, (byte) 0x00, 
				  (byte) 0x00, (byte) 0x00,  (byte) 0x00, (byte) 0x00, 
				  (byte) 0x03, (byte) 0x77,  (byte) 0x77, (byte) 0x77,/* b.1) Question : - QNAME  "3www4lifl2fr0"           */
				  (byte) 0x04, (byte) 0x6c,  (byte) 0x69, (byte) 0x66,
				  (byte) 0x6c, (byte) 0x02,  (byte) 0x66, (byte) 0x72,
				  (byte) 0x00,                                        
				  (byte) 0x00, (byte) 0x01,                           /* b.2)            - QTYPE   "A"  1 : a host address  */
				  (byte) 0x00, (byte) 0x01 };                         /* b.3)            - QCLASS  "IN" 1 : the Internet    */
		
		DnsRequest dns = new DnsRequest("193.49.225.15", message);
		dns.sendDNS();

	}

}
