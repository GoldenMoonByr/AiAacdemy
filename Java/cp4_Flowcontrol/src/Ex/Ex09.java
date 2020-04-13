package Ex;
//for 문을 이용하여 1부터 10까지를 곱해서 그 결과를 출력하는 프로그램을 작성
public class Ex09 {

	public static void main(String[] args) {
		int sum=1;
		for(int i=1;i<=10;i++) {
			sum = sum*i;
		}
		System.out.println("1부터 10까지의 곱:"+sum);
	}

}
