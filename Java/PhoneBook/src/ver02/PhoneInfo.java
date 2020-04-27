package ver02;

public class PhoneInfo {

	// private : 변수의 직접 참조를 맞는다, 정보 은닉.
	private String name; // 대상자의 이름!
	private String phoneNumber; // 대상자의 전화 번호!
	private String birthday; // 대상자의 생년월일

	// 초기화를 위한 생성자 (default 값이므로 다른 package에서 사용 불가.)
	PhoneInfo(String name, String PhoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = PhoneNumber;
		this.birthday = birthday;
	}

	PhoneInfo(String name, String phoneNumber) {
		// this.name = name;
		// this.phoneNumber = PhoneNumber;
		// this(name, phoneNumber, null);
		this(name, phoneNumber, "입력값이 없습니다.");
	}

	void showInfo() {
		System.out.println("이름 : " + this.name); // this의 경우 현재 자신의 인스턴스를 이야기하며 해당 문장에서는 생략해주어도 된다.
		System.out.println("전화번호 : " + this.phoneNumber); // this의 경우 현재 자신의 인스턴스를 이야기하며 해당 문장에서는 생략해주어도 된다.

//		if (this.birthday == null) {
//			System.out.println("생년월일 : 입력값이 없습니다."); // this의 경우 현재 자신의 인스턴스를 이야기하며 해당 문장에서는 생략해주어도 된다.
//		} else {
//			System.out.println("생년월일" + this.birthday);
//		}
		System.out.println("생년월일 : " + this.birthday);
	}

}
