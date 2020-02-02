package vehicle;

public class Vehicle {
	String color;
	private int maxSpeed;
	
	public int getMaxspeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void print() {
		System.out.println("vehicle color : " + color);
		System.out.println("max speed : " + maxSpeed);
	}
	
}
