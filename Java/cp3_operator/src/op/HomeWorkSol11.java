package op;

/* 
코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
 */
class HomeWorkSol11 {
	public static void main(String[]args) {
		byte a = 10;
		byte b = 20;
		//byte c = a + b;  → 연산 시 int형으로 변형되므로 byte형으로 다시 형변환 해준다.
		byte c= (byte)(a + b);
		char ch = 'A';
		//ch = ch + 2;    →연산 시 int형으로 변형되므로 char형으로 형변환 해준다.
		ch=(char)(ch+2);
		//float f = 3 / 2;   →연산 시 double 형으로 지정되므로 접미사를 붙인다.
		float f = 3/2f;
		//long l = 3000 * 3000 * 3000;   →연산 시 int형으로 지정되고, int형 표현 범위를 넘어서므로
		//								 long형의 접미사를 붙인다.
		long l = 3000*3000*3000L;
		float f2 = 0.1f;
		double d = 0.1;
		//boolean result = d==f2;    →double형의 0.1f,float형의 0.1f은 서로 다르다. 표현 범위가 다르고
		//								부동소수점의 값이 다르므로
		boolean result = d!=f2;
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		}
		}

	

