package practice;

public class NumberOfDigits {
	
	public static int numdigits(int n) {
		if (n <= 0) {
			return 0;
		}
		int ans = 1;
		int smallans = numdigits(n/10);
		return smallans + ans;
	}

	public static void main(String[] args) {
		System.out.println(numdigits(1));

	}

}
