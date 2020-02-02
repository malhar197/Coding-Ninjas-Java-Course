import java.util.Scanner;

public class QuickSort {
	
	public static int partition(int arr[], int sI, int eI)
    {
          int pivot = arr[eI];  
        int i = (sI-1); // index of smaller element 
        for (int j=sI; j<eI; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] <= pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[eI]; 
        arr[eI] = temp; 
  
        return i+1; 
    }
	
private static void quickSort(int[] input, int start, int end) {
		if (start >= end) {
			return;
		}
		
		int pivpos = partition(input,start,end);
		quickSort(input,start,pivpos - 1);
		quickSort(input,pivpos + 1, end);
		
		
	}

public static void quickSort(int[] input) {
	quickSort(input,0,input.length - 1);
}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		quickSort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
