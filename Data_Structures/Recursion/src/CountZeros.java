
public class CountZeros {
	
	public static int countZerosRec(int input) {
		if (input == 0) {
			return 0;
		}
		int smallans = countZerosRec((input/10));
		if(input % 10 == 0) {
			smallans = smallans + 1;
		}
		return smallans;
	}

	public static void main(String[] args) {
		int n = 10204;
		System.out.println(countZerosRec(n));

	}

}
