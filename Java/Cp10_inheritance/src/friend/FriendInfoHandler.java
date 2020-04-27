package friend;

import java.util.Scanner;

public class FriendInfoHandler {

	// Friend 타입의 정보를 저장할 배열을 가진다.
	// Friend 타입의 정보를 저장하는 기능.
	// 친구 기본 정보 출력 기능
	// 친구 상제 정보 출력 기능

	Scanner kb;
	private Friend[] myFriends; // Friend 타입의 배열 선언
	private int numOfFriend; // 저장된 친구의 정보 개수

	// 초기화 : 저장공간(사이즈) 크기를 받아서 배열 생성
	FriendInfoHandler(int num) {
		myFriends = new Friend[num];
		numOfFriend = 0;
		kb = new Scanner(System.in);
	}

	// 친구정보를 저장하는 기능
	// 1. 배열에 저장하는 기능
	// 2. 사용자에게 데이터를 받아 사용자 요청에 맞는 인스턴스를 생성.

	// 1. 배열에 저장하는 기능
	void addFriendInfo(Friend f) {
		// 배열에 저장
		myFriends[numOfFriend++] = f;
		// numOfFriend++;
	}
	


	// 2. 사용자에게 데이터를 받아 사용자 요청에 맞는 인스턴스를 생성
	// HighFriend / UnivFriend
	void addFriend(int choice) {

		// 기본정보 받기
		System.out.println("이름을 입력해주세요.");
		String name = kb.nextLine();
		System.out.println("전화번호를 입력해주세요.");
		String phoneNum = kb.nextLine();
		System.out.println("주소를 입력해주세요.");
		String addr = kb.nextLine();

		Friend friend = null;

		// 1일때 정보 받기
		if (choice == 1) {
			System.out.println("직업을 입력해주세요.");
			String work = kb.nextLine();
			// HighFriend 인스턴스 생성
			friend = new HighFriend(name, phoneNum, addr, work);

		}
		// 2일때 정보 받기
		else {
			System.out.println("전공을 입력해주세요.");
			String major = kb.nextLine();
			System.out.println("학년을 숫자로 입력해주세요.");
			String grade = kb.nextLine();

			// grade를 String이 아닌 int형으로 받았을 때,
			// Integer.parseInt(grade); String => int
			// 문자열을 받아서 정수형 데이터로 반환해주는 static 메소드

			// UnivFriend 인스턴스 생성
			friend = new UnivFriend(name, phoneNum, addr, major, Integer.parseInt(grade));

		}

		// addFriendInfo(Friend f) 호출

		addFriendInfo(friend);

	}

	// 친구정보의 기본 정보 출력 기능
	void showAllSimpleData() {
		System.out.println("=========친구의 기본정보를 출력합니다.=========");
		for (int i = 0; i < numOfFriend; i++) {
			myFriends[i].showBasicInfo();
			System.out.println("======================================");
		}

	}

	// 친구 정보 상제 정보 출력 기능
	void showAllData() {
		System.out.println("=========친구의 상세정보를 출력합니다.=========");
		for (int i = 0; i < numOfFriend; i++) {
			myFriends[i].showData();
			System.out.println("=======================================");

		}

	}

}
