
public class OfflineExc5 {

	public static void main(String[] args) {
		OfflineExc5 offlineExc = new OfflineExc5();
		System.out.println(offlineExc.endsInLY("Mother Fucker"));
		System.out.println(offlineExc.endsInLY("Muchly"));
	}

	public boolean endsInLY(String input) {
		if (input.endsWith("ly")) {
			return true;
		} else {
			return false;
		}
	}

}
