abstract class Vehicle{
	protected String number;
	
	public Vehicle(String number) {
		this.number=number;
	}
	public String getNumber() {
		return number;
	}
	public abstract int calculateCharge();
}

class Car extends Vehicle{
	public Car(String number) {
		super(number);
	}
	public int calculateCharge() {
		return 50;
	}
}

class Bike extends Vehicle{
	public Bike(String number) {
		super(number);
	}
	public int calculateCharge() {
		return 20;
	}
}

class Truck extends Vehicle{
	public Truck(String number) {
		super(number);
	}
	public int calculateCharge() {
		return 100;
	}
}
class ParkingSlot {
    private Vehicle vehicle;

    public boolean isEmpty() {
        return vehicle == null;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle unparkVehicle() {
        Vehicle v = this.vehicle;
        this.vehicle = null;
        return v;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
class ParkingLot {
    private ParkingSlot[] slots;
    private int totalRevenue = 0;

    public ParkingLot(int capacity) {
        slots = new ParkingSlot[capacity];
        for (int i = 0; i < capacity; i++) {
            slots[i] = new ParkingSlot();
        }
    }

    public boolean park(Vehicle vehicle) {
        for (int i = 0; i < slots.length; i++) {
            if (slots[i].isEmpty()) {
                slots[i].parkVehicle(vehicle);
                System.out.println(vehicle.getClass().getSimpleName() + " parked in slot " + i);
                totalRevenue += vehicle.calculateCharge();
                return true;
            }
        }
        System.out.println("No available slot for " + vehicle.getClass().getSimpleName());
        return false;
    }

    public void unpark(String number) {
        for (int i = 0; i < slots.length; i++) {
            Vehicle v = slots[i].getVehicle();
            if (v != null && v.getNumber().equals(number)) {
                slots[i].unparkVehicle();
                System.out.println("Vehicle " + number + " removed from slot " + i);
                return;
            }
        }
        System.out.println("Vehicle " + number + " not found.");
    }

    public void showParkedVehicles() {
        System.out.println("Parked Vehicles:");
        for (int i = 0; i < slots.length; i++) {
            Vehicle v = slots[i].getVehicle();
            if (v != null) {
                System.out.println("Slot " + i + ": " + v.getClass().getSimpleName() + " - " + v.getNumber());
            }
        }
    }

    public int getTotalRevenue() {
        return totalRevenue;
    }
}


public class ParkingLotSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParkingLot lot=new ParkingLot(5);
		lot.park(new Car("KA17AB1234"));
        lot.park(new Bike("KA02XY1111"));
        lot.park(new Truck("KA03ZZ9999"));

        lot.showParkedVehicles();

        lot.unpark("KA17AB1234");

        lot.showParkedVehicles();

        System.out.println("Total Revenue: Rs. " + lot.getTotalRevenue());
	}

}
