package tv;

public class TvMain2 {
	public static void main(String[] args) {
		
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		
		System.out.println(tv1==tv2);
		
		System.out.println("==================");
		System.out.println("tv1의 체널 : " +  tv1.channel);
		System.out.println("tv2의 체널 : " +  tv2.channel);
		System.out.println("==================");
		
		tv1.channel = 10;
		System.out.println("tv1의chnnel을 10으로 변경");
		System.out.println("tv1의 채널"+tv1.channel);
		tv2.channel = 20;
		System.out.println("tv2의 채널" +tv2.channel);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
