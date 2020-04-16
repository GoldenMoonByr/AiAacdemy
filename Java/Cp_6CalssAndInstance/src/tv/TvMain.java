package tv;

public class TvMain {
	
	public static void main(String[] args) {
		//TV인스턴스 생성
		Tv tv  = new Tv();
		System.out.println("-----------------------------------------");
		System.out.println("TV의 속성값");
		System.out.println("TV의 color : " +tv.color);
		System.out.println("TV의 전원 :" +tv.power);
		System.out.println("TV의 채널"+tv.channel);
		
		tv.channel = 11;
		System.out.println("TV의 채널"+tv.channel);
		
		tv.chnnelUp();
		System.out.println("TV의 채널"+tv.channel);
		
	}

}

//인스턴스 화 될 때 메모리에 올라 가기를, 자동 기본값으로 선언되어 올라감을 볼 수 있다.

