package Ex;

import java.util.Scanner;

//Ex02�� ��� �ڵ带 switch ������ �ٲپ� ����.
public class Ex05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		switch (num / 100) {
		case 0:
			System.out.println("0�̻� 100�̸�");
			break;

		case 1:
			System.out.println("100�̻� 200�̸�");
			break;

		case 2:
			System.out.println("200�̻� 300�̸�");
			break;

		default:
			System.out.println("300�̻�");

		}
		if (num < 0) {
			System.out.println("0�̸�");
		}
	}

}
