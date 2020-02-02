
public class GeometricSum {
	
	public static double findGeometricSum(int k) {
		if (k == 0) {
			return 1;
		}
		double smallans = findGeometricSum(k-1);
		double ans = Math.pow(0.5, k) + smallans;
		return ans;
	}

	public static void main(String[] args) {
		int n = 3;
		System.out.println(findGeometricSum(n));

	}

}
