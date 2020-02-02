package practice;

public class CountZeros {
	
	public static int countzeros(int n) {
		if (n <= 0) {
			return 0;
		}
		int smallans = countzeros(n/10);
		if (n % 10 == 0) {
			return smallans + 1;
		}
		return smallans;
	}

	public static void main(String[] args) {
		System.out.println(countzeros(102040));

	}

}
