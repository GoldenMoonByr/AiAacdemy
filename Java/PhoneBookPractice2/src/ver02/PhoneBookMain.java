package ver02;

public class PhoneBookMain {

	public static void main(String[] args) {

		PhoneBookManager manager = new PhoneBookManager();
		PhoneInfor infor; //PhoneInfor�� �ּҰ� ����.
		while (true) {
			infor = manager.makeInstance(); //���ϵǾ��� ������ �ּҰ��� ����.
			infor.showInfo();
		}

	}

}
