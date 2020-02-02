
public class CheckNumberInArray {
	
	public static boolean checkNumber(int[] input, int x) {
		if (input.length == 0) {
			return false;
		}
		if (input[0] == x) {
			return true;
		}
		int[] smallinput = new int[input.length - 1];
		for (int i = 1; i < input.length; i++) {
			smallinput[i - 1] = input[i];
		}
		boolean smallans = checkNumber(smallinput,x);
		if (smallans == true) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		
		int[] arr = {9,8,10};
		System.out.println(checkNumber(arr,12));

	}

}
