package Ex;
//�������� ¦�� ��(2,4,8)�� ����ϴ� ���α׷� �ۼ�.

//��, 2���� 2x2����, 4���� 4x4����, 8���� 8x8 ���� ���

public class Ex13 {
	public static void main(String[] args) {

		int num = 0;
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "��");
				for (int j = 1; j <= i; j++) {
					System.out.println(i + " X " + j + "=" + i * j);
				}
			}
		}

	}

}