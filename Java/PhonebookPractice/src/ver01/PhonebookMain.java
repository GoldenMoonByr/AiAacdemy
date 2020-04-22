package ver01;
//인스턴스를 가질 수 있게 인스턴스를 만들어주고
//PhoneInfor 클래스에서 갖고 있는 틀에 정보를 입력하여 각 인스턴스에 저장,
//PhoneInfor에 선언되어있는 메서드를 사용할 수 있다.

public class PhonebookMain {
	
	public static void main(String[] args) {
		
		PhoneInfor member = new PhoneInfor("손흥민","010-4645-8788","950605");
		member.showInfo();
		//System.out.println(member);
		System.out.println("-----------------------------------------");
		member = new PhoneInfor("박지성","010-4734-0608","890711");  //member변수에 새로운 객체를 생성함으로서 새로운 주소값을 부여.
		member.showInfo();
		//System.out.println(member);				//새로운 주소값이 부여된 것을 알 수 있다.
	}

}
