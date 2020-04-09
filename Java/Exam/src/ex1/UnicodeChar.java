package ex1;

public class UnicodeChar {
	
	public static void main(String agrs[]) {
		
		int a = 30;
		char c1 = 'A'; //문자 알파벳 선언
		char c2 = 66; //char 자료형에 정수 선언
		String s = "안녕하세요"; //임의의 문자열 선언
		
		System.out.println(c1); //char형에 알맞게 'A'출력
		System.out.println(c2); //char형에 알맞게 'B'출력
		System.out.println(c1+c2);//숫자와 연산시 유니코드로 적용하여 출력
		System.out.println(s+c1+c2);//문자열과 연산시 문자로 연산되어 출력
		System.out.println(a+c1+c2);//숫자와 연산시 유니코드로 적용 되어 출력
		System.out.println(a+c1+c2+s);//숫자와 연산시 유니코드로 적용 되어 연산 되다가,
									  //문자열과 연산 될 시 문자열로 출력.
		
	}

}

