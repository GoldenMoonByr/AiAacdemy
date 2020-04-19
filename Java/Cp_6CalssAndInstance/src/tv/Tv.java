package tv;

public class Tv {

	// Tv의 속성(변수) - > 멤버 변수, 인스턴스 변수

	String color; // Tv 색상 값
	boolean power; // TV의 전원 상태
	int channel; // Tv의 실제 채널 값.

	// Tv의 기능-> 메서드, 클래슴의 멤버;
	// Tv의 전원 키고 / 끄는 경우

	void power() {
//		if (power == true) {
//			power = false;
//		} else {
//			power = true;
//		}
//	
		power = !power;
	}

	// 채널을 올리는
	void chnnelUp() {
		channel = channel + 1;
	}

	// 채널을 내리는
	void chnnelDown() {
		channel--;

	}

	// ! 채널값을 변경하는 : 패널값을 받아서 변경
	void chnnelChange(int ch) {
		channel = ch;
	}

}
