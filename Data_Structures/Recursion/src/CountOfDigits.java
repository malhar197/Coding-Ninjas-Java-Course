
public class CountOfDigits {
	
	public static int count(int n){
		if(n/10 == 0){
			return 1;
		}
		int smallAns = count(n / 10);
		return smallAns+1;
	}

	public static void main(String[] args) {
		System.out.println(count(156));

	}

}
