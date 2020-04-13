package Ex;

public class Ex11 {

	public static void main(String[] args) {

		int count = 0;
		for (int num = 0; num < 100; num++) {
			if (num % 35 != 0) {
				continue;
			}
			count++;
			System.out.println(num);
		}
//		while ((num++) < 100) {
//			if (num % 5 != 0 || num % 7 != 0)
//				continue;
//			count++;
//			System.out.println(num);
//		}
		System.out.println("count: " + count);
	}

}
