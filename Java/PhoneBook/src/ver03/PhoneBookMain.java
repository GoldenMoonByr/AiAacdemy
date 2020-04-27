package ver03;

import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {

		PhonebookManager manager = new PhonebookManager();
		PhoneInfo info = null;
		Scanner sc = new Scanner(System.in);

		while (true) {
			Menu.showMenu();
//			System.out.println("===================");
//			System.out.println("메뉴를 입력해주세요.");
//			System.out.println("   1.  대상자 정보 입력");
//			System.out.println("   2.  대상자 정보 검색");
//			System.out.println("   3.  대상자 정보 삭제");
//			System.out.println("   4.  대상자 정보 전체 보기");
//			System.out.println("   5.  프로그램 종료");
//			System.out.println("===================");

			int selectNum = sc.nextInt();

			sc.nextLine();

			switch (selectNum) {
			case 1:
				info = manager.createInstance();
				manager.addInfo(info);
				// manager.addInfo();
				break;
			case 2:
				manager.searchInfo();
				break;
			case 3:
				manager.deleteInfo();
				break;
			case 4:
				manager.showAllData();
				break;
			case 5:
				// return;
				System.exit(0);
			}

//			// 사용자의 입력 데이터를 인스턴스 생성
//			info = manager.createInstance();
//			// 정보를 배열에 저장
//			manager.addInfo(info);
//			// 전체 리스트 출력
//			manager.showAllData();
//			// 이름으로 검색
//			manager.searchInfo();
//			// 이름으로 검색 후 삭제
//			manager.deleteInfo();
//			// 최종적으로 저장중인 데이터 출력
//			manager.showAllData();

		}

	}

}
