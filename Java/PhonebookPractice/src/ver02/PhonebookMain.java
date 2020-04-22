package ver02;

public class PhonebookMain {

	public static void main(String[] args) {

		PhonebookManager manager = new PhonebookManager();

		PhoneInfor info = null;

		while (true) {

			info = manager.makeInstance();
			info.showInfo();

		}

	}

}
