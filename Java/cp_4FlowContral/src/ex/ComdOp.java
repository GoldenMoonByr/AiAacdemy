package ex;

public class ComdOp {
	public static void main(String[] args) {
		
		//숫자 두개를 받는다
		int  num1  = 100, num2 = 50;
	
		
		//큰 수 ,  차이 값을 저장 하는 변수
		int bigNum, diffNum;
		
		///큰수 구하기
		bigNum = (num1> num2)? num1:num2;
				//bigNum = num1 , bigNum = num2;
		System.out.println(bigNum);
		//두수의 차이
		diffNum = (num1>num2)? num1 - num2 : num2-num1;
		//diffNum = num1 - num2 , diffNum = num2-um2
		System.out.println(diffNum);
		
		
	}

}
