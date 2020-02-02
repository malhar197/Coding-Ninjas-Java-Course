
public class PairStar {
	
	private static String addStars(String s,String output,int i) {
		// Append current character 
	    output = output + s.charAt(i); 
	  
	    // If we reached last character 
	    if (i == s.length() - 1) 
	        return output; 
	  
	    // If next character is same,  
	    // append '*' 
	    if (s.charAt(i) == s.charAt(i+1))  
	        output = output + '*';      
	  
	   String smallans = addStars(s,output, i+1);
	   return smallans;
	}

	public static void main(String[] args) {
		String s = "hello";
		String output = "";
		System.out.println(addStars(s,output,0));
		

	}

}
