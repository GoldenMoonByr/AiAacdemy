package op;
//byte���� ǥ�� ���� �ʰ�
public class OpEx09 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte) (a * b);
		//byte���� -128~byte~128������ ǥ�� ������ ����
		//ǥ�� �������� �ʰ��Ǵ� ������� �����Ƿ� ���� �ʰ��Ǿ�
		//ǥ�� ���� �ȿ��� �ӹ���.
		System.out.println(c);
	}

}
