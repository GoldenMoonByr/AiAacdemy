package ex;

class Car {
	int gasolinegauge;
	
	Car(int gasolinegause){
		this.gasolinegauge = gasolinegauge;
	}
}

class HybridCar extends Car {
		int electronicGauge;
	
	HybridCar(int gasolinegauge , int electronicGauge){
	super(gasolinegauge);
	this.electronicGauge = gasolinegauge;
	}
	
}

class HybridWaterCar extends HybridCar {
	int waterGauge;
	
	HybridWaterCar(int gasolinegauge ,int electronicGauge,int waterGuage){
		super(gasolinegauge,electronicGauge);
		this.waterGauge = waterGuage;
	}
	

public void showCurrentGauge() {
System.out.println("잔여 가솔린 :" + gasolinegauge);
System.out.println("잔여 가솔린 :" + electronicGauge);
System.out.println("잔여 가솔린 :" + waterGauge);
}
}
