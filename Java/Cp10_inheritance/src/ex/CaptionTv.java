package ex;

public class CaptionTv extends Tv {
	String text;

	void caption() {
		System.out.println("자막출력"+text);
	}

	void display() {
		super.display();
		caption();
	}

}
