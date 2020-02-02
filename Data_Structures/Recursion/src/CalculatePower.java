
public class CalculatePower {
	
	public static int power(int x, int n) {
		if (x == 0) {
			if ( n == 0) {
				return 1;
			}
			return 0;
		}
		if ( n == 0) {
			return 1;
		}
		if ( n == 1) {
			return x;
		}
		return power(x , n - 1) * x;
	}

	public static void main(String[] args) {
		System.out.println(power(0,1));

	}

}
