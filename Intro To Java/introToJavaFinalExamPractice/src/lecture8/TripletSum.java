package lecture8;

public class TripletSum {
	
	public static void tripletsum(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i; j < arr.length; j++) {
				
				if ( j == i) {
					continue;
				}
				
				for (int k = j; k < arr.length; k++) {
					
					if ( k == j) {
						continue;
					}
					if (arr[i] + arr[j] + arr[k] == x) {
						if(arr[i] <= arr[j] && arr[i] <= arr[k]) {
							if(arr[j] <= arr[k]) {
								System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
							}
							else {
								System.out.println(arr[i] + " " + arr[k] + " " + arr[j]);
							}
						}
						else if(arr[j] <= arr[i] && arr[j] <= arr[k]) {
							if (arr[i] <= arr[k]) {
								System.out.println(arr[j] + " " + arr[i] + " " + arr[k]);
							}
							else {
								System.out.println(arr[j] + " " + arr[k] + " " + arr[i]);
							}
						}
						else if(arr[k] <= arr[i] && arr[k] <= arr[j]) {
							if (arr[i] <= arr[j]) {
								System.out.println(arr[k] + " " + arr[i] + " " + arr[j]);
							}
							else {
								System.out.println(arr[k] + " " + arr[j] + " " + arr[i]);
							}
						}
					}
						
					}
				}
			}
		}
	

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		tripletsum(arr,12);

	}

}
