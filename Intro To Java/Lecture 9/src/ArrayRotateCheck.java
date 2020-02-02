
public class ArrayRotateCheck {
	
	public static int rotatecheck( int[] arr) {
		int rotate = 0;
		int last = arr.length - 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[last]){
                for (int j = i; j < last; j++){
                    if ( arr[j] > arr[i]){
                        rotate = rotate + 1;
                        break;
                    }
                }    
            }
			if(arr[last] < arr[i]) {
				rotate = rotate + 1;
			}
		}
		return rotate;
	}

	public static void main(String[] args) {
		int[] arr = {3,6,8,9,3};
		System.out.println(rotatecheck(arr));

	}

}
