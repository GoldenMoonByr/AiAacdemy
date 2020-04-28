package scm;

public class NoneInstance {




static class Box {
	public void wrapBox() {
		System.out.println("simple wrap");
	}
}

static class PaperBox extends Box {
	public void wrapBox() {
		System.out.println("paper wrap");
	}
}

static class GoldPaperBox extends PaperBox {
	public void wrapBox() {
		System.out.println("gold wrap");
	}

}
	public static void wrapBox(Box box) {
		box.wrapBox();
	}
}
