package practice;

public class SumOfDigits {
	
	public static int digitsum(int n) {
		if (n <= 0) {
			return 0;
		}
		int smallans = digitsum(n/10);
		return smallans + (n % 10);
	}

	public static void main(String[] args) {
		System.out.println(digitsum(12345));

	}

}
