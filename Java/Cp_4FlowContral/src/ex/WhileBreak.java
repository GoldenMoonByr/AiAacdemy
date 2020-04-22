package ex;

public class WhileBreak {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		// 무한 반복
		while (true) {
			if (sum > 100) {
				break;
			}
			System.out.println(i);
			i++;
			sum += i;
		}
		System.out.println("마지막 값 :" + i);
		System.out.println("합이 100이 넘어간 값 :" + sum);
	}


}
