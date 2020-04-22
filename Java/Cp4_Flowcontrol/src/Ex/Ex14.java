package Ex;

//다음 식을 만족하는 조합을 찾는 프로그램 작성. 
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