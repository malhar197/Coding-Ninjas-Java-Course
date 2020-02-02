
public class StringToInteger {
	
	public static int convertStringToInt(String input) {
		if (input.length() == 1) 
            return (input.charAt(0) - '0'); 
  
       
        double y = convertStringToInt(input.substring(1)); 
  
         
        double x = input.charAt(0) - '0'; 
  
        
        x = x * Math.pow(10, input.length() - 1) + y; 
        return (int)(x); 
	}
	

	public static void main(String[] args) {
		String i = "1234";
		System.out.println((convertStringToInt(i)));

	}

}
