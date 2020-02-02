
public class SumOfDigitsRecursive {
	
	public static int sumOfDigits(int input) {
		if(input == 0) {
			return 0;
		}
		int ans = sumOfDigits(input/10);
		ans = ans + input % 10;
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(sumOfDigits(123));

	}

}
