package ex;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random rand = new Random(System.currentTimeMillis()); //안의 배개면수가 랜덤되는 객체의 다양함,개수를 정해줌.
		for(int i = 0; i<10; i++) {
			//System.out.println(rand.nextBoolean());
			System.out.println(rand.nextInt(45)+1);
			//System.out.println(rand.nextDouble());
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
		}
	}
		
		
}
