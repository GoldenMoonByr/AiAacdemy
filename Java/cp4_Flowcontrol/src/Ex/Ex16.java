package Ex;

//1 ���� 99������ ���� ���ϴ� ���α׷� �ۼ�
//while��, for��, do while ���� ���� ���
public class Ex16 {
	public static void main(String[] args) {
		int n = 1, sum = 0;
		for (int i = 1; i < 100; i++) {
			sum += i;  //sum=sum+i
		}
		System.out.println("for�� ��� :" + sum);
		sum = 0; //sum�� ������ ���� �ʱ�ȭ
		while (n < 100) {
			sum += n;
			n++;
		}
		System.out.println("while�� ��� :" + sum);
		n = 1;   //n�� ������ ���� �ʱ�ȭ
		sum = 0; //sum�� ������ ���� �ʱ�ȭ
		do {
			sum += n;
			n++;
		} while (n < 100);
		System.out.println("do-while�� ���:" + sum);
	}
}
