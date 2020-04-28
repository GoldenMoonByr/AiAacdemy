package friend;

public  class CompanyFriend extends Friend {

	String dept;
	String job;
	CompanyFriend(String name, String PhoneNum, String addr,String dept, String job) {
		super(name, PhoneNum, addr);
		this.dept = dept;
		this.job = job;
		// TODO Auto-generated constructor stub
	}
	
	public void showData() {
		super.showBasicInfo();
		System.out.println("부서 :" +this.dept);
		System.out.println("직책 :"+this.job);
	}
	

}
