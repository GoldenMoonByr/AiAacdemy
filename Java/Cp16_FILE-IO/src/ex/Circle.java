package ex;

import java.io.Serializable;

public class Circle implements Serializable {
	
	int xPos;
	int yPos;
	double rad;
	public Circle(int xPos, int yPos, double rad) {
		
		this.xPos = xPos;
		this.yPos = yPos;
		this.rad = rad;
	}
	
	void showCirtcleInfo() {
		System.out.println("xPose :" +xPos+", yPos : "+yPos);
		System.out.println("rad : "+rad);
	}
	
	
	
	

}
