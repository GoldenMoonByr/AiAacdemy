package ver03;
public class PhoneBookMain {

	public static void main(String[] args) {

		PhoneBookManager manager = new PhoneBookManager();
		PhoneInfor infor; //PhoneInfor�� �ּҰ� ����.
		while (true) {
			manager.addInfo();
			manager.showAllData();
			manager.searchInfo();
			manager.deleteInfo();
		}
		

	}

}