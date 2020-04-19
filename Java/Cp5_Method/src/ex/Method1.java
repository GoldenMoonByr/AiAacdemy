package ex;

public class Method1 {
	public static void main(String[] args) {
		//메서드를 사용하기 위해서는 인스턴스(객체)
		//메서드 코드를 메모리에 로드한다.

		//인스턴스 생성(객체 생성)
		
		MyMath math = new MyMath();
		
		long result =math.add(10, 100);
		
		System.out.println(result);
		
		System.out.println(math.add(2000000, 3000000000L));
		
	}


}

