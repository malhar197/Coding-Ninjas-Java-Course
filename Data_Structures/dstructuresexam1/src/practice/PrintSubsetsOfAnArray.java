package practice;

public class PrintSubsetsOfAnArray {
	
	public static void printsubs(int[] arr) {
		int[] newarr = new int[arr.length - 1];
		if (newarr.length <= 0) {
			return;
		}
		for(int i = 1; i < arr.length; i++) {
			newarr[i - 1] = arr[i];
		}
		printsubs(newarr);
		for (int i = 0; i < newarr.length; i++) {
			System.out.println(newarr[i] + " " + arr[0]);
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {15,20,12};
		printsubs(arr);

	}

}
