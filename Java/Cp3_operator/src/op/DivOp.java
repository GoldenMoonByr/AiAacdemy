package op;
//자료형에 따른 나누기 연사값에 대한 출력값


public class DivOp {
	
	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 3;
		
		// 정수의 나누기 연산
		System.out.println("num1 / num2 = " + num1 / num2);
		System.out.println("num1 / num2 = " + num1 / 3f);
		
		//실수의 연산, 형변환이 아닌 특정 숫자 자체를 기입해준다.
		System.out.println("num1 / num2 = " +  7f/3);
		//형변환(단항 연산자) 먼저 실행이 되고, 뒤에 있는 num2는 자동적으로 형변환 된다.
		System.out.println("num1 / num2 = " + (float)num1/num2);
		
		
		
		
		
		
	}

}
