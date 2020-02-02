
public class FirstIndexOfANumber {
	
	private static int firstindex(int[] input, int x, int startIndex) {
		if (input[startIndex] == x) {
		return startIndex;
		}
		if (startIndex == input.length - 1) {
			return -1;
		}
		int smallans = firstindex(input,x,startIndex + 1);
		return smallans;
	}
	
	public static int firstindex(int [] input, int x) {
		return firstindex(input, x, 0);
	}

	public static void main(String[] args) {
		int[] arr = {9,0,8,10,8};
		System.out.println(firstindex(arr,10));
	}

}
