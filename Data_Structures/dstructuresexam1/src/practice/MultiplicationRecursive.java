package practice;

public class MultiplicationRecursive {
	
	public static int multiply(int m ,int n) {
		if (n <= 0) {
			return 0;
		}
		return multiply(m,n - 1) + m;
	}

	public static void main(String[] args) {
		System.out.println(multiply(3,5));

	}

}
