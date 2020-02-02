
public class SumOfArray {
	
	public static int sum(int[] input) {
		if(input.length == 1) {
			return input[0];
		}
		if (input.length == 0) {
			return 0;
		}
		int[] smallinput = new int[input.length - 1];
		for (int i = 1; i < input.length; i++) {
			smallinput[i - 1] = input[i];
		}
		int smallans = sum(smallinput) + input[0];
		return smallans;
	}

	public static void main(String[] args) {
		int[] arr = {9,8,9};
		System.out.println(sum(arr));

	}

}
