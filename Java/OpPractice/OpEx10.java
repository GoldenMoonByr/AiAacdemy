package op;
//int���� ǥ�� ������ �ʰ� ���� ��
public class OpEx10 {
	public static void main(String[] args) {
		
		int a = 1000000; // 1,000,000 1�鸸
		
		int b = 2000000; // 2,000,000 2�鸸
		
		int c = a * b; // 2,000,000,000,000
		//int ���� ǥ�� ������ �Ѿ��. long ������ ��ȯ����� �ϸ�
		//long c = a * (long)b; ������ �ٲپ���� �Ѵ�.
		
		System.out.println(c);
	}

}
