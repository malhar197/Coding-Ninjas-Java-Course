package practice;

public class QuickSort {
	
	private static int partition(int[] arr, int sI, int eI) {
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
	
	public static void quicksort(int[] arr,int start,int end) {
		if(start >= end) {
			return;
		}
		int pivpos = partition(arr,start,end);
		quicksort(arr,start,pivpos - 1);
		quicksort(arr,pivpos+1,end);
		
	}

	public static void main(String[] args) {
		int[] arr = {1,4,5,3,6,21,2,45,670,233,1356,90,76,9};
		quicksort(arr,0,arr.length - 1);
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
