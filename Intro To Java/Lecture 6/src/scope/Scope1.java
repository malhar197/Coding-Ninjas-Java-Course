package scope;

public class Scope1 {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		if(i == 10) {
			int n = 23;
			System.out.println(n);
		}
		
		int n = 343;
		System.out.println(n);
	}

}
