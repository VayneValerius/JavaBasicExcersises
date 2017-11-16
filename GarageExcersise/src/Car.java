
public class Car extends Vehicle {

	private int bootSize;

	public Car(String makeOfVehicle, String reg, int numberOfWheels, int maxSpeed, String bodyworkState,
			boolean hasStereo, int bootSize) {
		super(makeOfVehicle, reg, numberOfWheels, maxSpeed, bodyworkState, hasStereo);
		this.bootSize = bootSize;
	}

	public String toString() {
		return super.toString() + " / Boot Size (ft): " + bootSize;
	}

	public int getBootSize() {
		return bootSize;
	}

	public void setBootSize(int bootSize) {
		this.bootSize = bootSize;
	}

}
