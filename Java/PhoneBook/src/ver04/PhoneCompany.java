package ver04;

public class PhoneCompany extends PhoneInfor {

	String company; // 회사이름
	String dept; // 부서이름
	String job; // 직책이름

	PhoneCompany(String name, String phoneNumber, String addr, String email, String company, String dept, String job) {
		super(name, phoneNumber, addr, email);
		this.company = company;
		this.dept = dept;
		this.job = job;
	}

	@Override
	void showAllData() {
		// TODO Auto-generated method stub
		super.showAllData();
		System.out.println("회사 :" + company);
		System.out.println("부서 :" + dept);
		System.out.println("직책 :" + job);

	}

	
}
