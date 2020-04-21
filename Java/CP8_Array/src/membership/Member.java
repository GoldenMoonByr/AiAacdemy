package membership;

//회원 정보를 저장하기 위한 클래스 생성
//이메일, 전화번호, 이름 따로따로가 아닌 한 번에 저장하기 위한 클래스

public class Member {
	// 각 인스터스마다 고정되는 값이 아니고, 인스턴스마다 변화하는 값이므로
	// static을 붙여줘서는 안 된다.
	String memberId;
	String memberName;
	String memberEmail;

	// 생성자 생성(초기화 메서드 , 인스턴스 변수들을초기화)
	public Member(String memberId, String memberName, String memberEmail) {
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberEmail = memberEmail;
	}

	// 기능(메서드) 생성. 메서드명은 최대한 직관적으로.
	void showInfo() {
		System.out.println("아이디 : " + this.memberId);
		System.out.println("이름 :" + this.memberName);
		System.out.println("이메일 : " + this.memberEmail);

	}

	@Override
	// toString 미선언 시 @의 해쉬코드 값이 출력됨. 
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", memberEmail=" + memberEmail + "]";
	}

}
