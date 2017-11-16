
public class Motorcycle extends Vehicle {

	private boolean hasBackBox;

	public Motorcycle(String makeOfVehicle, String reg, int numberOfWheels, int maxSpeed, String bodyworkState,
			boolean hasStereo, boolean hasBackBox) {
		super(makeOfVehicle, reg, numberOfWheels, maxSpeed, bodyworkState, hasStereo);
		this.hasBackBox = hasBackBox;
	}

	public String toString() {
		return super.toString() + " / Has a Back box?: " + hasBackBox;
	}

	public boolean isHasBackBox() {
		return hasBackBox;
	}

	public void setHasBackBox(boolean hasBackBox) {
		this.hasBackBox = hasBackBox;
	}

}
