package ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImortTest {
	public static void main(String[] args) {
		
		//java.util.datr
		//날짜와 시간 정보를 하나로 표현
		Date today = new Date();
		
		
		System.out.println(today); //today.toString()
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.mm.dd. a HH: MM :ss");
		System.out.println(dateFormat.format(today));
		
	}

}
