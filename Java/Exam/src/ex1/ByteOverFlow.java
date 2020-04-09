package ex1;
//자료형의 표현범위에 따른 출력값 차이와 그러므로 자료형을 일치시켜줘야 하는 이유
public class ByteOverFlow {
	public static void main(String[] args) {
		byte b = 0; //byte => -128 ~ byte ~ 127
		int i = 0; //int => -21억 ~ int ~ 21억
	
		for(int x=0; x<270 ; x++) {
			System.out.print(b++); //행을 띄우지 않고 b와 i값을 비교하기 위해 print를 이용
			System.out.print("\t");
			System.out.println(i++);//반복하여 더해준 후의 값들을 비교하기 위해서 행을 띄어줌 println을 이용.
			
			/*
			int형 과는 달리 byte 형의 경우 127까지 밖에 출력되지 못한다.
			그러므로 127이 넘어간 경우에 부호에 해당하는 값이 변경 되고
			2의 보수에 해당하는 값이 오게 되어, -값들이 순서대로 출력되는 것을 볼 수 있고
			0이 되는 부분에서 또 다시 부호에 해당하는 값이 변경 됨을 알 수 있다.
			*/
		}
	}

}

