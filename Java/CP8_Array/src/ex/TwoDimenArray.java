package ex;

public class TwoDimenArray {

	public static void main(String[] args) {

		// 2차원 배열 선언 , 생성
		int[][] arr = new int[3][4];

		// arr[행의 위치][1차원 배열의 index]
		// arr[0~2][0~3] 가능.

		System.out.println("2차원 배열의 길이" + arr.length);
		System.out.println("arr[0] 1차원 배열의 길이" + arr[0].length);
		System.out.println("arr[1] 1차원 배열의 길이" + arr[0].length);
		System.out.println("arr[2] 1차원 배열의 길이" + arr[0].length);

		System.out.println();
		System.out.println("------------------------------");
		System.out.println();

		// 2차원 배열의 행의 반복
		for (int i = 0; i < arr.length; i++) {

			// 1차원 배열의 요소 참조 반복
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
				arr[i][j] = i + j;
			}
			System.out.println();
		}
			// 2차원 배열의 행의 반복
			for (int i = 0; i < arr.length; i++) {

				// 1차원 배열의 요소 참조 반복
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");

				}
				System.out.println();
			}
		}
	}


