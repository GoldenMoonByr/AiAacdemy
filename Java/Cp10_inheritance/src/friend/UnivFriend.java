package friend;

public class UnivFriend extends Friend {

	String major; // 친구의 전공
	int grade; // 친구의 학년

	public UnivFriend(String name, String phoneNum, String addr, String major, int grade) {
		super(name, phoneNum, addr);
		this.major = major;
		this.grade = grade;
	}

public void showData() {
		showBasicInfo();
		System.out.println("전 공 :" + major);
		System.out.println("학 년 :" + grade);
	}

}
