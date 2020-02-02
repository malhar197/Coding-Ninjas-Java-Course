package lecture9;

public class CheckArrayRotation {
	
	public static int checkrotation(int[] arr) {
		int deg = 0;
		int last = arr[arr.length - 1];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > last) {
				deg++;
			}
		}
		return deg;
	}

	public static void main(String[] args) {
		int[] arr = {5,6,1,2,3,4};
		System.out.println(checkrotation(arr));

	}

}
