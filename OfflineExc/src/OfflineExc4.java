
public class OfflineExc4 {

	public static void main(String[] args) {
		OfflineExc4 offlineExc = new OfflineExc4();
		System.out.println(offlineExc.getNChar("Mother Fucker", 4));
	}

	public String getNChar(String input, int getNum) {
		String firstHalf = "";
		String secondHalf = "";
		int secondHalfStart = input.length() - getNum;
		for (int i = 0; i < getNum; i++) {
			firstHalf = firstHalf + input.charAt(i);
			secondHalf = secondHalf + input.charAt(i + secondHalfStart);
		}
		return firstHalf + secondHalf;
	}
}
