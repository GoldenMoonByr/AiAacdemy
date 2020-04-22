package ver03;

public class PhonebookMain {

	public static void main(String[] args) {

		PhonebookManager manager = new PhonebookManager();

		PhoneInfor info = null;

		while (true) {

			info = manager.makeInstance();
			manager.addInfo(info);
			manager.showAllData();
		}

	}

}
