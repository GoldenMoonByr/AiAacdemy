package Ex;
//1~100������ ���ڸ� ����ϰ� , 100~1������ ���ڸ� ����϶�.
//while , do-while �� �� ���� ����ϱ�.
public class Ex07 {
	public static void main(String[] args) {
		int num = 1;
		while (num <= 100) {
			System.out.print(num + "\t");
			num++;
		}
		num = 100;
		do {
			System.out.print(num + "\t");
			num--;
		} while (num >= 1);
	}

}
