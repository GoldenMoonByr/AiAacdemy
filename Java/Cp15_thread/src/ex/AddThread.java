package ex;

public class AddThread extends Thread {
	Sum sumInst;
	int start;
	int end;

	AddThread(Sum sum, int s, int e) {
		sumInst = sum;
		start = s;
		end = e;

	}

	public void run() {
		for (int i = start; i <= end; i++) {
			sumInst.addNum(i);
		}

	}
}
