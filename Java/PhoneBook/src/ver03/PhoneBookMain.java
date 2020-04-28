package ver03;

import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {

		PhonebookManager manager = new PhonebookManager();
		PhoneInfo info = null;
		Scanner sc = new Scanner(System.in);

		while (true) {
			Menu.showMenu();

			int selectNum = sc.nextInt();

			sc.nextLine();

			switch (selectNum) {
			case 1:
				// 사용자의 입력 데이터를 인스턴스 생성
				info = manager.createInstance();
				// 정보를 배열에 저장
				manager.addInfo(info);
				// manager.addInfo();
				break;

			// 이름으로 검색
//				manager.searchInfo();
			case 2:
				manager.searchInfo();
				break;

			// 이름으로 검색하여 삭제.
			case 3:
				manager.deleteInfo();
				break;

			// 전체 리스트 출력
			case 4:
				manager.showAllData();
				break;
			case 5:
				// return;
				System.exit(0);
			}

		}

	}

}
