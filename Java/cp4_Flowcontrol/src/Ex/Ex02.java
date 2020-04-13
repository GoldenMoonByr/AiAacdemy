package Ex;
//각 특정 숫자 범위에 맞게 출력하기.
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		{
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			if (num >= 0 && num < 100) {
				System.out.println("0이상 100미만");
			} else if (num >= 100 && num < 200) {
				System.out.println("100이상 200미만");
			} else if (num >= 200 && num < 300) {
				System.out.println("200이상 300미만");
			} else if (num >= 300) {
				System.out.println("300이상");
			} else
				System.out.println("0미만");
		}
	}
}
