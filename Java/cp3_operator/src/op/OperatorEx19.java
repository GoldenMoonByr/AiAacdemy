package op;

//우리 풀었던 3의 배수 합 문제에 응용해보자.

public class OperatorEx19 {

	public static void main(String[] args) {
		// i가 1부터 10이 될 때까지, {}안의 문장을 반복 수행한다.
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				// i가 3으로 나누어 떨어지면, 3의 배수이므로 출력한다.
				System.out.println(i);
			}
		}
	}
}