import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> garageList = new ArrayList<Vehicle>();

	public static void main(String[] args) {

		Garage theFeckingGarage = new Garage();

		Car car1 = new Car("Volvo", "BY98 ACF", 4, 111, "Good", true, 10);
		Car car2 = new Car("Ford", "FR12 UIP", 4, 134, "Poor", true, 7);
		Car car3 = new Car("BMW", "DA41 GER", 4, 162, "Mint", true, 4);
		Motorcycle moto1 = new Motorcycle("Suzuki", "PR54 HAG", 2, 158, "Poor", false, false);
		Truck truck1 = new Truck("Leyland", "AB12 CDE", 6, 82, "Average", true, true, true);

		theFeckingGarage.addVehicle(car1);
		theFeckingGarage.addVehicle(car2);
		theFeckingGarage.addVehicle(moto1);
		theFeckingGarage.addVehicle(truck1);
		theFeckingGarage.showGarage();
		theFeckingGarage.removeVehicleByReg("BY98 ACF");
		theFeckingGarage.removeVehicleByType("Truck");
		theFeckingGarage.showGarage();
		theFeckingGarage.repairVehicle("PR54 HAG");
		theFeckingGarage.clearGarage();
		theFeckingGarage.addVehicle(car3);
		theFeckingGarage.showGarage();

	}

	public void showGarage() {
		for (Vehicle currentVehicle : garageList) {
			System.out.println(currentVehicle.toString());
		}
		System.out.println("");
	}

	public void addVehicle(Vehicle vehicle) {
		garageList.add(vehicle);
	}

	public void removeVehicleByType(String type) {
		ArrayList<Vehicle> tempList = new ArrayList<Vehicle>();

		for (Vehicle currentVehicle : garageList) {
			switch (type) {
			case "Car":
				if (currentVehicle instanceof Car == false) {
					// garageList.remove(currentVehicle);
					tempList.add(currentVehicle);
				}
				break;

			case "Motorcycle":
				if (currentVehicle instanceof Motorcycle == false) {
					// garageList.remove(currentVehicle);
					tempList.add(currentVehicle);
				}
				break;

			case "Truck":
				if (currentVehicle instanceof Truck == false) {
					// garageList.remove(currentVehicle);
					tempList.add(currentVehicle);
				}
				break;

			default:
				System.err.println("Not a Vehicle Type");
			}

		}
		garageList = tempList;
	}

	public void removeVehicleByReg(String reg) {
		for (Vehicle currentVehicle : garageList) {
			if (currentVehicle.getReg().equals(reg)) {
				garageList.remove(currentVehicle);
				break;
			}
		}
	}

	public void repairVehicle(String reg) {
		int cost = 0;
		for (Vehicle currentVehicle : garageList) {
			if (currentVehicle.getReg().equals(reg)) {
				if (currentVehicle instanceof Car == true) {
					cost = currentVehicle.getNumberOfWheels() * 60;
				} else if (currentVehicle instanceof Motorcycle == true) {
					cost = currentVehicle.getNumberOfWheels() * 40;
				} else if (currentVehicle instanceof Truck == true) {
					cost = currentVehicle.getNumberOfWheels() * 80;
				}
			}
		}
		System.out.println("Cost of Repair for " + reg + ": £" + cost);
		System.out.println("");
	}

	public void clearGarage() {
		ArrayList<Vehicle> emptyList = new ArrayList<Vehicle>();
		garageList = emptyList;
	}
}