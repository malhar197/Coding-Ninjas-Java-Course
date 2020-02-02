package complex_numbers;

public class ComplexNumbers {
	
	private int real;
	private int imaginary;
	
	public ComplexNumbers(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
//	public int getImaginary(){
//		return imaginary;
//	}
//	
//	public int getReal() {
//		return real;
//	}
//	
//	public void setReal(int real) {
//		this.real = real;
//	}
	
//	public void setImaginary(int imaginary) {
//		this.imaginary = imaginary;
//	}
	public void print() {
		if (imaginary >= 0) {
		System.out.println(real + " + " + "i" + imaginary);
		}
		else {
			int i = -1 *imaginary;
			System.out.println(real + " - " +"i" + i);
		}
	}
	
	public void plus(ComplexNumbers c2) {
		real = real + c2.real;
		imaginary = imaginary + c2.imaginary;
	}
	
	public void multiply(ComplexNumbers c2) {
		int r = real;
		int i = imaginary;
		real = r * c2.real - (i * c2.imaginary);
		imaginary = (i * c2.real) + (r * c2.imaginary) ;
	}
	
	public ComplexNumbers conjugate() {
		ComplexNumbers conjugate = new ComplexNumbers(this.real, -1 * this.imaginary);
		return conjugate;
	}
	
	public static ComplexNumbers add(ComplexNumbers c1, ComplexNumbers c2) {
		ComplexNumbers sum = new ComplexNumbers(c1.real + c2.real, c1.imaginary + c2.imaginary);
		return sum;
	}
	

}
