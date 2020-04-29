package ver05_2;
//PhoneInfor 클래스를 상속해서 새로운 클래스를 정의해주자.
public class PhoneUnivInfor extends PhoneInfor{
	
	String major;//친구의 전공
	String grade;//친구의 학년
	PhoneUnivInfor(String name, String phoneNumber, String addr, String email,  String major, String grade){
		super(name,phoneNumber,addr,email);
		this.major = major;
		this.grade = grade;
	}

	@Override
	public void showAllData() {	
		super.showBasicInfo();
		System.out.println("전공 :"+this.major);
		System.out.println("학년" + this.grade);
	}

}
