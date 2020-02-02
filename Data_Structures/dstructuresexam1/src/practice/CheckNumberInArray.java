package practice;

public class CheckNumberInArray {
	
	public static boolean checknum(int[] arr, int x, int index) {
		if ( index >= arr.length) {
			return false;
		}
		if (arr[index] == x) {
			return true;
		}
		boolean smallans = checknum(arr,x,index+1);
		if(smallans == true) {
			return smallans;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		System.out.println(checknum(arr,8,0));

	}

}
