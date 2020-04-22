package ver03;

import java.util.Scanner;

/*
Project : ver 0.30
배열을 이용해서 프로그램 사용자가 입력하는 정보가 최대 100개까지 유지되도록 프로그램을 변경. 
아래기능 삽입
저장 : 이름, 전화번호, 생년월일 정보를 대상으로 하는 저장
검색 : 이름을 기준으로 데이터를 찾아서 해당 데이터의 정보를 출력
삭제 : 이름을 기준으로 데이터를 찾아서 해당 데이터를 삭제
데이터 삭제 후 남아있는 데이터 처리는 데이터를 빈 공란이 없이 순차적으로
재정리 2번이 삭제되었다면 3번 이후 데이터들의 주소 값이 -1 처리되어 재저장.
*/

public class PhoneBookManager {
	Scanner sc = new Scanner(System.in);
	PhoneInfor infor = null;
	// PhoneInfor 형의 infor를 사용하기 위한 초기화.
	PhoneInfor[] members = new PhoneInfor[100];
	int cn = 0;

	// 각 배열 주소에 각 객체 생성
	void addInfo() {
		members[cn] = makeInstance();
		cn++;
	}

	// 저장된 배열 인덱스 번호로 호줄
	// toString 오버라이딩해서 사용하거나
	// PhoneInfor의 인스턴스메소드 사용
	void showAllData() {
		for (int i = 0; i < cn; i++) {
			members[i].showInfo();
			System.out.println("--------------------");
		}

	}

	int searchIndex(String name) {

		int indexNum = -1;

		for (int i = 0; i < cn; i++) {
			if (members[i].nameIndexCheck(name)) {
				indexNum = i;
				break;
			}
		}
		return indexNum;
	}

	void searchInfo() {
		int searchNameIndex = -1;
		System.out.println("검색하고자 하는 이름을 입력해주세요.");
		String name = sc.nextLine();
		searchNameIndex = searchIndex(name);

		if (searchNameIndex < 0) {
			System.out.println("회원정보가 없습니다.");
		} else {

			members[searchNameIndex].showInfo();

		}
		
	}
		
	void deleteInfo() {
		int searchNameIndex ;
		System.out.println("삭제하고자 하는 이름을 입력해주세요.");
		String name = sc.nextLine();
		searchNameIndex = searchIndex(name);
		
		if (searchNameIndex < 0) {
			System.out.println("회원정보가 없습니다.");
		} else {

			for(int i=searchNameIndex; i<cn-1 ; i++) {
				members[i] = members[i+1];
			}
			
			cn--;
			
			System.out.println(members[searchNameIndex].name+"님의 정보를 삭제했습니다.");

		}
		
		
	}

	

	PhoneInfor makeInstance() {
		System.out.println("성함을 입력해주세요. :");
		String name = sc.nextLine();
		System.out.println("전화 번호를 입력해주세요. :");
		String phoneNumber = sc.nextLine();
		System.out.println("생년월일을 입력해주세요. :");
		String birthday = sc.nextLine();

		// birthday 입력 유무에 따라 다른 생성자들 넣기 위한 조건문
		// .trim=>양끝 공백 제거 , .isEmpty()=>공백인지 확인(boolean값)
		if (birthday == "" || birthday.trim().isEmpty()) {
			infor = new PhoneInfor(name, phoneNumber);
		} else {
			infor = new PhoneInfor(name, phoneNumber, birthday);
		}

		return infor;

	}

}
