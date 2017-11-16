import java.util.ArrayList;

public class PaintWizardMain {
	private ArrayList<PaintType> paintTypeList = new ArrayList<PaintType>();
	public static void main(String[] args) {
		PaintWizardMain paintWizard = new PaintWizardMain();
		
		paintWizard.newPaintType("CheapoMax", 10, 20, 19.99);
		paintWizard.newPaintType("Average Joes", 11, 15, 17.99);
		paintWizard.newPaintType("DuluxourousPaints", 20, 10, 25);
		
		paintWizard.totalTinCoverage();
		paintWizard.showPaintTypes();
		paintWizard.cheapestOption(40);
		paintWizard.wastesTheLeast(40);
		
	}
	
	public void newPaintType(String name, int coverage, int litres, double price)
	{
		PaintType paint = new PaintType(name, coverage, litres, price);
		paintTypeList.add(paint);
	}
	
	public String showPaintTypes()
	{
		for (PaintType currentPaintType : paintTypeList)
		{
			System.out.println(currentPaintType.toString());
		}
		return "";
	}
	
	public void totalTinCoverage()
	{
		for (PaintType currentPaintType : paintTypeList)
		{
			int currentPaintTypeCoverage = currentPaintType.getCoverage() * currentPaintType.getLitres();
//			coveragePerTin.add(currentPaintTypeCoverage);
			currentPaintType.setTotalCoverage(currentPaintTypeCoverage);
		}
	}
	
	public void cheapestOption(int roomSize)
	{
		double cheapestOption = 0;
		String tempName = null;
		for (PaintType currentPaintType : paintTypeList)
		{
			double tinsNeeded = Math.ceil(roomSize / currentPaintType.getTotalCoverage());
			double temp = tinsNeeded * currentPaintType.getPrice();
			System.out.println(tinsNeeded);
			
			if(currentPaintType == paintTypeList.get(0))
			{
				cheapestOption = temp;
				tempName = currentPaintType.getName();
			}
			
			if (temp < cheapestOption)
			{
				cheapestOption = temp;
				tempName = currentPaintType.getName();
			}
		}
		System.out.println("The cheapest option for the room size is " + tempName + ".  It will cost £" +cheapestOption);
	}
	
	public void wastesTheLeast(int roomSize)
	{
		double leastWastes = 0;
		String tempName = null;
		for (PaintType currentPaintType : paintTypeList)
		{
			double tinsNeeded = (roomSize / currentPaintType.getTotalCoverage());
			double fullTinsNeeded = Math.ceil(roomSize / currentPaintType.getTotalCoverage());
			
			double tempWaste = fullTinsNeeded - tinsNeeded;
			
			if (currentPaintType == paintTypeList.get(0))
			{
				leastWastes = tempWaste;
				tempName = currentPaintType.getName();
			}
			
			if (tempWaste < leastWastes)
			{
				leastWastes = tempWaste;
				tempName = currentPaintType.getName();
			}
			
			
		}
		
		//System.out.println(leastWastes);
		System.out.println("The option with the least waste is " + tempName);
	}
	
}
