package ver06;

import java.util.InputMismatchException;

public class PhoneBookMain {
	public static void main(String[] args) {

		PhoneBookManager manager = PhoneBookManager.getInstandce();

		while (true) {

			try {
				
				Menu.showMenu();
				int select = manager.sc.nextInt();
				manager.sc.nextLine();

				switch (select) {
				case MenuNum.CREATE:
					manager.createInfor();
					break;
				case MenuNum.SEARCH:
					manager.showInfor();
					break;
				case MenuNum.EDIT:
					manager.editInfo();
					break;
				case MenuNum.DELETE:
					manager.delteInfo();
					break;
				case MenuNum.SHOWALLDATA:
					manager.showAllData();
					break;
				case MenuNum.EXIT:
					System.out.println("프로그램을 종료합니다.");
					return;
				}
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다^^ 다시 입력해주세요!");
				manager.sc.nextLine(); //continue시 버퍼 안에 남아있는 값들 초기화해주기.
				continue;
				
			}

		}

	}

}
