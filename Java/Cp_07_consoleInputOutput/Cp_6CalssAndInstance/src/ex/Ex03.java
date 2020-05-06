package ex;

import java.util.Scanner;

/*원의 반지름 정보를 전달하면,
원의 넓이를 계산해서 반환하는 메서드와 원의 둘레를 계산해서
반환하는 메서드를 각각 정의하고, 
이를 호출하는 main메서드를 정의하자. (2*π*r), (π*r∧2)*/

public class Ex03 {
	final static double PI = 3.14;

	static void CircumOfCircle(int a) {
		System.out.println("반지름 " + a + "의 원의 둘레는" + 2 * PI * a + "입니다.");
	}

	static void WidthOfCircle(int a) {
		System.out.println("반지름 " + a + "의 원의 넓이" + PI * a * a + "입니다.");
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		CircumOfCircle(a);
		WidthOfCircle(a);
	}

}
