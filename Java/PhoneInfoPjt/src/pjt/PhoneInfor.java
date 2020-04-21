package pjt;

public class PhoneInfor {

	String name;
	String phoneNumber;
	String birthday = "정보 없음";

	PhoneInfor(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}

	PhoneInfor(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	void showInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("전화번호 : " + this.phoneNumber);
		System.out.println("생년월일: " + this.birthday);

	}

}
