package dynamic_array;

public class Polynomial {
	
	private int[] coefficients;
	private int lastIndex;
	
	public Polynomial() {
		coefficients = new int [5];
		lastIndex = 0;
	}
	
	private void restructureto(int n) {
		int temp[] = coefficients;
		if (n < coefficients.length) {
			return;
		}
		else {
			coefficients = new int [n];
			for (int i = 0; i < temp.length; i++) {
				coefficients[i] = temp[i];
			}
		}
	}
	
	

	public void setCoefficient(int degree, int coeff) {
		if (degree > coefficients.length) {
			restructureto(degree + 1);
		}
		coefficients[degree] = coeff;
	}
	
	public Polynomial add(Polynomial p) {
		if (this.coefficients.length > p.coefficients.length) {
			p.restructureto(this.coefficients.length);
			
		} else {
			this.restructureto(p.coefficients.length);
		}
			for (int i = 0; i < p.coefficients.length; i++) {
				this.coefficients[i] = this.coefficients[i] + p.coefficients[i];
			}
			
		return this;
	}
	
	public Polynomial subtract(Polynomial p) {
		if (this.coefficients.length > p.coefficients.length) {
			p.restructureto(this.coefficients.length);
			
		} else {
			this.restructureto(p.coefficients.length);
		}
			for (int i = 0; i < p.coefficients.length; i++) {
				this.coefficients[i] = this.coefficients[i] - p.coefficients[i];
			}
			
		return this;
	}
	
	public void print() {
		for (int i = 0; i < this.coefficients.length; i++) {
			if (this.coefficients[i] == 0) {
				continue;
			}
			else {
				System.out.print(this.coefficients[i] + "x" + i + " ");
			}
		}
	}
	
	private int lastnonzero() {
		int last = 0;
		for (int i = 0; i < this.coefficients.length; i++) {
			if (this.coefficients[i] != 0) {
				last = i;
			}
		}
		return last;
	}


	public Polynomial multiply(Polynomial p) {
		int[] temp = new int[this.lastnonzero() + p.lastnonzero() + 1];
		for (int i = 0; i <= this.lastnonzero(); i++) {
			if (this.coefficients[i] == 0) {
				continue;
			} else {
				for (int j = 0; j <= p.lastnonzero(); j++) {
					if(p.coefficients[j] == 0) {
						continue;
					}
					else {
						temp[i + j] = temp[i+j] + (this.coefficients[i] * p.coefficients[j]);
					}
				}
			}
		}
		this.restructureto(temp.length);
		for (int i = 0; i < temp.length; i++) {
			this.coefficients[i] = temp[i];
		}
		return this;
		
		
	}
}
