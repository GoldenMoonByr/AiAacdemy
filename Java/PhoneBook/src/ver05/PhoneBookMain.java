package ver05;

public class PhoneBookMain {
	public static void main(String[] args) {

		PhoneBookManager manager = PhoneBookManager.getInstandce();

		while (true) {
			Menu.showMenu();

			int select = manager.sc.nextInt();
			manager.sc.nextLine();

			switch (select) {
			case MenuNum.CREATE:
				manager.createInfor();
				break;
			case  MenuNum.SEARCH:
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

}
