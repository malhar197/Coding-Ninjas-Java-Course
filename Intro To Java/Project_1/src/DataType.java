
public class DataType {

	public static void main(String[] args) {
		char c = 'a' ;
		System.out.println (c+3); //valid because all characters have an integer associated with them. See ASCII table.
		
		int i = c + 10;
		System.out.println(i); // Same principle applies.
		
		i = c;
		//char abc = i;
		// Above is not valid because integer cannot be converted into character. (int has 4 bytes while char has only 2 bytes.)
		
		long l = i; // valid. Same principle.
		//i = l; //not valid because long has more bytes than int.
		
		double d = i; //valid. Same principle.
		//i = d; // Not valid. double has more bytes than int.
		
		int j = 100;
}
}