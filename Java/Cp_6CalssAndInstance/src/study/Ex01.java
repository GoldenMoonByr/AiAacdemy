package study;

public class Ex01 {
	
	public static void main(String[] args) {
		Ex02 ninst = new Ex02();
		System.out.println("메소드 호출 전"+ninst.getNumber());
		
		simpleMethod(ninst);
		System.out.println("메소드 호출 후"+ninst.getNumber());
		
	}
	
	public static void simpleMethod(Ex02 numb)
	{
		numb.addNum(12);
	}

}
