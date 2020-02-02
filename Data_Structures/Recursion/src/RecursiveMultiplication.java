
public class RecursiveMultiplication {
	
	public static int multiplyTwoIntegers(int m, int n) {
		if (n <= 0) {
			return 0;
		}
		int smallans = multiplyTwoIntegers(m,n-1);
		smallans = smallans + m;
		return smallans;
	}

	public static void main(String[] args) {
		System.out.println(multiplyTwoIntegers(1,17));
	}

}
