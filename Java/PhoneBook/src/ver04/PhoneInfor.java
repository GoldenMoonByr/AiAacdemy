package ver04;

public class PhoneInfor {

	String name;// 저장하고자 하는 친구의 이름
	String phoneNumber;// 저장하고자 하는 친구의 전화번호
	String addr;// 저장하고자 하는 친구의 주소
	String email;// 저장하고자 하는 친구의 이메일

	// 인스턴스 변수들의 초기화
	// 인스턴스 생성의 목적이 없다.=> 상속 받아 쓸 수 있는 기본 데이터를 저장하는 기능이다.
	PhoneInfor(String name, String phoneNumber, String addr, String email) {

		this.name = name;
		this.phoneNumber = phoneNumber;
		this.addr = addr;
		this.email = email;

	}

	// 기본 정보 출력
	void showBasicInfo() {
		System.out.println("프로필 이름 : " + this.name);
		System.out.println("전화번호 : " + this.phoneNumber);
		System.out.println("주소 : " + this.email);
		System.out.println("이메일 : " + this.email);

	}

	// 전체 정보 출력
	void showAllData() {
		showBasicInfo();
		// 상속 후 오버라이딩을 통해 재구성
	}

}
