package ex;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpIpServer {
	public static void main(String[] args) {
		
	ServerSocket serverSocket= null;
	try {
		serverSocket = new ServerSocket(7777);
		System.out.println("소컷 서버가 준비되었습니다.");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		while(true) {
			System.out.println("연결 요청을 기다립니다.");
			
			//요청이 들어오면 연결 소켓 생성
			//요청이 들어올 때까지 대기
			try {
				Socket socket = serverSocket.accept( );
				System.out.println(socket.getInetAddress() + "바로 연결 되었습니다.");
				
				outputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			
		}
	}
	
	}
}
