package ver06;

import java.util.InputMismatchException;

public class PhoneBookMain {
	public static void main(String[] args) {

		PhoneBookManager manager = PhoneBookManager.getInstandce();

		int select = 0;

		while (true) {

			Menu.showMenu();

			try {
				select = Integer.parseInt(manager.sc.nextLine());

				// 정상 범위는 1~6
				// MenuNum.INSERT ~ MenuNum.EXIT
				if (!(select >= MenuNum.CREATE && select <= MenuNum.EXIT)) {

					BadNumberException e = new BadNumberException("잘못된 메뉴 입력입니다!");
					// 강제적인 예외 발생
					throw e;

				}

			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다^^ 다시 입력해주세요.");
				// manager.sc.nextLine();
				continue;
			} catch (BadNumberException e) {
				System.out.println("잘못된 입력입니다!!");
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다^^ 다시 입력해주세요.");
				// manager.sc.nextLine();
				continue;
			} finally {
//					manager.sc.nextLine();
			}

			break;
		}

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

	}

}
