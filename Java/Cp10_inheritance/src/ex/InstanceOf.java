package ex;

public class InstanceOf {

	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
//		box box1 = new Box();
//		box box2 = new PaperBox();
//		box box3 = new GoldPaperBox();
//		가능 그 이유는 19번 줄
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}


	public static void wrapBox(Box box) //이쪽에서 Box(리모콘)의 형태로 자동 형변환 되므로.
	{
		box.wrap();
	}
	
}

class Box {
	public void wrap() {
		System.out.println("simple wrap");
	}
}

class PaperBox extends Box {
	public void wrap() {
		System.out.println("PaperBox");
	}
}

class GoldPaperBox extends PaperBox {
	public void wrap() {
		System.out.println("gold wrap");
	}
}
