package ex;

public class OverridingTest {

	public static void main(String[] args) {

		// 다형성 : 상위 클래스 타입의 참조변수에 하위클래스의 인스턴스를 참조.
		Speaker sp = new BaseEnSpeaker();
		// 참조변수 sp는 BaseEnSpeaker 인스턴스의 멤버중
		// speaker가 가지던 멤버만 사용한다.

		sp.showCurrentState();
		
		

		System.out.println("--------------------------------------------------------------");

		BaseEnSpeaker bSpeaker = new BaseEnSpeaker();
		bSpeaker.setVolume(10);
		bSpeaker.setBaseRate(20);

		bSpeaker.showCurrentState();

		System.out.println(bSpeaker);

	}
}
