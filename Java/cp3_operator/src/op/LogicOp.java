package op;

public class LogicOp {
	
	public static void main(String[] args) {
		
		//정수형 데이터 두 개를 받는다.
		//int num1 = 10  , num2 = 20;
		int num1 =10; // 사용자에게 받은 첫 번째 숫자.
		int num2 =20;// 사용자에게 받은 두 번째 숫자.
		
		//num1이 num2 보다 큰지 확인 
		//큰 경우 -> true , 작은 경우 -> false
		boolean check1 = num1 > num2;
		boolean check2 = num1==num2;
		//조건에 따른 내부적인 제어
		if(check2) {
			System.out.println("num1과 num2의 값은 같습니다.");
		}else {
			System.out.println("num1과 num2의 값은 다릅니다.");
		}
		
		if(check1) {
			System.out.println("num1의 값이 num2의 값보다 큽니다.");
		}else {
			System.out.println("num1의 값이 num2의 값보다 작습니다.");
			
		}
		
		
		
		
		System.out.println("--------------------------------------");
		
		//성인 여성중 기혼자에게만 메세지를 출력합니다.
		//성인
		//여성 중
		//기혼자
		//에게만 출력.
		
		int age = 20;
		char gender = 'M';
		boolean mcheck = true;
		
		boolean result= age>19 && gender == 'w' &&  mcheck;
		
			if(result) {
				System.out.println("메세지를 보냅니다.");
			}
				
		
	
}
}
