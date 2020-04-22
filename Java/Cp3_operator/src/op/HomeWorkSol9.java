package op;

/* 
아래는 변수num의 값보다 크면서도 
가장 가까운10의 배수에서 변수num의 값을뺀 나머지를 구하는 코드이다.
예를 들어, 24의 크면서도 가장 가까운10의 배수는 30이다.
19의 경우 20이고,81의 경우 90이 된다.30에서 24를 뺀 나머지는6이기 때문에
 변수num의 값이 24라면6을결과로 얻어야 한다.(1)에 알맞은 코드를 넣으시오.
[Hint] 나머지 연산자를 사용하라.
 */
public class HomeWorkSol9 {
	public static void main(String[]args) {

		int num = 40;
		System.out.println(10-(num%10));
		
	}

}
