package ex;

public class InstanceArray {
	public static void main(String[] args) {

		// 참조형(String) 변수를 저장하는 배열 생성
		String[] strArray = new String[3];

		// strArray[0] : 배열의 첫번쨰 참조변수
		strArray[0] = "JAVA"; // strArray[0].toString() , strArray[0].length() 가능.

		strArray[1] = "JS";

		strArray[2] = "Python";

		// String 타입의 참조변수 - > strArray[0]
		System.out.println("문자열의 길이 : " + strArray[0].length());
		System.out.println("문자열의 길이 : " + strArray[1].length());
		System.out.println("문자열의 길이 : " + strArray[2].length());

		// 배열의 순차적 참조 : 반복문을 이용해서 순차 참조가능
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}

		
		
	}

}
