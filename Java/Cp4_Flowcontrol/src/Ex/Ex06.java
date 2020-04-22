package Ex;

//while문을 이용해서 1부터 99까지 합 구하기
public class Ex06 {

	public static void main(String[] args) {
		int num = 1, sum = 0;

		while (num <= 99) {
			sum += num;
			num++;
		}
		System.out.println("1부터 99까지의 합:" + sum);
	}

}
