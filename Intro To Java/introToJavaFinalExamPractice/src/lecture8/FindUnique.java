package lecture8;

public class FindUnique {
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int findunique(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			
			for(int j = i ; j < arr.length; j++) {
				
				if (arr[j] == arr[i] && j != i) {
					break;
				}
				if ( j == arr.length - 1) {
					return arr[i];
				}
				
				}
				
			}
		
			return Integer.MAX_VALUE;
		}
		
		
		
		

	public static void main(String[] args) {
		int[] arr = {5,5,6,6,4,1,1};
		System.out.println(findunique(arr));

	}

}
