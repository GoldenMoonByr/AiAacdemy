package ex;

import java.util.Scanner;

/*문제1
두 개의 정수를 전달받아서, 
두수의 사칙연산 결과를 출력하는 메서드와 
이 메서드를 호출하는 main메서드를 정의해보자.
단, 나눗셈은 몫과 나머지를 각각 출력해야 한다.
*/

public class Ex01 {

	static void calculator(int a, int b) {
		System.out.println(a + " + " + b + "=" + (a + b));
		System.out.println(a + " - " + b + "=" + (a - b));
		System.out.println(a + " * " + b + "=" + (a * b));
		System.out.println(a + " / " + b + "=" + (a / b) + "나머지" + (a % b));
	}

	public static void main(String[] args) {
		boolean power = true;
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		while (true) {
			System.out.println("두 수를 입력해 주세요.");
			int a = s1.nextInt();
			int b = s2.nextInt();
			calculator(a, b);
			if (power == false) {
				break;
			}
		}
	}
}
