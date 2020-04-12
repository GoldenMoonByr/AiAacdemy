package op;
//연산 시 발생하는 자동 형변환
public class OpEx08 {
	public static void main(String[] args)
	 {
	 byte a = 10;
	 byte b = 20;
	 //byte c = a + b;
	 //정수의 연산 시 각 변수값과 결과값은 int형을 변환되기 때문에 
	 //byte형으로 형변환 해주어야한다.
	 byte c = (byte)(a+b);
	 System.out.println(c);
	}

}
