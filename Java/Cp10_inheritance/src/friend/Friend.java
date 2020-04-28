package friend;

/*
 		친구의 정보를 저장하기 위한 클래스
 		상속을 목적으로 기본 클래스 정의 
 		기본 속성과 기능을 구성
 		대학
 		이름, 전번, 주소, 이메일, 전공, 학년
 		고교
 		이름, 전번, 주소, 직장
 		
 		공통적인 부분 : 이름 , 전번, 주소.
 		is a , has  a 관계 구분하여 확인해본다.
 		대학친구 => 친구 , 고교친구 => 친구
 		즉 친구를 상위클래스로.
 */
//추상클래스이므로 abstract 붙여준다.
public abstract class Friend implements Info{
	
	String name;//친구의 이름
	String PhoneNum; //친구의 전화번호
	String addr;//친구의 주소
	
	
	//생성자
	Friend(String name, String PhoneNum,String addr){
		this.name = name;
		this.PhoneNum=PhoneNum;
		this.addr = addr; 
	}

	
	
	void showBasicInfo() {
		System.out.println("이 름 : "+this.name);
		System.out.println("전화번호 : "+this.PhoneNum);
		System.out.println("주소 : "+this.addr);
	}
	
		
	//상속의 목적으로 오버라이딩 할 메서드.
	//기본 데이터와 하위클래스의 데이터를 출력하도록 오버라이딩.
public void showData() { showBasicInfo();}

	//추상 메서드 생성
	//abstract void showData();
	
}