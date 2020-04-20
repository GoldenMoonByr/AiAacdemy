package ex;
/*다음 형태로 String 인스턴스를 생성.

String str = “ABCDEFGHIJKLMN”;
 
그리고 이 문자열을 역순으로 다시 출력하는 프로그램을 작성.*/

public class HomeWork01 {

	public static void main(String[] args) {

		String str = "ABCDEFGHIJKLMN";
		String str2 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			str2 = str2 + str.charAt(i);

		}
		System.out.println(str2);
	}

}
