package lecture8;

public class Sort01 {
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if ( arr[i] == 1) {
				for (int j = i; j < arr.length; j++) {
					if (arr[j] == 0) {
						arr[j] = 1;
						arr[i] = 0;
						break;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {0,0,1,0,1,0,1,0,0,1,0};
		sort(arr);
		print(arr);

	}

}
