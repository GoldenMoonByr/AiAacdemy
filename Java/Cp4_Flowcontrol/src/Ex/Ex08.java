package Ex;
//1000 ������ �ڿ��� �߿��� 2�� ��� �̸鼭 7�� ����� ���ڸ� ����ϰ�, 
//�� ��µ� ���ڵ��� ���� ���ϴ� ���α׷��� while ���� �̿��ؼ� �ۼ�

public class Ex08 {
	public static void main(String[] args) {
		int num=0 , sum=0;
		while(num<=1000) {
			if(num%14==0) {
				sum+=num;
			}
			num++;
		}
		System.out.println("�� :"+num);
	}
}
