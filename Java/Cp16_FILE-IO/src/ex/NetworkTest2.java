package ex;

import java.net.MalformedURLException;
import java.net.URL;

public class NetworkTest2 {
	public static void main(String[] args) {
		URL url = null;
		String address = "https://www.google.com/search?q=java&oq=java&aqs=chrome..69i57j35i39j69i59l2j0l4.1028j0j8&sourceid=chrome&ie=UTF-8";
		
		try {
			url = new URL(address);
			URLConnectiong conn = url.openConnection();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
