package ex;

import java.util.StringTokenizer;

public class TokenTest {
	public static void main(String[] args) {
		String phoneNumber = "Tel 82-02-997-2059 	Test";
		
		//구분자를 따로 설정해놓지 않은 경우 tab/space 등 공백이 구분자임을 말한다.
		StringTokenizer st1 = new StringTokenizer(phoneNumber);
		
		while(st1.hasMoreTokens()) {
			System.out.println( st1.nextToken());
			
		}
		System.out.println("==========================");
		StringTokenizer st2 = new StringTokenizer(phoneNumber, " -",true);
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	
	
	}
}
