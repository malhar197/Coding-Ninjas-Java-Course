
public class PushZerosToEnd {
	
	public static void pushzerostoend(int[] arr) {
		int nz = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] != 0 && i == nz) {
				i++;
				nz++;
				continue;
			}
			if (arr[i] != 0 && i > nz) {
				arr[nz] = arr[i];
				arr[i] = 0;
				nz++;
			}
			i++;
			
		}
		
		}

	public static void main(String[] args) {
		int[] arr = {3,0,0,4,0,9,4,0,1,2,0,5,0,6,0,5,0,0,7,0,7};
		pushzerostoend(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
