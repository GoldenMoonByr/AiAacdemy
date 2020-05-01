package ex;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		// List<E> -> ArrayList<E>
		// List<E> : 저장 순서를 가진다. 데이터의 중복 저장 허용.
		// 순서 -> 일괄 처리가 가능하다.(반복적인 동일한 작업을 빠르게 처리할 수 있다)

		// ArrayList 인스턴스 생성 : Integer 타입의 객체만 저장
		// 자바1.7버전 이전
		// ArrayList<Integer> list = new ArrayList<Integer>();
		// 자바1.7버전 이후
		// ArrayList<Integer> list = new ArrayList<>(); // 인스턴스 생성시에 자료형 생략 가능
		// ArrayList는 list를 상속하고 있으므로 , 다형성에 의해 가능하다.
		// List<String>list = new ArrayList<>();
		List<Integer> list = new ArrayList<>();

		// List<E> 정의된 메서드
		// add() :인스턴스 저장
		// remove(index) : 해당 index의 요소를 삭제
		// size() : List 요소의 개수 반환
		// get(index) : 해당 index위치의 요소반환
		// 모든 값은 주소값으로.

		// -> List 클래스에 추상메소드화 되어 있고, ArrayList에서 오버라이딩 해주면서 완성 되어있음

		// 데이터의 저장 => 배열에 순서대로 저장이 되므로 index 0에는 10, 1에는 20....순서로 저장 될 것이다.
		list.add(10); //Auto Boxing => 기본값이 들어가더라도 형태에 맞게 인스턴스(참조값)이 들어간다.
		list.add(new Integer(20));
		list.add(new Integer(30));

		// 데이터의 참조
		System.out.println("저장된 데이터를 확인합니다.");
		// 반복문을 통해서 일괄 참조 가능
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
		
		System.out.println("---------------------------------------------");
		
		//데이터의 삭제
		list.remove(1);
		System.out.println("데이터 삭제 후 데이터를 확인합니다.");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
		
	}

}
