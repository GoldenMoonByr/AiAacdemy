package ver05_2;

public class PhoneCafeInfo extends PhoneInfor {

	String cafeName;
	String nickName;

	PhoneCafeInfo(String name, String phoneNumber, String addr, String email, String cafeName, String nickName) {
		super(name, phoneNumber, addr, email);
		this.cafeName = cafeName;
		this.nickName = nickName;

	}

	@Override
	public void showAllData() {
		//super.showAllData();
		super.showBasicInfo();
		System.out.println("카페명 :" + this.cafeName);
		System.out.println("닉네임 :" + this.nickName);
	}

}
