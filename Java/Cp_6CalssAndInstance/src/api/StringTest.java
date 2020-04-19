package api;

public class StringTest {
	public static void main(String[] args) {
		
	
		String str1 = "My String";
		String str2 = "My String";
		String str3 ="Your String";
		System.out.println(str1==str2);
		System.out.println((str1==str3));
		
		
		
		
		
		
		
		
		
		
		java.lang.String  str = "My name is JAVA";
		
		int strLength = str.length();
		System.out.println("문자열 str 의 문자열의 길이는 :" +str.length());
		
		
		int strLength2 = "한글의 길이는?".length();
		System.out.println("길이 :" +strLength2);
	}

}

// String 클래스의 특징
//1. string 인스턴스에 저장된 문자열의 나용은 변경이 불가능하다.
//2. 이는 동일한 문자열의 인스턴스를 하라면 생성해서 공유하기 위함이다.
