package op;

/* 
�ڵ��� �������� �����ؼ� �������� ���� ����� �򵵷� �Ͻÿ�.
 */
class HomeWorkSol11 {
	public static void main(String[]args) {
		byte a = 10;
		byte b = 20;
		//byte c = a + b;  �� ���� �� int������ �����ǹǷ� byte������ �ٽ� ����ȯ ���ش�.
		byte c= (byte)(a + b);
		char ch = 'A';
		//ch = ch + 2;    �濬�� �� int������ �����ǹǷ� char������ ����ȯ ���ش�.
		ch=(char)(ch+2);
		//float f = 3 / 2;   �濬�� �� double ������ �����ǹǷ� ���̻縦 ���δ�.
		float f = 3/2f;
		//long l = 3000 * 3000 * 3000;   �濬�� �� int������ �����ǰ�, int�� ǥ�� ������ �Ѿ�Ƿ�
		//								 long���� ���̻縦 ���δ�.
		long l = 3000*3000*3000L;
		float f2 = 0.1f;
		double d = 0.1;
		//boolean result = d==f2;    ��double���� 0.1f,float���� 0.1f�� ���� �ٸ���. ǥ�� ������ �ٸ���
		//								�ε��Ҽ����� ���� �ٸ��Ƿ�
		boolean result = d!=f2;
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		}
		}

	

