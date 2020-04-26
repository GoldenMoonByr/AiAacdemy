package ver03;


/*배열을 이용해서 프로그램 사용자가 입력하는 정보가 최대 100개까지 유지되도록 프로그램을 변경. 

아래기능 삽입

저장 : 이름, 전화번호, 생년월일 정보를 대상으로 하는 저장
검색 : 이름을 기준으로 데이터를 찾아서 해당 데이터의 정보를 출력
삭제 : 이름을 기준으로 데이터를 찾아서 해당 데이터를 삭제

데이터 삭제 후 남아있는 데이터 처리는 데이터를 빈 공란이 없이 순차적으로
재정리 2번이 삭제되었다면 3번 이후 데이터들의 주소 값이 -1 처리되어 재저장.*/
 

import java.util.Scanner;



public class PhonebookManager {

	
	
	Scanner sc = new Scanner(System.in);
	//PhoneInfor info = null;
	PhoneInfor[] pBooks = new PhoneInfor[100];
	int cnt = 0;

	void addInfo(PhoneInfor info) {
		pBooks[cnt] = info;
		cnt++;
	}

	void addInfo() {
		pBooks[cnt] = makeInstance();
		cnt++;
	}
	
	void showAllData(){
		for(int i =0 ;i<cnt;i++) {
			pBooks[i].showInfo();
			System.out.println("-------------------");
		}
	}
	
	int searchIndexNumber(String name) {
		if()
		
	}
	

	
	PhoneInfor makeInstance() {
		PhoneInfor info = null;
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
