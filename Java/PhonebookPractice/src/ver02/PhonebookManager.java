package ver02;

import java.util.Scanner;

public class PhonebookManager {

//	키보드로부터 데이터 입력 
//	↓
//	입력 받은 데이터로 인스턴스 생성
//	↓
//	생성된 인스턴스의 메소드 호출

	Scanner sc = new Scanner(System.in);
	PhoneInfor info = null;

	PhoneInfor makeInstance() {

		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력해주세요.");
		String phoneNumber = sc.nextLine();
		System.out.println("생년월일을 입력해주세요.");
		String birthday = sc.nextLine();

		if (birthday == "" || birthday.trim().isEmpty()) {
			info = new PhoneInfor(name, phoneNumber);
		} else {
			info = new PhoneInfor(name, phoneNumber, birthday);
		}
		return info;
	}

}
