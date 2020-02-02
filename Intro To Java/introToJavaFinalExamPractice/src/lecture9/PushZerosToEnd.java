package lecture9;

public class PushZerosToEnd {
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void push(int[] arr) {
		for (int i = 0; i < arr.length; i ++) {
			if ( arr[i] == 0) {
				for (int j = i + 1; j < arr.length; j++) {
					if ( arr[j] != 0) {
						int temp = arr[j];
						arr[j] = 0;
						arr[i] = temp;
						break;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {2,0,4,1,3,0,28,0,5,6,0,0,33,4,0,6,0,7,0,9};
		push(arr);
		print(arr);

	}

}
