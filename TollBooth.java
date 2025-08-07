abstract class Vehicle{
	private String plateNumber;
	private int stayDuration;
	
	public Vehicle(String plateNumber,int stayDuration) {
		this.plateNumber= plateNumber;
		this.stayDuration=stayDuration;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public int getStayDuration() {
		return stayDuration;
	}
	public abstract double tollAmount();
	
	public void displayDetails() {
		System.out.println("plate no: "+plateNumber+" Stay: "+stayDuration+" Toll : "+tollAmount());
	}
}

class Bike extends Vehicle{
	public Bike(String plateNumber,int stayDuration) {
		super(plateNumber,stayDuration);
	}
	public double tollAmount() {
		return 20*getStayDuration();
	}
}

class Car extends Vehicle{
	public Car(String plateNumber,int stayDuration) {
		super(plateNumber,stayDuration);
	}
	public double tollAmount() {
		return 50*getStayDuration();
	}
}

class Truck extends Vehicle{
	public Truck(String plateNumber,int stayDuration) {
		super(plateNumber,stayDuration);
	}
	public double tollAmount() {
		return 100*getStayDuration();
	}
}

public class TollBooth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] vehicle=new Vehicle[3];
		vehicle[0]=new Bike("KA01",5);
		vehicle[1]=new Car("KA02",3);
		vehicle[2]=new Truck("KA03",7);
		
		double totalAmount=0;
		System.out.println("\n-----Toll Booth Summery-------");
		for(Vehicle n:vehicle) {
			n.displayDetails();
			totalAmount += n.tollAmount();
		}
		System.out.println("\nTotal Toll amount---> "+totalAmount);
		
	}
}
