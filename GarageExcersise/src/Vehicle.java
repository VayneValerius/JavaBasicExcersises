
public abstract class Vehicle {

	private String makeOfVehicle;
	private String reg;
	private int numberOfWheels;
	private int maxSpeed;
	private String bodyworkState;
	private boolean hasStereo;

	public Vehicle(String makeOfVehicle, String reg, int numberOfWheels, int maxSpeed, String bodyworkState,
			boolean hasStereo) {
		this.makeOfVehicle = makeOfVehicle;
		this.reg = reg;
		this.numberOfWheels = numberOfWheels;
		this.maxSpeed = maxSpeed;
		this.bodyworkState = bodyworkState;
		this.hasStereo = hasStereo;
	}

	public String toString() {
		return "Make: " + makeOfVehicle + " / reg: " + reg + " / Number Of Wheels: " + numberOfWheels + " / Max Speed: "
				+ maxSpeed + " / Bodywork Status: " + bodyworkState + " / Has Stereo?: " + hasStereo;
	}

	public int getBill() {
		return numberOfWheels * 40;
	}

	public String getMakeOfVehicle() {
		return makeOfVehicle;
	}

	public void setMakeOfVehicle(String makeOfVehicle) {
		this.makeOfVehicle = makeOfVehicle;
	}

	public String getReg() {
		return reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getBodyworkState() {
		return bodyworkState;
	}

	public void setBodyworkState(String bodyworkState) {
		this.bodyworkState = bodyworkState;
	}

	public boolean isHasStereo() {
		return hasStereo;
	}

	public void setHasStereo(boolean hasStereo) {
		this.hasStereo = hasStereo;
	}

}
