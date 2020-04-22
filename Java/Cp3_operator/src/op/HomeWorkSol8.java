package op;

/*[5] 아래는 변수num의 값 중에서 일의 자리를1로 바꾸는 코드이다.
 * 만일 변수 num의값이 333이라면 331이 되고,777이라면 771이 된다.
 * (1)에 알맞은 코드를 넣으시오.
 */
public class HomeWorkSol8 {
	public static void main(String[] args) {

		int num1 = 333;
		int num2 = 771;

		/* int형은 소숫점 아래의 숫자를 담을 수 없으므로
		 * 10을 나누어 33.3, 77.1으로 만들어준다면 int형에는 33이라는 숫자만
		 * 담게된다. 그 후 10을 곱하고 1을 더해준다면 모든 일의자리 숫자는
		 * 1로 바뀌게 됨을 알 수 있다.
		 */
		System.out.println( (num1/10)*10+1); 
		System.out.println( (num2/10)*10+1);
	}

}
