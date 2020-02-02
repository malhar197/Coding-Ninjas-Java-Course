package polynomials;


public class Polynomial {

	private int[] polynoms;
	private int nextIndex;
	
	public Polynomial() {
		polynoms = new int[5];
		nextIndex = 0;
	}
	
	public int size() {
		return nextIndex;
	}
	
	public void setCoefficient(int degree, int coeff ) {
		if (degree >= polynoms.length) {
			restructure();
		}
		polynoms[degree] = coeff;
		nextIndex = polynoms.length;
	}
	
	public Polynomial add(Polynomial p2){
		if (this.size() > p2.size()) {
			for (int i = 0; i < this.size() - 1; i++) {
				if (i > p2.size()) {
					continue;
				}
				else {
				this.setCoefficient(i, this.polynoms[i] + p2.polynoms[i]);
				}
			}
		}
			else {
				
				for (int i = 0; i < p2.size() - 1; i++) {
					if (i > this.size()) {
						continue;
					} else {
					this.setCoefficient(i, this.polynoms[i] + p2.polynoms[i]);
					}
				}
				
			}
		return this;
	}
	
	public int lastnonzero() {
		int last = 0;
		for (int i = 0; i < this.size(); i++) {
			if (polynoms[i] != 0) {
				last = i;
			}
		}
		return last;
	}
	
	public void print() {
		for (int i = 0; i < this.size(); i++) {
			if (polynoms[i] == 0) {
				continue;
			}
			if (i == this.lastnonzero()) {
				System.out.print(polynoms[i]+"x"+i);
				continue;
			}
			System.out.print(polynoms[i]+"x"+i+ " ");
			
		}
	}
	
	private void restructure() {
		int temp[] = polynoms;
		polynoms = new int[polynoms.length * 2];
		for (int i = 0; i < temp.length; i++) {
			polynoms[i] = temp[i];
		}
	}
	
}
