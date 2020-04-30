package ver03_2;

public class PhoneBookMain {

	public static void main(String[] args) {

		PhoneBookManager manager = new PhoneBookManager();

		while (true) {
			System.out.println("1.저장");
			System.out.println("2.검색");
			System.out.println("3.삭제");
			int selectNum = manager.sc.nextInt();

			switch (selectNum) {
			case 1:
				manager.addInfo();
				break;
			case 2:
				manager.searchInfo();
				break;
			case 3:
				manager.deleteInfo();
				break;
			}
		}

	}

}
