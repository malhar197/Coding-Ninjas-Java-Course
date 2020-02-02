package practice;

public class CalculatePower {
	
	public static int power(int x, int n) {
		if ( n == 0) {
			return 1;
		}
		int ans = x;
		int smallans = power(x,n-1);
		return ans * smallans;
		
	}

	public static void main(String[] args) {
		System.out.println(power(3, 4));

	}

}
