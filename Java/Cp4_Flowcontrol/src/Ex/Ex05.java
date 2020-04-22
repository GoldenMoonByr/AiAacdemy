package Ex;

import java.util.Scanner;

//Ex02의 답안 코드를 switch 형으로 바꾸어 보자.
public class Ex05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		switch (num / 100) {
		case 0:
			System.out.println("0이상 100미만");
			break;

		case 1:
			System.out.println("100이상 200미만");
			break;

		case 2:
			System.out.println("200이상 300미만");
			break;

		default:
			System.out.println("300이상");

		}
		if (num < 0) {
			System.out.println("0미만");
		}
	}

}
