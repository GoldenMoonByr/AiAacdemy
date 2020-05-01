package ver03_2;

public class PhoneBookInfo {

	String name;
	String phoneNumber;
	String addr;
	String birthday;

	PhoneBookInfo(String name, String phoneNumber, String addr, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.addr = addr;
		this.birthday = birthday;
	}

	PhoneBookInfo(String name, String phoneNumber, String addr) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.addr = addr;
		this.birthday = "";
	}

	void showInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("전화번호 : " + this.phoneNumber);
		System.out.println("주소 : " + this.addr);
		System.out.println("생일 : " + this.birthday);

	}

	boolean checkName(String name) {
		boolean checkName = false;
		if (name.equals(this.name)) {
			checkName = true;
		}
		return checkName;

	}

}
