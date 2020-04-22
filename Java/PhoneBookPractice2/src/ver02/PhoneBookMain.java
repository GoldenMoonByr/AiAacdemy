package ver02;

public class PhoneBookMain {

	public static void main(String[] args) {

		PhoneBookManager manager = new PhoneBookManager();
		PhoneInfor infor; //PhoneInfor의 주소값 선언.
		while (true) {
			infor = manager.makeInstance(); //리턴되어져 나오는 주소값을 받음.
			infor.showInfo();
		}

	}

}
