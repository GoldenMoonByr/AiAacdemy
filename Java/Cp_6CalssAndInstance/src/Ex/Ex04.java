package Ex;

/*전달되는 값이 소수(prime number)인지 아닌지를 판단하여, 
소수인경우 true를, 소수가 아닌 경우 false를 반환하는
메서드를 정의하고, 이를 이용해서 1이상 100 이하의 소수를
전부 출력할 수 있도록 main 메서드를 정의하자.*/
public class Ex04 {

	static boolean primeNumberCheck(int a) {
		boolean primeNumber = true;
		boolean NotPrimeNumber = false;
		if (!(a % 2 == 0 || a % 3 == 0 || a % 5 == 0 || a % 7 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (primeNumberCheck(i) == true) {
				System.out.println(i);
			}
		}

	}

}
