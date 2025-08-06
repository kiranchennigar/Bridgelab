class Car{
	int speed;
	double fuel;
	double distance;
	
	Car(int speed, double fuel){
		this.speed=speed;
		this.fuel=fuel;
		this.distance=0;
	}
	public void drive(int hours) {
		double possibleDistance= speed*hours;
		double fuelNeeded = possibleDistance/15;
		
		if(fuel >= fuelNeeded) {
			distance=distance+possibleDistance;
			fuel=fuel-fuelNeeded;
			System.out.println("car drove "+ possibleDistance +" km.");
		}
		else {
			double actualDistance=fuel*15;
			distance += actualDistance;
			fuel=0;
			System.out.println("Car drove only "+ actualDistance + "km due to low fuel.");
		}
	}
	public void printStatus() {
		System.out.println("Distance : "+ distance + "km,Fuel: "+fuel+" L");
	}
}

class ElectricCar extends Car{
	double battery;
	
	ElectricCar(int speed,double battery){
		super(speed,0);
		this.battery=battery;
	}
	public void drive(int hours) {
		double possibleDistance=speed*hours;
		double batteryNeeded=possibleDistance/2;
		
		if(battery >= batteryNeeded) {
			distance += possibleDistance;
			battery -= batteryNeeded;
			System.out.println("Electric car can drove "+ possibleDistance + " km");
		}
		else {
			double actualDistance=battery*2;
			distance += actualDistance;
			battery=0;
			System.out.println("Electric car drove only "+ actualDistance + "km due to low battery.");
		}
	}
	public void printStatus() {
		System.out.println("Distance : "+ distance + "km,Battery: "+battery+" %");
	}
}

public class CarSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car petrolCar=new Car(60,10);
		ElectricCar ecar=new ElectricCar(80,50);
		
		System.out.println("petrol car");
		petrolCar.drive(2);
		petrolCar.printStatus();
		
		System.out.println("Electric car");
		ecar.drive(2);
		ecar.printStatus();

	}
}