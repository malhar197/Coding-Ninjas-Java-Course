package classes_and_objects;

public class Student {
	
	public String name;
	// final data members can be initialized as soon as they are declared.
	private final int rollnumber;
	
	private static int numstudents;
	
	public static int getnumstudents() {
		return numstudents;
	}
	
	public Student (String name, int rollnumber) {
		this.name = name;
		this.rollnumber = rollnumber;
		numstudents++;
	}
	
	
	
//	public void setrollnumber(int rn) {
//		if (rn <= 0) {
//			return;
//		}
//		rollnumber = rn;
//	}
	
	public int getrollnumber() {
		return rollnumber;
	}
	
	public void print() {
		System.out.print(name + " : " + rollnumber + " " );
	}

}
