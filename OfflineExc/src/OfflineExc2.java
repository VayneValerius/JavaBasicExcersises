
public class OfflineExc2 {

	public static void main(String[] args) {
		OfflineExc2 offlineExc = new OfflineExc2();
		// TODO Auto-generated method stub
		System.out.println(offlineExc.sandwhichFillerFinder("breadchickenhambread"));
	}

	public String sandwhichFillerFinder(String input) {
		int getFirstRef = input.indexOf("bread") + 5;
		int getLastRef = input.lastIndexOf("bread");
		String substr = input.substring(getFirstRef, getLastRef);

		return substr;
	}

}
