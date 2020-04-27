package ver04;

public class PhoneCafeInfo extends PhoneInfor {

	String cafeName;
	String nickName;

	PhoneCafeInfo(String name, String phoneNumber, String addr, String email, String cafeName, String nickName) {
		super(name, phoneNumber, addr, email);
		this.cafeName = cafeName;
		this.nickName = nickName;

	}

	@Override
	void showAllData() {
		super.showAllData();
		System.out.println("카페명 :" + this.cafeName);
		System.out.println("닉네임 :" + this.nickName);
	}

}
