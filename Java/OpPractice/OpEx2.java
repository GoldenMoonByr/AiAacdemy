package op;

//증감연산자 ++i와 i++.
public class OpEx2 {
	public static void main(String args[]) {
		int i = 5;
		int j = 0;
		j = i++; //i를 먼저 j값에 넣고 +1 증가 연산.
		System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);
		
		j = ++i; //i를 먼저 +1 증가 연산하고 j에 값을 넣음.
		System.out.println("j=++i; 실행 후, i=" + i + ", j=" + j);

	}

}
