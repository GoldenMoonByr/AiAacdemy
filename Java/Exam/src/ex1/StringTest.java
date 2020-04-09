package ex1;
//문자열과 정수의 연산 시 연산 순서에 따라 출력 값이 달라짐을 본다.
public class StringTest {

	public static void main(String[] args) {
		String a = 7 + " "; //숫자 +문자열의 값 
		
		String b = " " + 7; //문자열 +숫자의 값 a의 출력값과 비교
		
		String c = 7 + ""; //숫자 +문자열의 값  a의 출력값과 비교
		
		String d = "" + 7; //문자열 +숫자의 값 b의 출력값과 비교
		
		String e = "" + ""; //문자열 + 문자열의 출력값
		
		String f = 7 + 7 + ""; //숫자 + 숫자 + 문자열
							   //왼쪽부터 차례대로 숫자 + 숫자의 결과값과 문자열과의 합
		
		String g = "" + 7 + 7; //문자열 + 숫자 + 숫자
							   //왼쪽부터 차례대로 연산 하여 문자열 +숫자의 결과값은 문자열임을 알아본다.
							   //f의 출력값과 다름을 확인한다.
		
		System.out.println(a);
		
		System.out.println(b);
		
		System.out.println(c);
		
		System.out.println(d);
		
		System.out.println(e);
		
		System.out.println(f);
		
		System.out.println(g);	

	}

}
