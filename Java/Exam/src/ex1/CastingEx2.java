package ex1;
//표현 범위에 따른 자료형을 확인, 명시적 형변화로 인한 자료형에 따른 출력값의 차이.
public class CastingEx2 {

	public static void main(String[] args) {
		
		byte b = 100; //byte형의 값을 저장
		
		int i = (int)b; //int값으로 형변환 했으나 int 값에서 표현 될 수 있는 값이므로
						//변함없이 그대로 i값에 저장됨을 알 수 있다.
		
		System.out.println("i=" + i);
		
		System.out.println("b=" + b);
		
		int i2 = 129; //int형의 값을 저장
		
		byte b2 = (byte)i2; //byte의 형태로 명시적 형변환
		
		System.out.println("i2=" + i2);
		
		System.out.println("b2=" + b2); // byte 자료형의 표현 범위를 초과 했으며, overflow 되어 그에 따른 값이 출력 됨.
		

	}

}
