
public class OfflineExc3 {

	public static void main(String[] args) {
		OfflineExc3 offlineExc = new OfflineExc3();
		// TODO Auto-generated method stub

		System.out.println(offlineExc.evenlySpaced(6, 10, 2));

	}

	public boolean evenlySpaced(int num1, int num2, int num3) {
		int[] numberList = new int[] { num1, num2, num3 };

		int largestNumber = Integer.max(Integer.max(num1, num2), num3);
		int smallestNumber = Integer.min(Integer.min(num1, num2), num3);
		int middleNumber = 0;

		for (int i = 0; i < numberList.length; i++) {
			if (numberList[i] == largestNumber || numberList[i] == smallestNumber) {

			} else {
				middleNumber = numberList[i];
			}

		}

		if (middleNumber - smallestNumber == largestNumber - middleNumber) {
			return true;
		} else {
			return false;
		}

	}

}
