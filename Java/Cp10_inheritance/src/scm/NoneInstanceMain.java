package scm;

public class NoneInstanceMain {

	
	public static void main(String[] args) {
		
		
		Box box1 = new Box();
		Box box2 = new PaperBox();
		Box box3 = new GoldPaperBox();

		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}

	
}
