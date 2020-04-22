package ver01;

public class PhonebookMain {

	public static void main(String[] args) {

		PhoneInfo info = new PhoneInfo("손흥민", "010-4567-8877", "1987.07-14");

		info.showInfo();
		
		System.out.println("--------------------------------------");
		info = new PhoneInfo("박지성" , "010-4655-7854");       //info의 주소에 서로운 주소값을.
		info.showInfo();
		
		
		}

}
