
public class OfflineExc1 {

	// Double the chars of a string

	public static void main(String[] args) {
		OfflineExc1 offlineExc = new OfflineExc1();
		offlineExc.doubleCharFunc("Hello");

		System.out.println(offlineExc.doubleCharFunc("Hello"));
		// TODO Auto-generated method stub

	}

	public String doubleCharFunc(String input) {
		String doubleChar = "";
		for (int i = 0; i < input.length(); i++) {
			doubleChar = doubleChar + input.charAt(i);
			doubleChar = doubleChar + input.charAt(i);
		}
		return doubleChar;
	}

}
