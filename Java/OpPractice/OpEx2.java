package op;

//���������� ++i�� i++.
public class OpEx2 {
	public static void main(String args[]) {
		int i = 5;
		int j = 0;
		j = i++; //i�� ���� j���� �ְ� +1 ���� ����.
		System.out.println("j=i++; ���� ��, i=" + i + ", j=" + j);
		
		j = ++i; //i�� ���� +1 ���� �����ϰ� j�� ���� ����.
		System.out.println("j=++i; ���� ��, i=" + i + ", j=" + j);

	}

}
