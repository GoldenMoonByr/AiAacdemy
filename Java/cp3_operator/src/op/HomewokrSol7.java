package op;
/*
 [3] 아래는 변수num의 값에 따라 ‘양수’,‘음수’,‘0’을 출력하는 코드이다.
 * 삼항 연산자를 이용해서(1)에 알맞은 코드를 넣으시오.
[Hint] 삼항 연산자를 두 번 사용하라.
3항 연산자 : 다음에 풀어도 됩니다.
 */

public class HomewokrSol7 {
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 0;
		int num3 = -10;

		System.out.println(num1>0? "양수" : (num1<0? "음수" : 0) );
		System.out.println(num2>0? "양수" : (num2<0? "음수" : 0) );
		System.out.println(num3>0? "양수" : (num3<0? "음수" : 0) );
	}
}
