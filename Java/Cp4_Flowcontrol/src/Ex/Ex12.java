package Ex;
//�ڿ��� 1���� �����ؼ� ��� Ȧ���� 3�� ����� ¦���� ���� ������.
//�׸��� �� ���� ���� (���� ������ ��) 1000�� �Ѿ����,
//�׸��� 1000�� �Ѿ ���� �󸶰� �Ǵ���
//����Ͽ� ����ϴ� ���α׷��� �ۼ�.
//���α׷� ���ο� while���� ���� ������ �����Ͽ� �ۼ�.
public class Ex12 {
	public static void main(String[] args) {
		int num=0,sum=0,count=0;
		while(true) {
			if(num%2==1 || num%6==0) {
				
			}
			num++;
			if(sum>1000) {
				break;
			}
		}
		System.out.println(num);
		System.out.println(sum);
	}
}
