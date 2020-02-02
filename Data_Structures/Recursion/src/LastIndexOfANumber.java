
public class LastIndexOfANumber {
	
	private static int lastIndex(int[] input, int x, int startIndex) {
		if (startIndex > input.length - 1) {
			return -1;
		}
		int smallans = lastIndex(input,x,startIndex + 1);
		if (input[startIndex] == x) {
			if (smallans != -1) {
				return smallans;
			}
			return startIndex;
		}
		return smallans;
	}
	
	public static int lastIndex(int [] input, int x) {
		return lastIndex(input, x, 0);
	}

	public static void main(String[] args) {
		int[] arr = {9,0,8,10,8};
		System.out.println(lastIndex(arr,8));

	}

}
