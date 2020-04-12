package op;
//정수형의 연산 시 , 각 변수와 결과값은 int형으로 나오게 됨.
public class OpEx11 {

	public static void main(String[] args) {
		
		long a = 1000000 * 1000000; //int형의 표현 범위에 넘어가므로 값은 왜곡 됨.
		
		long b = 1000000 * 1000000L; // long형 리터럴
		
		System.out.println(a);
		
		System.out.println(b);
	}

}
