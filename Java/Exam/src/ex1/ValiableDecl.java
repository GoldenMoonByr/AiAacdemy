package ex1;

public class ValiableDecl {

	public static void main(String args[]) {
		
		double num1 , num2, result;
		
		num1 = 1.0000001;

		num2 = 2.0000001;
		
	
		result= num1 + num2 ;
		//result = num1 * num2;
		
		System.out.println(num1);
		System.out.println(num2);
		//실수의 부동 소수점 표현에 의해 값이 조금 상이함을 볼 수 있음.
		System.out.println(result);
		
		//해결법
		double num3 = num1 * 10000000; //실수 범위의 수를 정수 범위에서 계산할 수 있도록 맞춰준다.
		double num4 = num2 * 10000000; //실수 범위의 수를 정수 범위에서 계산할 수 있도록 맞춰준다.
		double result1 = num3 + num4;
		System.out.println(result1/10000000); //부동 소수점이 아닌 알맞은 값 확인.
	}
}

