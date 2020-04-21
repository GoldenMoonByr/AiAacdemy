package ex;
/*문제 2. 다음 형태로 주민번호를 담고 있는 String 인스턴스를 하나 생성
String str = “990929-1010123”
이 문자열을 이용하여 중간에 삽입된 – 를 뺀 String 인스턴스를 생성.*/

public class HomeWork2 {

	public static void main(String[] args) {

		String str = "990929-1010123";

//	1. replace 사용
//		System.out.println(str.replace("-", ""));

// 2. split 사용
//		String[] str1 = str.split("-");
//		System.out.println(str1[0] + str1[1]);

// 3. substring 사용
		System.out.println(str.substring(0, 6) + str.substring(7));

	}

}