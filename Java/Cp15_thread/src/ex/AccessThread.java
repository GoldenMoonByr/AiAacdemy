package ex;

public class AccessThread extends Thread {

	TwoNum twoNum;
	
	AccessThread(TwoNum twoNum) {
			this.twoNum  = twoNum;
	}
	
	public void run() {
		twoNum.addOneNum1();
		twoNum.addTwoNum1();
		twoNum.addOneNum2();
		twoNum.addtwoNum2();
		
		
	}
}
