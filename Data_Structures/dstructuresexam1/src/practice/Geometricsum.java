package practice;

public class Geometricsum {
	
	public static double returnsum(int k) {
		if (k == 0) {
			return 1;
		}
		double smallans = returnsum(k - 1);
		double ans = 1;
		for (int i = 0; i < k; i++) {
			ans = ans * 0.5;
		}
		return smallans + ans;
		
	}

	public static void main(String[] args) {
		System.out.println(returnsum(3));

	}

}
