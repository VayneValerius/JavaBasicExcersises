
public class Truck extends Vehicle {

	boolean hasLivingSpace;
	boolean hasDetachableTrailer;

	public Truck(String makeOfVehicle, String reg, int numberOfWheels, int maxSpeed, String bodyworkState,
			boolean hasStereo, boolean hasLivingSpace, boolean hasDetachableTrailer) {
		super(makeOfVehicle, reg, numberOfWheels, maxSpeed, bodyworkState, hasStereo);
		this.hasLivingSpace = hasLivingSpace;
		this.hasDetachableTrailer = hasDetachableTrailer;

	}

	public String toString() {
		return super.toString() + " / Has Living Space?: " + hasLivingSpace + " / Has Detachable Trailer?: "
				+ hasDetachableTrailer;
	}

	public boolean isHasLivingSpace() {
		return hasLivingSpace;
	}

	public void setHasLivingSpace(boolean hasLivingSpace) {
		this.hasLivingSpace = hasLivingSpace;
	}

	public boolean isHasDetachableTrailer() {
		return hasDetachableTrailer;
	}

	public void setHasDetachableTrailer(boolean hasDetachableTrailer) {
		this.hasDetachableTrailer = hasDetachableTrailer;
	}

}
