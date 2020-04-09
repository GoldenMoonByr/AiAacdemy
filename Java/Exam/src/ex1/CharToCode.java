package ex1; 
//char값의 유니코드를 화면에 출력
public class CharToCode {

	public static void main(String[] args) {
		
		char c = 'B'; // char ch = '\u0042'; 유니코드의 16진수 화

		
	int code = (int)c; // 문자값을 int형으로 변환한다. , (int) 생락가능.
		
		System.out.println(c);

		
		System.out.println(code);

	}

}
