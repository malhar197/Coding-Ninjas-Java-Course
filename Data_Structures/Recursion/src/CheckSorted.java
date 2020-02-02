
public class CheckSorted {
	
	public static boolean checksorted(int input[]) {
		
		if(input.length <=1) {
			return true;
		}
		int smallInput[] = new int[input.length - 1];
		for (int i = 1; i < input.length; i++) {
			smallInput[i - 1] = input[i];
		}
		boolean smallAns = checksorted(smallInput);
		if (!smallAns) {
			return false;
		}
		if(input[0] <= input[1]) {
			return true;
		} else {
			return false;
		}
		
	}
	
	// This functions checks if the array is sorted from startIndex to end
	public static boolean checksortedbetter(int input[],int startIndex) {
		if(startIndex >= input.length - 1) {
			return true;
		}
		if(input[startIndex] > input[startIndex + 1]) {
			return false;
		}
		boolean smallans = checksortedbetter(input,startIndex + 1);
		return smallans;
			
	}

	public static void main(String[] args) {
		int input[] = {1,2,3};
		System.out.println(checksorted(input));

	}

}
