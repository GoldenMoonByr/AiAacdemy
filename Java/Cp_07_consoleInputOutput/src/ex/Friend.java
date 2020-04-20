package ex;

public class Friend {
	
	String myName;
	
	Friend(String name){
		myName = name;
	}
	
	//object 클래스의 toString() 메서드를 재구성 한다. -> 오버라이딩
	//메서드의 선언부가 원본 메서드의 선언부와 동일해야 한다.
	
	public String toString() {
	  
	return "제 이름은 " + this.myName + "입니다." ;
	}
	//Alt + Shift + S
	//선언부의 정의 부분이 고정되어 있어야 한다.
	//@Override -> 내가 문법 기준을 맞게 사용하게 있는지도 확인 가능.
	
	/*
	 * @Override public String toString() { return "Friend [myName=" + myName + "]";
	 * }
	 */
	
	
	public static void main(String[] agrs) {
		
		Friend f1 = new Friend("손흥민");
		Friend f2 = new Friend("박지성");
		
		System.out.println(f1.toString());
		System.out.println(f1);
		
		System.out.println(f2.toString());
		System.out.println(f2);
		
	}



}
