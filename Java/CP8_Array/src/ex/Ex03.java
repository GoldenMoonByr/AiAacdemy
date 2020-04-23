package ex;

public class Ex03 {

	static void numberChange() {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[] temp = new int[arr.length];
		temp = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + "\t");
			System.out.println();
		}

	}

	public static void main(String[] args) {

		numberChange();

	}

}
