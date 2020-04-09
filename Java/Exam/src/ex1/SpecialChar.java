package ex1;
//문자, 문자열 안에서의 기호 사용
public class SpecialChar {

	public static void main(String[] args) {
		
			char singleQuote = '\''; // \'의 사용
								// singleQuote = ''';은 오류.
			String doubleQuote = "\"Java World\""; // \" \"의 사용
										 // doubleQuote = """";은 오류
			// 겹따옴표를 출력하려면 이렇게 한다.
			String path = "c:\\"; //    \\의 사용. 나중에 웹을 사용할 때 많이 사용하게 되므로 꼭 숙지.
			
			
			
			System.out.println(singleQuote);
			
			System.out.println(doubleQuote);
			
			System.out.println(path);
	}

}
