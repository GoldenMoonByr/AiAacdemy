package Ex;

//3�� ������ if~else ������ �ٲٱ�
public class Ex03 {
	public static void main(String[] args) {
		int num1 = 300, num2 = 100;
		int big, diff;
		big = num2;
		if (num1 > num2) {
			big = num1;
			diff = num1 - num2;
		} else {
			diff = num2 - num1;
		}
		System.out.println(big);
		System.out.println(diff);
		// big = (num1>num2)? num1:num2;
		// System.out.println(big);
		// diff = (num1>num2)? num1-num2: num2-num1;
		// System.out.println(diff);
	}

}
