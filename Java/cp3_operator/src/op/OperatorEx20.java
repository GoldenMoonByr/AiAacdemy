package op;

//나머지는 2,3의 배수, 패턴을 찾는데 도움이 된다.

public class OperatorEx20 {

	public static void main(String[] args) {
		int share = 10 / 8;
		
		int remain = 10 % 8;
		
		System.out.println("10을 8로 나누면, ");
		
		System.out.println("몫은 " + share + "이고, 나머지는 " + remain + "입니다.");
	}
}