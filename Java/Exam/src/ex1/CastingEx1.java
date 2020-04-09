package ex1;
//강제 형변화과 자동 형변환의 예

public class CastingEx1 {

	public static void main(String[] args) {
		
		double d = 100.0;
		
		int i = 100;
		
		int result = i + (int)d; //double d의 값을 int 형으로 형변환
		
		double result2 = i+ d; // 자동 형변환의 예.i가 double 형태로 자동적으로 형변환. 
		
		System.out.println("d=" + d);
		
		System.out.println("i=" + i);
		
		System.out.println("result=" + result);
		
		System.out.println("result2=" +result2); //double 형태로 자동 형변환 되어 결과값이 double 형으로 출력.
		

	}

}
