package Ex;

//while���� �̿��ؼ� 1���� 99���� �� ���ϱ�
public class Ex06 {

	public static void main(String[] args) {
		int num = 1, sum = 0;

		while (num <= 99) {
			sum += num;
			num++;
		}
		System.out.println("1���� 99������ ��:" + sum);
	}

}
