package Ex;

//���� ���� �����ϴ� ������ ã�� ���α׷� �ۼ�. 
//A B
//B A
//------
//9 9
public class Ex14 {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i + j == 9) {
					System.out.println(i + "," + j);
				}
			}
		}
	}
}