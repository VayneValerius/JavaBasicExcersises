
public class PaintType {
	private String name;
	private int coverage, litres;
	private double price, totalCoverage;

	public PaintType(String name, int coverage, int litres, double price) {
		super();
		this.name = name;
		this.coverage = coverage;
		this.litres = litres;
		this.price = price;
	}
	
	public String toString()
	{
		return "The Paint Type is " + name + ". The Coverage is " + coverage + "m2. It contains " + litres + "l.  It costs £" + price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCoverage() {
		return coverage;
	}

	public void setCoverage(int coverage) {
		this.coverage = coverage;
	}

	public int getLitres() {
		return litres;
	}

	public void setLitres(int litres) {
		this.litres = litres;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTotalCoverage() {
		return totalCoverage;
	}

	public void setTotalCoverage(double totalCoverage) {
		this.totalCoverage = totalCoverage;
	}
	
	
}
