package Ex;

import java.util.Scanner;

/*두 개의 정수를 전달 받아서
, 두수의 절대값을 계산하여 출력하는 메서드와
이 메서드를 호출하는 main메서드를 정의해 보자.
단 메서드 호출 시 전달되는 값의 순서에 상관없이
절대값이 계산되어서 출력되어야 한다.*/

public class Ex02 {

	static void absMake(int a, int b) {
		System.out.println(a + "의 절댓값은" + Math.abs(a));
		System.out.println(b + "의 절댓값은" + Math.abs(b));
	}
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);

		System.out.println("두 수를 입력해주세요.");
		int a = s1.nextInt();
		int b = s2.nextInt();
		absMake(a, b);
	}
}
