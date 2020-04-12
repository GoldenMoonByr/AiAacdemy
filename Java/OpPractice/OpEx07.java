package op;
//스위치 On/Off 개념과 비슷한 boolean 사용
public class OpEx07 {
	
	public static void main(String[] args) {
		
		boolean power = false;
		
		System.out.println(power);
		
		power = !power; //부정논리 !만으로 true/false 전환 가능
		
		// power의 값이 false에서 true로 바뀐다.
		System.out.println(power);
		
		power = !power; //부정논리 !만으로 true/false 전환 가능
		
		// power의 값이 true에서 false로 바뀐다.
		System.out.println(power);
	}

}
