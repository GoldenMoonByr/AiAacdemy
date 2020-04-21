package membership;

public class MembershipMain {

	public static void main(String[] args) {

		// 회원 정보 5개를 저장 할 수 있는 배열을 생성
		// Member 타입의 인스턴스의 참조값을 저장하는 메모리 공간
		// Member m1, m2, m3, m4, m5를 만든 것과 같다.
		Member[] members = new Member[5];

		members[0] = new Member("cool", "시원한", "cool@gmail.com"); // Member 타입의 객체(인스턴스) 주소
		members[1] = new Member("hot", "뜨거운", "hot@gmail.com");
		members[2] = new Member("son", "손흥민", "son@gmail.com");
		members[3] = new Member("park", "박지성", "park@gmail.com");
		members[4] = new Member("milksat", "이지송", "milksat@gmail.com");

//		members[0].showInfo();
//		members[1].showInfo();
//		members[2].showInfo();
//		members[3].showInfo();
//		members[4].showInfo();
//		
		// 배열 공간에 아직 선언 되어 있지 않은 정보 같은 경우 nullPointexception 오류가 나옴.

		for (int i = 0; i < members.length; i++) {

			members[i].showInfo();
			System.out.println("----------------------------------");
		}

		Member member = new Member("GoldenMoonByr", " 이민수", "milksat111@gmail.com");

		member.showInfo();
		System.out.println("----------------------------------");

		System.out.println(member); // member.toString() 호출

	}

}
