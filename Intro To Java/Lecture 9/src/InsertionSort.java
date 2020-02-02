
public class InsertionSort {
	
	public static void insertionsort (int arr[]) {
		
		for(int i = 1; i <= arr.length - 1; i++) {
			int temp = arr[i];
			for(int j = i - 1; j >= 0; j--) {
				if (temp < arr[j]) {
					arr[j + 1] = arr[j] ;
					arr[j] = temp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		int [] arr = {6,4,3,5,2,1,9};

		insertionsort(arr);
		
		for( int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
