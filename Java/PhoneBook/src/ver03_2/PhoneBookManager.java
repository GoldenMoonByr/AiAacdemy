package ver03_2;

import java.util.Scanner;

public class PhoneBookManager {
	// 정보 저장에 필요한 배열 생성.
	PhoneBookInfo[] pBooks;
	// 배열에 어떤 정보를 저장해야 하며
	// 그 정보 틀을 PhoneBookInfo에서 갖고 있고,
	// 그 정보 틀을 이용해서 사용자의 요구에 맞는 기능을
	// 수행하는 클래스 이므로, 그 틀을 이용하기 위한
	// PhoneBookInfo 타입의 참조 변수를 선언해준다.
	PhoneBookInfo info;
	// 배열에 하나씩 저장할 떄 필요한 카운트
	int cnt;
	// 정보를 저장할 떄 사용자에게 그 정보들을 입력받기 위한
	// 하나의 기능을 수행한다.
	Scanner sc;

	// 최대한 초기화는 생성자에서.
	PhoneBookManager() {
		pBooks = new PhoneBookInfo[100];
		info = null;
		cnt = 0;
		sc = new Scanner(System.in);
	}

	// 배열에 저장을 하나씩 해주는 저장 기능.
	void addInfo(PhoneBookInfo info) {
		pBooks[cnt] = info;
		cnt++;
	}

	void addInfo() {
		pBooks[cnt] = createInstance();
		cnt++;
	}

	PhoneBookInfo createInstance() {
		String name;
		String phoneNumber;
		String addr;
		String birthday;

		sc.nextLine();
		System.out.println("이름을 입력해주세요.");
		name = sc.nextLine();
		System.out.println("전화 번호를 입력해주세요");
		phoneNumber = sc.nextLine();
		System.out.println("주소를 입력해주세요.");
		addr = sc.nextLine();
		System.out.println("생일을 입력해주세요.");
		birthday = sc.nextLine();

		if (birthday.equals("") || birthday.trim().isEmpty()) {
			return info = new PhoneBookInfo(name, phoneNumber, addr);
		} else {
			return info = new PhoneBookInfo(name, phoneNumber, addr, birthday);
		}

	}

	// 검색하는 기능.
	void searchInfo() {
		boolean checkName = false;
		int checkNameIndex=0;
		sc.nextLine();
		System.out.println("검색하시고자 하는 분의 이름을 입력해주세요.");
		String name = sc.nextLine();
		
		
		for (int i = 0; i < cnt; i++) {
			if (pBooks[i].checkName(name)) {
				checkName = true;
				checkNameIndex = i;
				break;
			}
		}
		
		if (checkName == true) {
			pBooks[checkNameIndex].showInfo();
		} else
			System.out.println("찾으시는 정보가 없습니다.");

	}
	
	//삭제하는 기능.
	void deleteInfo() {
		
		boolean checkName = false;
		int checkNameIndex=0;
		sc.nextLine();
		System.out.println("삭제하시고자 하는 분의 이름을 입력해주세요.");
		String name = sc.nextLine();
		
		for (int i = 0; i < cnt; i++) {
			if (pBooks[i].checkName(name)) {
				checkName = true;
				checkNameIndex = i;
				break;
			}
		}
		if (checkName == false) {
			System.out.println("찾으시는 정보가 없습니다!");
		
	}
		else {
			
			for(int i = checkNameIndex; i<cnt;i++) {
				pBooks[i] = pBooks[i+1];
			}
			System.out.println("삭제되었습니다.");
			cnt--;
		}

}
	
	
}
