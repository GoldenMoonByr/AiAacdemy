package ver05_2;

public class PhoneBookMain {
	public static void main(String[] args) {

		PhoneBookManager manager = PhoneBookManager.getInstance();

		while (true) {
			Menu.showMenu();

			int select = manager.sc.nextInt();
			manager.sc.nextLine();

			switch (select) {
			case MenuNum.INSERT:
				manager.createInfor();
				break;
			case  MenuNum.SEARCH:
				manager.showInfor();
				break;
			case  MenuNum.EDIT:
				manager.editInfo();
				break;
			case  MenuNum.DELETE:
				manager.delteInfo();
				break;
			case  MenuNum.SHOWALLDATA:
				manager.showAllData();
				break;
			case MenuNum.EXIT:
				System.out.println("프로그램을 종료합니다.");
				return;

			}
			
		}

	}

}
