package Ex;
//�� Ư�� ���� ������ �°� ����ϱ�.
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		{
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			if (num >= 0 && num < 100) {
				System.out.println("0�̻� 100�̸�");
			} else if (num >= 100 && num < 200) {
				System.out.println("100�̻� 200�̸�");
			} else if (num >= 200 && num < 300) {
				System.out.println("200�̻� 300�̸�");
			} else if (num >= 300) {
				System.out.println("300�̻�");
			} else
				System.out.println("0�̸�");
		}
	}
}
