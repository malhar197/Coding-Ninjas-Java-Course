package lecture7;

public class FibonacciCheck {
	
	public static boolean checkfib(int n) {
		int i = 1;
		int j = 1;
		int k = i + j;
		while (i <= n) {
			if (n == i) {
				return true;
			}
			i = j;
			j = k;
			k = i + j;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(checkfib(12));

	}

}
