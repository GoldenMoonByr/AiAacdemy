package ver04;

public class PhoneBookMain {
	public static void main(String[] args) {

		PhoneBookManager manager = new PhoneBookManager(100);

		while (true) {
			Menu.showMenu();

			int select = manager.sc.nextInt();
			manager.sc.nextLine();

			switch (select) {
			case 1:
				manager.createInfor();
				break;
			case 2:
				manager.showInfor();
				break;
			case 3:
				manager.editInfo();
				break;
			case 4:
				manager.delteInfo();
				break;
			case 5:
				manager.showAllData();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;

			}
			
		}

	}

}
