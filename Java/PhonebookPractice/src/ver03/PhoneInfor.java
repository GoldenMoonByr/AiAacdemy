package ver03;

/*Project : ver 0.30

배열을 이용해서 프로그램 사용자가 입력하는 정보가 최대 100개까지 유지되도록 프로그램을 변경. 

아래기능 삽입

저장 : 이름, 전화번호, 생년월일 정보를 대상으로 하는 저장
검색 : 이름을 기준으로 데이터를 찾아서 해당 데이터의 정보를 출력
삭제 : 이름을 기준으로 데이터를 찾아서 해당 데이터를 삭제

데이터 삭제 후 남아있는 데이터 처리는 데이터를 빈 공란이 없이 순차적으로
재정리 2번이 삭제되었다면 3번 이후 데이터들의 주소 값이 -1 처리되어 재저장.*/
 

public class PhoneInfor {
	String name;
	String phoneNumber;
	String birthday;

	PhoneInfor(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}

	PhoneInfor(String name, String phoneNumber) {
//		this.name = name;
//		this.phoneNumber = phoneNumber;
//		this.birthday = "등록 정보 없음";
		this(name, phoneNumber, "등록 정보 없음");
	}

	void showInfo() {
		System.out.println("이 름 :" + this.name);
		System.out.println("번 호 :" + this.phoneNumber);
		System.out.println("생년월일 :" + this.birthday);
	}
}
