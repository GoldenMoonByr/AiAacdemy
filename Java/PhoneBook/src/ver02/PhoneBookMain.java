package ver02;

public class PhoneBookMain {
	public static void main(String[] args) {

		PhonebookManager manager = new PhonebookManager();

		PhoneInfo info = null;

		while (true) {
			info = manager.createInstance();
			info.showInfo();
		}

	}

}
