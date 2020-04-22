package ver03;

/*
Project : ver 0.20
"프로그램 사용자로부터 데이터 입력"
프로그램 사용자로부터 데이터를 입력 받아 클래스의 인스턴스를 생성하는 것이
핵심.
단 반복문을 이용해서 프로그램의 흐름을 계속 유지하도록 한다.
프로그램 종료를 하지 않으면, 다음과 같은 과정이 반복적으로 이루어짐.

키보드로부터 데이터 입력 
↓
입력 받은 데이터로 인스턴스 생성
↓
생성된 인스턴스의 메소드 호출
*/



public class PhoneInfor {
	
	String name;
	String phoneNumber;
	String birthday;
	
	PhoneInfor(String name, String phoneNumber, String birthday){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	PhoneInfor(String name, String phoneNumber){
//		this.name =name;
//		this.phoneNumber = phoneNumber;
//		this.birthday = "회원 정보 없음";
		this(name,phoneNumber,"회원 정보 없음");
	}
	
	void showInfo(){
		System.out.println("성함 :"+this.name);
		System.out.println("전화번호 :"+this.phoneNumber);
		System.out.println("생년월일 :"+this.birthday);
	}
	
	boolean nameIndexCheck(String name) {
		if(this.name.equals(name)) {
			return true;
		}
		else
			return false;
		
	}
	

}
