package ex;

//문제 2.
//다음 메서드는 int형 1차원 배열에 저장된 값을 
//두 번째 매개변수로 전달될 값의 크기만큼 전부 증가시킨다.
//
//public static void addOneDArr(int[] arr, int add){
//for (int i=0, i<arr.length; i++)
//arr[i] +=add;
//}
//
//이 메서드를 기반으로(이 메서드를 호출하는 형태로)
//int형 2차원 배열에 저장된 값 전부를 증가시키는 메서드를 다음의 형태로 정의하자.
//public static void addOneDArr(int[][] arr, int add) { . . . . . }
//단 위 메서드는 2차원 배열의 가로, 세로 길이에 상관없이 동작해야 하며,
//위의 메서드가 제대로 동작하는지 확인하기 위한 main 메서드도 함께 정의해야 한다.

public class Ex02 {

	// 1차원 배열 모든 요소에 값을 더해주는 메소드
	public static void addOneDArr(int[] arr, int add) {

		for (int i = 0; i < arr.length; i++) {

			arr[i] += add;
		}
	}

	// 2차원배열의 모든 요소에 값을 더해주는 메소드
	public static void addOneDArr(int[][] arr, int add) {
		for (int i = 0; i < arr.length; i++) {// 2차원 배열에서 행의 길이.
			for (int j = 0; j < arr[i].length; j++) {// 1차원 배열의 길이
				arr[i][j] = arr[i][j] + add;
			}
		}
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
		int[][] b = { { 1, 2 }, { 2, 3 }, { 3, 4 } };

		Ex02.addOneDArr(a, 10);
		Ex02.addOneDArr(b, 10);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++)
				System.out.print(b[i][j] + "\t");
			System.out.println();
		}

	}

}
