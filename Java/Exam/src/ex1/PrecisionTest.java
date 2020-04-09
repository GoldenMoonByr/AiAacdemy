package ex1;
//접미사의 필요성과 사용 사례
public class PrecisionTest {

	public static void main(String[] args) {
		float f = 1.2345678101234567890f;//float 자료형이 표현할 수 있는 범위가 넘어갔으며,
										 //float 값으로 출력하기 위해 접미사 f를 기입
		double d = 1.2345678901234567890; //컴퓨터의 기본 실수형인 double형이므로 접미사 생략가능
		
		float f2 = 0.1000000001f; //float는 소숫점 아래 7자리 까지 표기, 그 이후 자릿수의 값은 생략.
		
		double d2 = 0.100000001; // 접미사 생략되었음.
		
		double d3 = 0.1000000000000001; //double은 소숫점 아래 16자리 까지 표기.
		
		
		
		System.out.println(f);
		
		System.out.println(d);
		
		System.out.println(f2);
		
		System.out.println(d2);
	
		System.out.println(d3);

	}

}
