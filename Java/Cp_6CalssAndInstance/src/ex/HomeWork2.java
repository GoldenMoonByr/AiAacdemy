package ex;
/*문제 2. 다음 형태로 주민번호를 담고 있는 String 인스턴스를 하나 생성
String str = “990929-1010123”
이 문자열을 이용하여 중간에 삽입된 – 를 뺀 String 인스턴스를 생성.*/

public class HomeWork2 {

	public static void main(String[] args) {

		String str1 = "990929-1010123";
		String str2 = "";
		String str3 = "";
		String str4 = "";

		for (int i = 0; i < (str1.length() / 2) - 1; i++) {
			str2 = str2 + str1.charAt(i);
			System.out.println(str2);
		}

		for (int i = str1.length() / 2; i < str1.length(); i++) {
			str3 = str3 + str1.charAt(i);
			System.out.println(str3);
		}

		for (int i = 0; i <str3.length(); i++) {
			str4 = str4 + str2.charAt(i) + str3.charAt(i);
		}
		System.out.println(str4);
	}
}
