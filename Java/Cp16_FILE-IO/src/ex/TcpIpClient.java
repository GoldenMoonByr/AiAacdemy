package ex;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIpClient {
	
	public static void main(String[] args) {
		try {
			//소켓의 inputStream 객체를 얻어오다.
			Socket socket = new Socket("127.0.0.1" , 7777);
			InputStream in = socket.getInputStream();
			DataInputStream din = new DataInputStream(in);
			
			System.out.println("서버 : " + din.readUTF());
			System.out.println("연결을 종료합니다.");
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
